package com.test.workingwithobjects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.spi.SQLExceptionConverterFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestMakingPersistentObjectTransient {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
try{
			
     		Author a = new Author();
     		a.setAuthorId(15);
			a.setAuthorName("James Gosling");
			a.setAuthorRegistration("483949303");
			
			Author a1 = new Author();
			a1.setAuthorId(15);
			a.setAuthorName("James Gosling");
			a.setAuthorRegistration("483949303");
		
			
			session.beginTransaction();
			
			session.save(a);
			session.save(a1);
			
	
			
		//	session.getTransaction().commit();
			
			
			
		} catch(HibernateException ex){
		   
			System.out.println(ex.getMessage());
			
		} finally{
			
			session.close();
			sessionFactory.close();
			
		}
	}

}
