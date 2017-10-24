package test.factory.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		ApplicationContext parent = new ClassPathXmlApplicationContext("test/factory/test-factory.xml");
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"test/factory/bean/test-factory-bean.xml"},parent);
		
		//Person p = ac.getBean("person",Person.class);

		//System.out.println(ac.getBean("carBuilderFactory"));
		//System.out.println(ac.getBean("&carBuilderFactory"));
		
		//System.out.println(ac.getBean("personTest",Person.class).getContext());
      
		//System.out.println(ac.getBean("personTest",Person.class).getMessageSource());

		//System.out.println(ac.getBean("personTest",Person.class).getLoader());
         
		//System.out.println(ac.getBean("personTest",Person.class).getVehicle());
      
		System.out.println(ac.getBean("personTest",Person.class).getTestMap());
       
		System.out.println(ac.getBean("personTest",Person.class).getLoader());

		System.out.println(ac.getBean("personTest",Person.class).getCar());

   	}

}
