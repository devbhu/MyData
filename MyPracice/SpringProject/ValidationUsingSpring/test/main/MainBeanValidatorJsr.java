package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.pojos.Company;

public class MainBeanValidatorJsr {
    
	private static final String APPCTX_RESOURCE= "com/test/jsr/beanvalidation/validator-resources.xml";

	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				APPCTX_RESOURCE);
		
		
		Company company = context.getBean("company",Company.class);
     
		System.out.println(company.getCompanyName());
		System.out.println(company.getPhoneNumber());

	}

}
