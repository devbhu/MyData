package lifecycle.callbacks;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCallBacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		 AbstractApplicationContext ac = new ClassPathXmlApplicationContext("lifecycle/callbacks/lifecycle-callback-resource.xml"); 
		
         ac.registerShutdownHook();  
       
         //System.out.println(ac.getBean(TestClass.getBeanName()));
         
	}

}
