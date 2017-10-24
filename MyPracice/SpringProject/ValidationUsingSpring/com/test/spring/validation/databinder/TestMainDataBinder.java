package com.test.spring.validation.databinder;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.validation.DataBinder;

import com.test.pojos.Company;

public class TestMainDataBinder {

	private static final String APPCTX_RESOURCE = "ValidationUsingSpring/com/test/resources/validator-resources.xml";

	public static void main(String[] args) {

		MutablePropertyValues pvs = new MutablePropertyValues();
		pvs.add("companyId", 541);
		pvs.add("companyName", "Manhattan Associates");
		pvs.add("phoneNumber", "080-902-32242");
		pvs.add("companyAddress.addressId", 567);
		pvs.add("companyAddress.addressDate", "2016/12/12");
		pvs.add("companyAddress.city", "Guwahati");
		pvs.add("companyAddress.country", "India");
		pvs.add("companyAddress.state", "Assam");

		ApplicationContext context = new FileSystemXmlApplicationContext(
				APPCTX_RESOURCE);

		Company company = context.getBean("company", Company.class);
		System.out.println("Before Company : " + company);
		System.out.println("Before Address : " + company.getCompanyAddress());
		// Creating the data binder instance by wrapping up the company
		// instance.Now what ever the property values are
		// provided from xml configuration will get overriden by the bind
		// values.The Company and Address both values will be overriden when we
		// call the bind() method.
		// New proprty values will be introduced to them.This will use
		// BeanWrapper to map the property values.
		DataBinder binder = new DataBinder(company);

		// This is used to bind the property values to the target object.
		binder.bind(pvs);

		System.out.println("After Company : " + company);
		System.out.println("After Address : " + company.getCompanyAddress());

		binder.setValidator(company.getCompanyValidator());

		// If you want to invoke the validation then call the validate() method
		// after setting the validator. We can even set multiple validators at
		// the same time by addValidators() method.
		binder.validate();

	}

}
