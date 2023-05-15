package com.bigdata.api.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bigdata.api.exception.BadRequestException;
import com.bigdata.api.exception.ConflictException;
import com.bigdata.api.exception.ETagParseException;
import com.bigdata.api.exception.ResourceNotFoundException;
import com.bigdata.api.model.AuthenticationResponse;
import com.bigdata.api.model.AuthenticationUser;
import com.bigdata.api.model.ErrorResponse;
import com.bigdata.api.service.PlanService;
import com.bigdata.api.util.JwtUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

@RestController
public class PlanController {
	
	@Autowired
	 private PlanService planService;
	
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@GetMapping("/check")
	public String check() {
		return "Up and running";
	}
	
    @GetMapping("/token")
    public ResponseEntity<AuthenticationResponse> generateToken() {
        String token = jwtUtil.generateToken();
        return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse(token), HttpStatus.CREATED);
    }
	
	
	 @PostMapping(value="/plan", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<?> save(@RequestBody String planObject) throws IOException{
	        if (planObject == null || planObject.isBlank()) throw new BadRequestException("Request body is missing!");

	        JSONObject plan = new JSONObject(planObject);
	        JSONObject schemaJSON = new JSONObject(new JSONTokener(Objects.requireNonNull(PlanController.class.getResourceAsStream("/payloadschema.json"))));
	        Schema schema = SchemaLoader.load(schemaJSON);
	        try {
	            schema.validate(plan);
	        } catch (ValidationException e) {
	            throw new BadRequestException(e.getMessage());
	        }

	        String key = "plan:" + plan.getString("objectId");
	        if (planService.isKeyPresent(key)) throw new ConflictException("Plan already exists!");

	        String eTag = planService.createPlan(plan, key);

	        // Send a message to queue for indexing
	        Map<String, String> message = new HashMap<String, String>();
	        message.put("operation", "SAVE");
	        message.put("body", planObject);

	        System.out.println("Sending message: " + message);
	        //template.convertAndSend(DemoApplication.queueName, message);

	        HttpHeaders headersToSend = new HttpHeaders();
	        headersToSend.setETag(eTag);

	        return new ResponseEntity<String>("{\"objectId\": \"" + plan.getString("objectId") + "\"}", headersToSend, HttpStatus.CREATED);
	      
	    }
	 
	    @GetMapping(value = "/{objectType}/{objectId}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<?> getPlan(@PathVariable String objectId,
	                                     @PathVariable String objectType,
	                                     @RequestHeader HttpHeaders headers) {
	        String key = objectType + ":" + objectId;
	        if (!planService.isKeyPresent(key)) throw new ResourceNotFoundException("Object not found!");

	        // Check if the ETag provided is not corrupt
	        List<String> ifNoneMatch;
	        try {
	            ifNoneMatch = headers.getIfNoneMatch();
	        } catch (Exception e) {
	            throw new ETagParseException("ETag value invalid! Make sure the ETag value is a string!");
	        }

	        String eTag = planService.getETag(key);
	        
	        HttpHeaders headersToSend = new HttpHeaders();
	        headersToSend.setETag(eTag);


	        if (objectType.equals("plan") && ifNoneMatch.contains(eTag))
	            return new ResponseEntity<Object>(null, headersToSend, HttpStatus.NOT_MODIFIED);

	        Map<String, Object> objectToReturn = planService.getPlan(key);

	        if (objectType.equals("plan"))
	            return new ResponseEntity<Map<String, Object>>(objectToReturn, headersToSend, HttpStatus.OK);

	        return new ResponseEntity<Map<String, Object>>(objectToReturn, HttpStatus.OK);
	    }
	    
	    @DeleteMapping("/{objectType}/{objectId}")
	    public ResponseEntity<?> deletePlan(@PathVariable String objectId,
	                                        @PathVariable String objectType,
	                                        @RequestHeader HttpHeaders headers) {
	        String key = objectType + ":" + objectId;
	        if (!planService.isKeyPresent(key)) throw new ResourceNotFoundException("Plan not found!");

	        String eTag = planService.getETag(key);
	        List<String> ifMatch;
	        try {
	            ifMatch = headers.getIfMatch();
	        } catch (Exception e) {
	            throw new ETagParseException("ETag value invalid! Make sure the ETag value is a string!");
	        }

	        if (ifMatch.size() == 0) throw new ETagParseException("ETag is not provided with request!");
	        //if (!ifMatch.contains(eTag)) return preConditionFailed(eTag);

	        // Send message to queue for deleting indices
	        Map<String, Object> plan = planService.getPlan(key);
	        Map<String, String> message = new HashMap<String, String>();
	        message.put("operation", "DELETE");
	        message.put("body",  new JSONObject(plan).toString());

	        System.out.println("Sending message: " + message);
	        planService.deletePlan(key);
	        return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	    }
	    
	    @PutMapping(value = "/plan/{objectId}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<?> updatePlan(@PathVariable String objectId,
	                                        @RequestBody(required = false) String planObject,
	                                        @RequestHeader HttpHeaders headers) {
	        if (planObject == null || planObject.isBlank()) throw new BadRequestException("Request body is missing!");

	        JSONObject plan = new JSONObject(planObject);
	        String key = "plan:" + objectId;
	        if (!planService.isKeyPresent(key)) throw new ResourceNotFoundException("Plan not found!");

	        String eTag = planService.getETag(key);
	        List<String> ifMatch;
	        try {
	            ifMatch = headers.getIfMatch();
	        } catch (Exception e) {
	            throw new ETagParseException("ETag value invalid! Make sure the ETag value is a string!");
	        }

	        if (ifMatch.size() == 0) throw new ETagParseException("ETag is not provided with request!");
	        if (!ifMatch.contains(eTag)) return preConditionFailed(eTag);

	        JSONObject schemaJSON = new JSONObject(new JSONTokener(Objects.requireNonNull(PlanController.class.getResourceAsStream("/payloadschema.json"))));
	        Schema schema = SchemaLoader.load(schemaJSON);
	        try {
	            schema.validate(plan);
	        } catch (ValidationException e) {
	            throw new BadRequestException(e.getMessage());
	        }
	        // Send message to queue for deleting previous indices incase of put
	        Map<String, Object> oldPlan = planService.getPlan(key);
	        Map<String, String> message = new HashMap<String, String>();
	        message.put("operation", "DELETE");
	        message.put("body", new JSONObject(oldPlan).toString());

	        System.out.println("Sending message: " + message);
	        

	        planService.deletePlan(key);
	        String updatedETag = planService.createPlan(plan, key);

	        // Send message to queue for index update
	        Map<String, Object> newPlan = planService.getPlan(key);
	        message = new HashMap<String, String>();
	        message.put("operation", "SAVE");
	        message.put("body", new JSONObject(newPlan).toString());

	        System.out.println("Sending message: " + message);
	       

	        HttpHeaders headersToSend = new HttpHeaders();
	        headersToSend.setETag(updatedETag);
	        return new ResponseEntity<String>("{\"message\": \"Plan updated successfully\"}",
	                headersToSend,
	                HttpStatus.OK);
	    }

	    @PatchMapping(value = "/{objectType}/{objectId}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<?> patchPlan(@PathVariable String objectId,
	                                       @RequestBody(required = false) String planObject,
	                                       @RequestHeader HttpHeaders headers) {
	        if (planObject == null || planObject.isBlank()) throw new BadRequestException("Request body is missing!");

	        JSONObject plan = new JSONObject(planObject);
	        String key = "plan:" + objectId;
	        if (!planService.isKeyPresent(key)) throw new ResourceNotFoundException("Plan not found!");

	        String eTag = planService.getETag(key);
	        List<String> ifMatch;
	        try {
	            ifMatch = headers.getIfMatch();
	        } catch (Exception e) {
	            throw new ETagParseException("ETag value invalid! Make sure the ETag value is a string!");
	        }

	        if (ifMatch.size() == 0) throw new ETagParseException("ETag is not provided with request!");
	        if (!ifMatch.contains(eTag)) return preConditionFailed(eTag);

	        String updatedEtag = planService.createPlan(plan, key);

	        // Send message to queue for index update
	        Map<String, String> message = new HashMap<String, String>();
	        message.put("operation", "SAVE");
	        message.put("body", planObject);

	        System.out.println("Sending message: " + message);
	       
	        return ResponseEntity.ok()
	                .eTag(updatedEtag)
	                .body(new JSONObject().put("message: ", "Plan updated successfully!!").toString());
	    }

	    private ResponseEntity preConditionFailed(String eTag) {
	        HttpHeaders headersToSend = new HttpHeaders();
	        headersToSend.setETag(eTag);
	        ErrorResponse errorResponse = new ErrorResponse(
	                "Plan has been updated",
	                HttpStatus.PRECONDITION_FAILED.value(),
	                new Date(),
	                HttpStatus.PRECONDITION_REQUIRED.getReasonPhrase()
	        );
	        return new ResponseEntity<ErrorResponse>(errorResponse, headersToSend, HttpStatus.PRECONDITION_FAILED);
	    }
    
    private static InputStream inputStreamFromClasspath(String path) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }
}
