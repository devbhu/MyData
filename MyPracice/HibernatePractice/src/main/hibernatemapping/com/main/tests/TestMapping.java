package com.main.tests;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.mapping.models.Countries;
import com.test.hibernate.mapping.models.Region;
import com.test.hibernate.util.HibernateConfigUtil;

public class TestMapping {

	public static void main(String[] args) {

		// Many-to-one mapping

		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

		Session session = sessionFactory.openSession();
		try {
			
			Countries c1 = new Countries();
			Countries c2 = new Countries();
			
			Region r1 = new Region();
			r1.setRegionName("Asia");
			
			c1.setCountryId("IN");
			c1.setCountryName("INDIA");
			c1.setRegion(r1);
			c2.setCountryId("PAK");
			c2.setCountryName("PAKISTAN");
			c2.setRegion(r1);
			
		    session.beginTransaction();
		    //session.save(r1);
		    session.save(c1);
		    session.save(c2);
		    session.getTransaction().commit();
		 	
		}catch(Exception ex){
			session.getTransaction().rollback();
			ex.printStackTrace();
			
		} 
		
		
		finally {
			session.close();
			sessionFactory.close();

		}
		
		/*try{
		//create
			int k=7;
		for(int i=89701 ;i<=89704;i++){	
		Countries c = new Countries();
		
		c.setCountryId("N"+k);
		c.setCountryName("NEW"+k);
		k++;
		Region r  = new Region();
		r.setRegionId(i);
		//r.setRegionName(regionName);
		c.setRegion(r);
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(c);
		session.getTransaction().commit();
		}
		}
		finally {
			session.close();
			sessionFactory.close();

		}
*/
	}
}
