package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomCodeConstraintValidator implements ConstraintValidator<CustomCode, String> {

	private String customPrefix;
	
	@Override
	public void initialize(CustomCode theCustomCode) {
		customPrefix = theCustomCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result  = theCode.startsWith(customPrefix);
		
		if (theCode != null) {
			result = theCode.startsWith(customPrefix);
		}
		
		return result;
	}

}
