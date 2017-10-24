package test.resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.context.support.ServletContextResource;

public class TestResources {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		/*ApplicationContext context = new FileSystemXmlApplicationContext("classpath:/test/resources/appCtx-context.xml");
		
		ResourceManager resMang = context.getBean("resourceManager",ResourceManager.class);
	    
		Resource resource = resMang.getResourceLoader().getResource("F:/test/resources/beans1.xml");
		
		System.out.println(resource.getInputStream());
		
		System.out.println(".......File system resource .....");
		
		Resource resourc = new FileSystemResource("springResources/test/resources/appCtx-context.xml");
		
		System.out.println(resourc.getInputStream());
		
       System.out.println("......Url  resource .....");
		
		Resource urlRes = new UrlResource("file:springResources/test/resources/appCtx-context.xml");
		
		System.out.println(urlRes.getInputStream());*/
		
		ApplicationContext ac = new FileSystemXmlApplicationContext("classpath*:*Ctx-context.xml");
		
		System.out.println(ac.getBean("resourceManager"));
		
		System.out.println(ac.getBean("resourceManager1"));
		
		//Resource resource = ac.getBean("resourceManager",ResourceManager.class).getResourceLoader().getResource("classpath:/test/resources/appCtx-context.xml");
		
 //Resource resource = new ClassPathResource("test/resources/appCtx-context.xml");
		
	//System.out.println(resource.getInputStream());
		
		
	}

}
