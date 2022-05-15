package com.me.nuworks.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.me.nuworks.dao.ApplicationDAO;
import com.me.nuworks.dao.CoopDAO;
import com.me.nuworks.dao.JobDAO;
import com.me.nuworks.dao.StudentDAO;
import com.me.nuworks.exception.ApplicationException;
import com.me.nuworks.pojo.Applications;
import com.me.nuworks.pojo.CoopFaculty;
import com.me.nuworks.pojo.Job;
import com.me.nuworks.pojo.Student;


@Controller
public class AjaxController {

	@Autowired
	@Qualifier("appDao")
	ApplicationDAO appDao;
	
	@Autowired
	@Qualifier("jobDao")
	JobDAO jobDao;
	
	@Autowired
	@Qualifier("coopDao")
	CoopDAO coopDao;
	
	@Autowired
	@Qualifier("studentDao")
	StudentDAO studentDao;
	
	@RequestMapping(value = "*/ajaxservice.htm", method = RequestMethod.POST)
    @ResponseBody
    public String ajaxService(HttpServletRequest request) throws ApplicationException
    {	System.out.println("hElo Ajax");
    String ao = null;
        String queryString = request.getParameter("search");
        if(queryString.equals("Applications")) {
        	ArrayList<Applications> a = appDao.getByJob();
        	ao = Integer.toString(a.size());
        }
        if(queryString.equals("Students")) {
        	ArrayList<Student> a = studentDao.getAll();
        	ao = Integer.toString(a.size());
        }
        if(queryString.equals("Jobs")) {
        	ArrayList<Job> a = jobDao.get();
        	ao = Integer.toString(a.size());
        }
        if(queryString.equals("Faculty")) {
        	ArrayList<CoopFaculty> a = coopDao.getAll();
        	ao = Integer.toString(a.size());
        }
        
        
        
        return ao;
    }
	
	
}
