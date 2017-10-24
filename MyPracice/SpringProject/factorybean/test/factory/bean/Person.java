package test.factory.bean;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ResourceLoader;

import test.custom.qualifier.Gender;
import test.custom.qualifier.GenderType;

public class Person {
	@Autowired
    @Gender(type=GenderType.FEMALE,value="fe")
	Vehicle testMap;
	@Autowired
	@Qualifier("bus")
	Map<String,Vehicle> vehicle;
	@Autowired
	ApplicationContext context;
	@Autowired
	MessageSource messageSource;
	@Resource
	ResourceLoader loader;
	
	Car car;

	public Car getCar() {
		return car;
	}
	@Resource(name="car41")
	public void setCar(Car car) {
		this.car = car;
	}
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public ResourceLoader getLoader() {
		return loader;
	}
	public Map<String,Vehicle> getVehicle() {
		return vehicle;
	}


	public ApplicationContext getContext() {
		return context;
	}
	
	public Vehicle getTestMap(){
		
		return testMap;
	}
     
     
  /* @Autowired(required=false)
	Person(Vehicle vehicle){
		
		System.out.println("single invoked");
	}*/
	
}
