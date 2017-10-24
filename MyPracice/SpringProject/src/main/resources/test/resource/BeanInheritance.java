package test.resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/resource/bean-inheritance.xml");
		
         BeanFactory cb = new XmlBeanFactory(new ClassPathResource("test/resource/bean-inheritance.xml"));
         
         ConfigurableBeanFactory cv = (ConfigurableBeanFactory)cb;
        // cv.a
        // ConfigurableBeanFactory dc=  ((ConfigurableBeanFactory)cb);
		
	}

}
