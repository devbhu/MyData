package com.test.pojos;

import java.beans.ConstructorProperties;

public class TestBeanPojo2 extends TestBeanPojo3 implements Inter{
    
	//@ConstructorProperties(value={"name","name1"})
	public TestBeanPojo2(String name,int name1){
		
		
		System.out.println("name : "+name+" type : "+name1);
	}
	
	public TestBeanPojo2(){
		
		System.out.println(" default constructor invoked !!!");
	}
	
	static public Object createInstance(String name,String name1){
		System.out.println("create instance method calleds");
		return new TestBeanPojo2();
	}
	
	TestBeanPojo3 pojo3;

	public TestBeanPojo3 getPojo3() {
		return pojo3;
	}

	public void setPojo3(TestBeanPojo3 pojo3) {
		this.pojo3 = pojo3;
	}
	
	
	
	 public void create(){
		   System.out.println(this.getClass().getName()+" is created ");
	   }
	   
	   public void destroy(){
		   
		   System.out.println(this.getClass().getName()+" is destroyed ");

		   
	   }
	
	
}
