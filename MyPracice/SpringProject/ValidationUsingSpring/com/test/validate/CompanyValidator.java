package com.test.validate;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.test.pojos.Company;

public class CompanyValidator implements Validator {
	
	@Autowired
	AddressValidator addressvalidator;

	@Override
	public boolean supports(Class<?> clazz) {

		return Company.class.equals(clazz);

	}

	@Override
	public void validate(Object target, Errors errors) {

		Company comp = (Company) target;

		ValidationUtils.rejectIfEmpty(errors, "companyName", "field.name");

		for (FieldError error : errors.getFieldErrors()) {

			for (String code : error.getCodes()) {

				String value = comp.getMessageSource().getMessage(code,
						new Object[]{comp.getCompanyName()}, null, null);

				if (value != null) {

					System.out.println("Error message is :" + value);
                    break;
				}
			}

		}
		
		ValidationUtils.invokeValidator(addressvalidator, comp.getCompanyAddress(), errors);
	}
}
