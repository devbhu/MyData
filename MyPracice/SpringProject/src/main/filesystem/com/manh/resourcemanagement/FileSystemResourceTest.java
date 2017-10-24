package com.manh.resourcemanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.autowiring.beans.AutoDetectTest;
import com.test.autowiring.beans.Customer;

public class FileSystemResourceTest {

	
	public static void main(String[] args) {
		
		ApplicationContext parent = new ClassPathXmlApplicationContext("test/bean/autowiring/beans1.xml");
		
		ApplicationContext  child =new ClassPathXmlApplicationContext(new String[]{"test/bean/autowiring/beans.xml"},parent); 
		
		System.out.println(child.getBean("dependencyCheck", Customer.class));
		//System.out.println(container.getBean("person1", Customer.class));
	}
	
}
