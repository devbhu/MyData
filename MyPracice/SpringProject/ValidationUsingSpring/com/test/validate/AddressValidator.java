package com.test.validate;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.test.pojos.Address;

public class AddressValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return Address.class.equals(clazz);

	}

	@Override
	public void validate(Object target, Errors errors) {

		Address comp = (Address) target;
		
		//We are setting the nested path here because Erros instance is currently bind with the Company instance and the below city
		//field is in Address.
		errors.setNestedPath("companyAddress");

		ValidationUtils.rejectIfEmpty(errors, "city", "field.name");

		for (FieldError error : errors.getFieldErrors()) {

			for (String code : error.getCodes()) {

				String value = comp.getMessageSource().getMessage(code,
						new Object[]{comp.getCity()}, null, null);

				if (value != null) {

					System.out.println("Address Error message is :" + value);
					break;
				}
			}

		}
	}
}
