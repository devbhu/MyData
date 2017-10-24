package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.ValidationUtils;

import com.test.pojos.Company;

public class TestMainValidator {
        
	private static final String APPCTX_RESOURCE= "ValidationUsingSpring/com/test/resources/validator-resources.xml";
	
	
	public static void main(String[] args) {
          
		
		ApplicationContext context = new FileSystemXmlApplicationContext(APPCTX_RESOURCE);
        
		Company company = context.getBean("company",Company.class);
		
		//Error instance to be created for standalone app
		
	    BindException error = new BindException(company, Company.class.getName());
		
		ValidationUtils.invokeValidator(company.getCompanyValidator(), company, error);
		
		System.out.println("Company Name : "+company.getCompanyName());
		System.out.println(" Company Address : "+company.getCompanyAddress());
		
	}

}
