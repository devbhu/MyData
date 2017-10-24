package test.factory.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.FactoryBean;

public class CarBuilderBean implements FactoryBean<Car>{

	String year;
	
	@PostConstruct
	public void afterPropertiesSet(){
		
		System.out.println("CarbuilderBean after properties set called!!");
	}
	
	@Override
	public Car getObject() throws Exception {
	
		Car c = null;
		if("2015".compareTo(getYear())<0){
			
			c = new Car();
			
			c.setCarName("maruthi");
			c.setCarNumber("242141");
			
		}
				
		return c;
		
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public Class<Car> getObjectType() {
		
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}



}
