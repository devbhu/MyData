package com.test.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.test.pojos.Company;

public class TestBeanWrapper {

	private static final String APPCTX_RESOURCE = "ValidationUsingSpring/com/test/resources/validator-resources.xml";

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				APPCTX_RESOURCE);

		Company company = context.getBean("company", Company.class);
           
		
		BeanWrapper bw = new BeanWrapperImpl(company);
		
		
		System.out.println("Company Name : "+bw.getPropertyValue("companyName"));
		
		System.out.println("Company Id : "+bw.getPropertyValue("companyId"));
		
		
		System.out.println("Company Address Country : "+bw.getPropertyValue("companyAddress.country"));
		
		System.out.println("Company Address State : "+bw.getPropertyValue("companyAddress.state"));
		
		System.out.println("Company Address City : "+bw.getPropertyValue("companyAddress.city"));
		
		System.out.println("Company Address id : "+bw.getPropertyValue("companyAddress.addressId"));
       
		System.out.println("Company Address Date  : "+bw.getPropertyValue("companyAddress.addressDate"));
		
		System.out.println("Address Indexed properties : "+bw.getPropertyValue("companyAddress.cities[0]"));
		
		System.out.println("Address Map Indexed properties : "+bw.getPropertyValue("companyAddress.citiesMap[Guwahati]"));

	}

}
