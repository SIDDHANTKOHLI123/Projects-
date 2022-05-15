package com.me.nuworks.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.me.nuworks.config.BCryptPassword;
import com.me.nuworks.dao.UserDAO;
import com.me.nuworks.pojo.User;
import com.me.nuworks.pojo.enumTypes.Role;


@Controller

public class UserController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		 return new ModelAndView("home");
	}
	
	
	  @RequestMapping(value = "/user/login.htm", method = RequestMethod.POST)
	    public String handleLoginForm(HttpServletRequest request, UserDAO userDao, ModelMap map) {

	        String username = request.getParameter("userName");
	        String password = request.getParameter("password");
	        HttpSession httpSession =request.getSession(true);
			
	        //Encrypt password
		    BCryptPassword hasher = new BCryptPassword(7);
	        
	        try {
	        	User u;
	            //try{
	            	//u = userDao.get(username, hasher.hash(password));
	            //}catch(Exception e){
	            	u = userDao.getByUsername(username);
	            	if(!hasher.verifyHash(password, u.getPassword())) {						
	    				// ------------ User not found -------------
	    				//return new ResponseEntity<UsersData>(userService.userNotFound(), HttpStatus.BAD_REQUEST);
	    			//}
	            }
	            httpSession.setAttribute("userid", u.getId());
	            httpSession.setAttribute("username", u.getUserName());
	            if (u != null && u.getRole().equals(Role.Student)) {
	                return "dashboardStudent";
	            } 
	            else if (u != null && u.getRole().equals(Role.CoopFaculty)) {
	                return "dashboardCoop";
	            } 
	                else {
	                map.addAttribute("errorMessage", "Invalid username/password!");
	                return "error";
	            }
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        return "home";

	    }

}
