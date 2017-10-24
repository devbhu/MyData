package com.test.isolation.levels;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.hibernate.util.HibernateConfigUtil;
import com.test.workingwithobjects.Author;

public class TestOptimisticLock {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		Session session = null;
		try{
		session= sessionFactory.openSession();
		
		Transaction tx1 = session.beginTransaction();
		
		 Author a = (Author)session.get(Author.class, 9000);
		 a.setAuthorName("Arindam San");
		
		tx1.commit();
		
		
		} catch(HibernateException ex){
			
			ex.printStackTrace();
		}
		finally{
			session.close();
			sessionFactory.close();
			
		}
		
		
	}

}
