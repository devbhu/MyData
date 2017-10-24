package com.test.workingwithobjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestModifyObject {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		//Automatic dirty checking. One advantage of persistent context.
		Session session= sessionFactory.openSession();
		
		Author a = (Author)session.load(Author.class, new Integer(5));
		
		session.beginTransaction();
		
		a.setAuthorName("Rod johnson");
		
		session.flush();
		
		session.getTransaction().commit();
		
	}

}
