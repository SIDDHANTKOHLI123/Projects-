package com.me.nuworks.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.me.nuworks.pojo.Student;


@Component("userValidator")
public class UserValidator implements Validator {
	
	public boolean supports(Class aClass) {
		return aClass.equals(Student.class);
	}

	public void validate(Object obj, Errors errors) {
		Student user = (Student) obj;
		System.out.println("check1  " + user.getfName());
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fName", "error.invalid.fName", "First Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lName", "error.invalid.lName", "Last Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "error.invalid.userName", "User Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.invalid.email", "Email Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "courseName", "error.invalid.courseName", "Course Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "carAvail", "error.invalid.carAvail", "Car Availability Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobile", "error.invalid.mobile", "Mobile Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "linkedinUrl", "error.invalid.linkedinUrl", "Email Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "skypeID", "error.invalid.skypeID", "Course Name Required");

		
		// check if user exists		
	}

}
