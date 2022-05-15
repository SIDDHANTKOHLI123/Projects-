package com.me.nuworks.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.me.nuworks.pojo.Applications;


@Component("appValidator")
public class ApplicationValidator implements Validator {

	@Override
	public boolean supports(Class aClass) {
		return aClass.equals(Applications.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Applications ap = (Applications) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "technicalSkills", "error.invalid.technicalSkills", "Technical Skills Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "workExperience", "error.invalid.workExperience", "Work Experience Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "currentUniversity", "error.invalid.currentUniversity", "Current University Required");


	}

}
