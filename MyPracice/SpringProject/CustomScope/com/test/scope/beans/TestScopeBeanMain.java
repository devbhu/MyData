/**
 * 
 */
package com.test.scope.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vickey
 *
 */
public class TestScopeBeanMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("test/custom/scope/resource/parent-custom.xml");
		final ApplicationContext child = new ClassPathXmlApplicationContext(new String[]{"test/custom/scope/resource/custom-scope.xml","test/custom/scope/resource/parent-custom.xml"});
		
		
		new Thread(){
			@Override
			public void run(){
				
				System.out.println(child.getBean("scopeBean"));
			}
			
		}.start();
		
	 
		new Thread(){
			@Override
			public void run(){
				
				System.out.println(child.getBean("scopeBean"));
			}
			
		}.start();
	
		//System.out.println(child.getBean("scopeBean"));
		

	}

}
