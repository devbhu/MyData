/**
 * 
 */
package com.test.pojos;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;



/**
 * @author vickey
 *
 */
public class TestMethodReplacer implements MethodReplacer{
	
	
	public void run(){
		
		
		System.out.println("run called");
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args)
			throws Throwable {
		
		
		   String arg = (String)args[0];
		   
		   return arg.substring(0,2);
		  
		   		
	}

	
	
}
