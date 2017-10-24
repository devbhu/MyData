package test.onetoone.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestOneToOneBidirectional {

	
	public static void main(String[] args) {
		
	
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
			//saving Person Object.
		 	Person p = new Person();
	
			p.setPersonName("Arindam");
			Address a = new Address();
			a.setCountry("India");
			a.setCity("Bangalore");
			a.setState("Karnataka");
			a.setPersonrr(p);
			
			p.setAddress(a);
			
			//.......Saving address................//
			
			/*Address a = new Address();
			a.setCountry("India");
			a.setCity("Bangalore");
			a.setState("Karnataka");
			Person p = new Person();
			
			p.setPersonName("Arindam");
			
			a.setPersonrr(p);*/
			
			
			
			session.beginTransaction();
			session.save(p);
			session.getTransaction().commit();
	
		}catch(Exception ex){
			session.getTransaction().rollback();
			ex.printStackTrace();	
			
		}finally{
			
			session.close();
			sessionFactory.close();
			
		}
		
		
		
	}
	
}
