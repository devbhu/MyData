package com.test.messagesource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;

/**
 * Wrapper to handle the messagebundle.This class uses the spring's 
 * message bundle.
 * 
 * @author vickey
 *
 */
public class MessageBundle {
	
	@Autowired
	private  ApplicationContext context;

	public  MessageSource getMessage() {
		
		System.out.println("Context is : "+context);
		return context;
	}
	
	public  MessageBundle getInstance(){
		
		return context.getBean("messageBundle",MessageBundle.class);
		
	}

	
}
