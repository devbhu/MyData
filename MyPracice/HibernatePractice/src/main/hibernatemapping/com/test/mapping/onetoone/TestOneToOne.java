package com.test.mapping.onetoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestOneToOne {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

		Session session = sessionFactory.openSession();
		

		try { 

			//List<UserDetailss> userDetail= session.createQuery(" from UserDetailss  ud   ").list();
			 
			// Set<UserDetailss> sets = new HashSet<UserDetailss>();
			 //sets.addAll(userDetail);
		 //System.out.println(userDetail.get(0).getUserAddress().getUserDetails());
			
		     session.beginTransaction();
			//for(int i=0;i<=2;i++){
			UserDetailss userDetails = new UserDetailss();
			userDetails.setUserName("Arindam");
			UserAddress userAddress = new UserAddress();
			userAddress.setUserAddressId(999L);
			userAddress.setUserCity("Jorhat");
			userAddress.setUserStreet("NA-ALI");
			userAddress.setUserZipCode(785001L);
          //  userAddress.setUserDetails(userDetails);
			userDetails.setUserAddress(userAddress);
			userAddress.setAddressId(1);
			/*Addresses address = new Addresses();
			address.setAddressUserId("999");
			address.setResidentCity("Bangalore");
			address.setResidentCountry("India");
			address.setResidentState("Karnataka");
           // address.setAddressId(i);
            address.setUserDetails(userDetails);*/
            
			//userDetails.setAddress(address);

			
            // session.close();
             //UserDetailss userDetails = userDetail.get(0);
         	
 			//userDetails.setVoterId(3027);
     		
             //session = sessionFactory.openSession();
       
		     session.save(userDetails);
			
			//}
			
			
			session.getTransaction().commit();
             
		} catch (Exception ex) {
    
			session.getTransaction().rollback();
            ex.printStackTrace();
		}

		finally {

			session.close();
			sessionFactory.close();
		}
	}

}
