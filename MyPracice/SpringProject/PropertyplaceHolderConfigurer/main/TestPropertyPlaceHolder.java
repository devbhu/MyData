package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropertyPlaceHolder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("config.value1", "80");
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/propertyplaceholderconfigurer.xml");

	}

}
