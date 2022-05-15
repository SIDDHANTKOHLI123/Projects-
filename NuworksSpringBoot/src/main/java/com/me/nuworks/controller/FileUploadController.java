package com.me.nuworks.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.me.nuworks.dao.FileUploadDAO;
import com.me.nuworks.dao.StudentDAO;
import com.me.nuworks.pojo.Student;
import com.me.nuworks.pojo.UploadFile;



@Controller
public class FileUploadController {
	 @Autowired
	    private FileUploadDAO fileUploadDao;
	 
	    @RequestMapping(value = "/user/student/resumeupload.htm", method = RequestMethod.GET)
	 public String showUploadForm(HttpServletRequest request) {
	    	HttpSession session= request.getSession();
            StudentDAO studentDao = new StudentDAO();
            int userId = (int) session.getAttribute("userid");
            System.out.println(userId);
            Student student = studentDao.getStudent(userId);
            session.setAttribute("student",student);
	  
     return "ResumeUpload";
   }
	     
	    @RequestMapping(value = "/user/student/doUpload.htm", method = RequestMethod.POST)
	    public String handleFileUpload(HttpServletRequest request,
	            @RequestParam("fileUpload") MultipartFile fileUpload) throws Exception {
	    	
	    	if(fileUpload.isEmpty()) {
	    		return "ResumeUpload";
	    	}
	           
	    	System.out.println("Saving file: ");
	        try {
	                System.out.println("Saving file: " + fileUpload.getOriginalFilename());
	                 HttpSession session= request.getSession();
	                 StudentDAO studentDao = new StudentDAO();
	                String resumeFilePath = fileUpload.getOriginalFilename();
	                System.out.println("resume uploaded"+ resumeFilePath);
	                int userId = (int) session.getAttribute("userid");
	                System.out.println(userId);
	                Student student = studentDao.getStudent(userId);
	                fileUpload.transferTo(new File("C:\\Users\\kohli\\Documents\\workspace-sts-3.9.11.RELEASE\\FinalProject\\src\\main\\webapp\\uploadedpdfs\\" + resumeFilePath));
	                student.setResumeFilePath(resumeFilePath);
                    studentDao.updateStudent(student);

	                //System.out.println("okkkkk") + uploadFile);
	                return "ResumeUploadSuccess";
	            }
	        catch(Exception e) {
	        	return "ResumeUpload";
	        
	        }
	  
	       
	    }   
}
