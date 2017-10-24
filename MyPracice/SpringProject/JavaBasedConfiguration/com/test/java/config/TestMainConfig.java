package com.test.java.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ResourceLoader;

public class TestMainConfig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/test/java/config/appCtx-context.xml");
		

		
        System.out.println(ac.getBean("helloWorld",HelloWorld.class));
		
	}

}
