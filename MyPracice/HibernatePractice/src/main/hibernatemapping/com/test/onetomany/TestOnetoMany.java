package com.test.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestOnetoMany {

	 
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
		
		//	Employee emp = (Employee) session.createQuery(" from com.test.onetomany.Employee e where e.employeeId = 1 ").list().get(0);
		//System.out.println(emp);
		Employee e = new Employee();
		Address a1=new Address();
		Address a2=new Address();
		e.setEmployeeName("Arindam");
		a1.setCity("Bangalore");
		a1.setState("Karnataka");
		a2.setCity("Jorhat");
		a2.setState("Assam");
		Set<Address> addresses = new HashSet<Address>();
		addresses.add(a1);
		addresses.add(a2);
		
		e.setAddresses(addresses);
		session.beginTransaction();
	    session.save(e);
		session.getTransaction().commit();
		}catch(Exception ex){
			
			//session.getTransaction().rollback();
			ex.printStackTrace();
		}
		finally{
			
			
			session.close();
			sessionFactory.close();
		}
		
	}
}
