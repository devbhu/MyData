package com.test.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.test.autowiring.beans.Customer;
import com.test.pojos.TestBeanPojo;
import com.test.pojos.TestBeanPojo1;
import com.test.pojos.TestBeanPojo2;
import com.test.pojos.TestBeanPojo3;

public class TestIocMain {

	private static final String RESOURCE_FILE = "/test/pso/resource/container/application-context.xml";

	public static void main(String[] args) {
          
         //ApplicationContext parent = new ClassPathXmlApplicationContext(RESOURCE_FILE);

		ApplicationContext child = new ClassPathXmlApplicationContext(new String[]{"test/bean/autowiring/beans1.xml"});
		
		  TestBeanPojo obj = child.getBean("test1",TestBeanPojo.class);
		 System.out.println(obj.getMap());
		 System.out.println(obj.getArrays().length);
		 System.out.println(obj.createProtoInstance());
		 System.out.println(obj.createProtoInstance());
		 System.out.println(obj.createProtoInstance());
		 
	     System.out.println(obj.fun("arindam"));	
       // child.registerShutdownHook();
/*		TestBeanPojo2 pojo= child.getBean("com.test.pojos.TestBeanPojo3",TestBeanPojo2.class);
		//TestBeanPojo3 pojo1= child.getBean("demoTest1",TestBeanPojo3.class);

     System.out.println(pojo.getName());
     System.out.println(pojo.getAge());
     System.out.println(pojo.getRollNo());*/
     
    /* ApplicationContext ac = new FileSystemXmlApplicationContext("F:\\jsf\\SpringProject\\src\\main\\resources\\test\\resource\\beans1.xml");
     
		TestBeanPojo2 pojo= ac.getBean("com.test.pojos.TestBeanPojo3",TestBeanPojo2.class);
		//TestBeanPojo3 pojo1= child.getBean("demoTest1",TestBeanPojo3.class);

  System.out.println(pojo.getName());
  System.out.println(pojo.getAge());
  System.out.println(pojo.getRollNo());*/
        
        
        
	}
}
