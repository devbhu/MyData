package com.test.pojos;


public class TestBeanPojo3 implements Inter{
   
	public static class NestedBean{
		
		public NestedBean(){}
		
		String nestedBean;

		public String getNestedBean() {
			return nestedBean;
		}

		public void setNestedBean(String nestedBean) {
			this.nestedBean = nestedBean;
		}
		
		
		
	}
	
	
	public class NonStaticInner{
		
		String nestedBean;

		public String getNestedBean() {
			return nestedBean;
		}

		public void setNestedBean(String nestedBean) {
			this.nestedBean = nestedBean;
		}
		
		
		
	}

	private String name;
	private String age;
	private String rollNo;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	 public void create(){
		   System.out.println(this.getClass().getName()+" is created ");
	   }
	 
	 public void destry(){
		   System.out.println(this.getClass().getName()+" is destroyed ");
	   }
	   
	   public void destroy(){
		   
		   System.out.println(this.getClass().getName()+" is destroyed ");

		   
	   }

	//@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("AFter properties set -->"+this);
		
		
	}

  public Object createInnerInstance(){
	  
	 return new TestBeanPojo3.NonStaticInner();
	  
  }
	
}
