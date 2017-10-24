package com.test.jsr.beanvalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(value=ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=PhoneValidator.class)
public @interface PhoneNumber {

	String message() default "";
    
    Class<?>[] groups() default {};
     
    Class<? extends Payload>[] payload() default {};
	
}
