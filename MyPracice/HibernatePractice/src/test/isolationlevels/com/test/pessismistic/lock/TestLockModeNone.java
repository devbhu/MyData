package com.test.pessismistic.lock;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.hibernate.util.HibernateConfigUtil;
import com.test.workingwithobjects.Author;

public class TestLockModeNone {
	
static SessionFactory sessionFactory;

static{
	sessionFactory = HibernateConfigUtil
			.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

}

public static SessionFactory getSessionFactory(){
	
	return sessionFactory;
}

public static void main(String[] args) {
	Session session = null;
		
		try{
		
		 session= sessionFactory.openSession();
		 //Transaction tx1 = session.beginTransaction();
		 
		 Author a1 = (Author)session.get(Author.class,1); 
		 
		 System.out.println(a1);
		 
		// session.lock(a1, LockMode.UPGRADE);
		 
		  //Object author =  session.createSQLQuery(" select authorname from author_table  where authorid='6797' ").list();
				 
	  a1.setAuthorName("ddsdd");
	  
	  session.saveOrUpdate(a1);
	//  session.flush();
		 
		 //tx1.commit();
		
		
		} catch(HibernateException ex){
			
			ex.printStackTrace();
		}
		finally{
			session.close();
			sessionFactory.close();
			
		}
		
		
	}

	
}
