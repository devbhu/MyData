package com.test.workingwithobjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestLoad {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
			
		  Author a3 = (Author)session.get(Author.class, new Integer(7));
		 // System.out.println(a3);
		  Author a4 = (Author)session.get(Author.class, new Integer(7));
		 // System.out.println(a4);
     	   Author a = (Author)session.load(Author.class, new Integer(5));
     	  System.out.println(a);
     	   
     	  Author a1 = (Author)session.load(Author.class, new Integer(5));
    	  System.out.println(a1);
			
			System.out.println(a1==a3);
			System.out.println("cfc"+a.getAuthorName());
			System.out.println("sdsdg"+a.getAuthorRegistration());
			System.out.println("dxfds");
			
		} catch(Exception ex){
			ex.printStackTrace();
		
			
		} finally{
			
			session.close();
			sessionFactory.close();
			
		}
	}
}
