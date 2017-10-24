package com.test.workingwithobjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestPersistentContextEquality {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		Author a = (Author)session.get(Author.class, new Integer(10));
		
		session.close();
		
		Session session1 = sessionFactory.openSession();
		
		
		
		session.beginTransaction();
		
		a.setAuthorName("Rod johnson");
		
		session.flush();
		
		session.getTransaction().commit();
		
	}


}
