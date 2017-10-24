package com.test.workingwithobjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestConnectionPool {
	
	private static SessionFactory sessionFactory;
	
	static{
		
		 sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		
		
	}
	
	
	public static void main(String[] args) {
		try{
		
		Thread t1= new Thread(){
			 
			 @Override
			 public void run(){
				 Session session = sessionFactory.openSession();
				 Transaction tx= session.beginTransaction();
				    for(int i=0;i<100;i++){
				    Author a = new Author();
					a.setAuthorName("James Gosling");
					a.setAuthorRegistration("483949303");
					a.setAuthorId(8000+i);
					session.save(a);
				    }
				 tx.commit();
				 // Session session = sessionFactory.openSession();
				  
				  
				//  tx.setTimeout(6000);
				// System.out.println(session.isOpen());
				 
				// session.close();
			 }
			 
		 };
		
         Thread t2 = new Thread(){
			 
			 @Override
			 public void run(){
				 
				 Session session = sessionFactory.openSession();
				 Transaction tx= session.beginTransaction();
				    for(int i=0;i<100;i++){
				    Author a = new Author();
					a.setAuthorName("James Gosling");
					a.setAuthorRegistration("483949303");
					a.setAuthorId(9000+i);
					session.save(a);
					
				    }
				    tx.commit();
				    
			 }
			 
		 };
		 
      Thread t3 = new Thread(){
			 
			 @Override
			 public void run(){
				 
				 Session session = sessionFactory.openSession();
				 Transaction tx= session.beginTransaction();
				    for(int i=0;i<100;i++){
				    Author a = new Author();
					a.setAuthorName("James Gosling");
					a.setAuthorRegistration("483949303");
					a.setAuthorId(10000+i);
					session.save(a);
					
				    }
				    tx.commit();
				    
			 }
			 
		 };
		
		
		t1.start();
		t2.start();
		t3.start();

		while(true){}
		}catch(Exception ex){
			
			ex.printStackTrace();
		}
	/*	
		finally{
			
			sessionFactory.close();
		}*/
		
	}
	

}
