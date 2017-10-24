package com.test.cascading;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestCascading {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

		Session session = sessionFactory.openSession();
		try {
			
			List<UsrDetails> userDetails = session.createQuery(" from com.test.cascading.UsrDetails ud where ud.userID='996' ").list();
			
			System.out.println(userDetails);
			
			/*session.beginTransaction();
			// Create

			UsrDetails userDetails = new UsrDetails();
			userDetails.setUserCity("Jorhat");
			userDetails.setUserName("Papu");
			userDetails.setUserStreet("Na-Ali");
			userDetails.setUserZipCode(785001L);
		    userDetails.setUserID(997);
			Address address = new Address();

			address.setResidentCity("Jorhat");
			address.setResidentCountry("India");
			address.setResidentState("Assam");
			//address.setUserDetails(userDetails);
			userDetails.setAddress(address);
			address.setAddressUserId(997);

			session.save(userDetails);

			session.getTransaction().commit();*/
		} finally {

			session.close();
			sessionFactory.close();
		}

	}

}
