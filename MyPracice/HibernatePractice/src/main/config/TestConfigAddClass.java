import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestConfigAddClass {

	private static Properties customProperties;

	static {

		customProperties = new Properties();
		try {
			customProperties
					.load(TestConfigAddClass.class
							.getResourceAsStream("/com/test/custom/properties/custom-hibernate.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.addClass(com.test.config.Employee.class);
		// Setting properties from a custom property file instead of
		// hibernate.properties.This has to be set prior to the overrriding
		// configuration as below shown.If we write this after the
		// cfg.setProperty() then it'll throw exception.So first set this then
		// override.We are using custom properties instead of
		// hibernate.properties. But if we use cfg.mergeProperties(), then we
		// wont get any issue.it'll basically merge the default
		// hibernate.properties and the custom-hibernate.properties.New keys
		// will be added and existing will be overrridden.So mergeProperties()
		// is the best to use instead of setProperties().Since setProperties()
		// will completely override the existing config.

		cfg.setProperties(customProperties);

		// Overriding the current properties configuration that was initially
		// present in hibernate.properties.

		cfg.setProperty("hibernate.connection.username", "hr");
		// cfg.mergeProperties(customProperties);
		SessionFactory factory = cfg.buildSessionFactory();
		//System.out.println(factory);
		Session session = factory.openSession();
		
		List employees = session.createQuery("from Employee as e").list();

		 System.out.println(employees);
	}
	// factory.close();
}
