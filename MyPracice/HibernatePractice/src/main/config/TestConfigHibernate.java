import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class TestConfigHibernate {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		//cfg.addResource("com/resource/Employee.hbm.xml");
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
		Session session= factory.openSession();
		
		List employees = session.createQuery("from com.test.config.Employee as e").list();
	    System.out.println(employees);
	        
		
}}
