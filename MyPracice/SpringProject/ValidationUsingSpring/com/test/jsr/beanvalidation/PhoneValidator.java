package com.test.jsr.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<PhoneNumber, Object> {

	@Override
	public void initialize(PhoneNumber arg0) {
	  
		//System.out.println(arg0);
		
	}

	@Override
	public boolean isValid(Object arg0, ConstraintValidatorContext arg1) {
		System.out.println(arg0);
		return true;
	}



}
