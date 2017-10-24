package com.test.persist;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PersistEmployee {
  
	public static void main(String[] args) {
	
	   Employee e= new Employee();
	   e.setEmployeeFirstName("Vickey");
	   e.setEmployeeLastName("Sanyal");
	   e.setEmployeeEmail("asanyal@manh.com");
	   e.setSalary("50000");
	   e.setDepartmentID("100");
	   e.setHireDate(new Date(new java.util.Date().getTime()));
	   e.setJobID("IT_PROG");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
	    
		Session session = sf.openSession();
	    
		List list= session.createQuery("from com.test.persist.Employee e where e.id='218'").list();
		
		Object obj = session.get(Employee.class, 218);
		
		System.out.println(list);
		//session.beginTransaction();
		//session.save(e);
		//session.getTransaction().commit();
		session.close();
		
		sf.close();
		
	
  }
}
