package com.test.pojos;

import java.util.Map;

public abstract class TestBeanPojo {
	
	//ApplicationContext context;
	public TestBeanPojo() {
		System.out.println("From constructor !!");
	}

	Inter[] arrays;
	Map<String, Inter> map;
	public Inter[] getArrays() {
		return arrays;
	}
	public void setArrays(Inter[] arrays) {
		this.arrays = arrays;
	}
	public Map<String, Inter> getMap() {
		return map;
	}
	public void setMap(Map<String, Inter> map) {
		this.map = map;
	}
	
	public String fun(String name){
		
		return name;
		
	}
/*	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		
		this.context=context;
		
	}*/

	public abstract Object createProtoInstance();
	
}
