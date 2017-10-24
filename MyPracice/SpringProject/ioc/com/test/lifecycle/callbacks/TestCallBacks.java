package com.test.lifecycle.callbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestCallBacks implements InitializingBean,DisposableBean {

	@Override
	public void destroy() throws Exception {
		
		System.out.println(this.getClass().getName()+" destroy method called !!!");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		
		System.out.println(this.getClass().getName()+" afterProperties set called !!!");
		
	}
	


	
	public void defClean(){
		
		System.out.println("default destroy method ");
	}
	
	public void init1(){
		System.out.println("def init  called ");
	}
	
	public void clean(){
		System.out.println("clean called ");
	}
	
}
