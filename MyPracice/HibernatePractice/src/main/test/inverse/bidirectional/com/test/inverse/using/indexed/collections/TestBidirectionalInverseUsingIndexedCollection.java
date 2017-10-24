package com.test.inverse.using.indexed.collections;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestBidirectionalInverseUsingIndexedCollection {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

		Session session = sessionFactory.openSession();

		try {
             
			
		  Question q1 = new Question();
		  q1.setQuestionName("Who invented java?");
		  
		  Map<String,Answer> map  = new HashMap<String,Answer>();
		  
		  
		  Answer a = new Answer("James Gosling");
		  a.setQuestion(q1);
		  
		  
		  
		/*  map.put("Ankit", a);
		  map.put("Sangita", a);
		  map.put("Arindam", a);
		  map.put("Vickey", a);
		  q1.setUserAnswers(map);*/
		  
		  session.beginTransaction();
		  
		  session.save(a);
		  
		  
		  session.getTransaction().commit();
			

		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			
		}

		finally {

			session.close();
			sessionFactory.close();
		}
		
		
	}

}
