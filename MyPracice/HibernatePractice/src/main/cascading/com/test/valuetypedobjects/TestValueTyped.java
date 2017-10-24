package com.test.valuetypedobjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestValueTyped {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			
			UsrDetails userDetails = new UsrDetails();
			UsrDetails userDetails1 = new UsrDetails();
			
			Address address1 = new Address();
			address1.setUserCity("Bangalore");
			address1.setUserStreet("Munekolalla");
			address1.setUserZipCode(560067L);
			
			userDetails.setUserName("Arindam");
			userDetails1.setUserName("Vickey");
			userDetails.setAddress(address1);
			userDetails1.setAddress(address1);
			
			session.save(userDetails);
			session.save(userDetails1);
			
			session.getTransaction().commit();

		}

		finally {

			session.close();

			sessionFactory.close();
		}

	}

}
