package com.ncu.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{

	private String[] coursePrefixes;
	
	public void initialize(CourseCode courseCode) {
		// TODO Auto-generated method stub
		coursePrefixes = courseCode.value().split(",");
		
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result=false;
		
		if(value!=null) {
			for(String tempPrefix : coursePrefixes) {
				result = value.startsWith(tempPrefix);
			
			if(result==true) {
				break;
			}
		}
		}
		else {
			result=true;
		}
		
		return result;
	}

}
