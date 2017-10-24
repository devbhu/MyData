package com.test.spring.transaction.ItemDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainTransaction {

	private static final String APPLICATON_XML = "com/test/spring/transaction/application-context.xml";
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(APPLICATON_XML);
		ItemServiceImpl isimpl = ac.getBean("itemService",ItemServiceImpl.class);
		isimpl.constructItem();
	}
}
