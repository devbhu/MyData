package com.test.basicormapping;

import java.sql.Date;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.basicormapping.model.Employees;
import com.test.hibernate.util.HibernateConfigUtil;


public class TestBasicOrMapping {

	public static void main(String[] args) {

		SessionFactory sFactory = HibernateConfigUtil
				.configure("com/basic/ormaping/hibernate.cfg.xml");

		Session s = sFactory.openSession();

		List bm = s.createQuery("from Employees as e where e.id='216' ").list();
        //s.getTransaction().begin();
		System.out.println("IS list empty : " + bm.isEmpty());
		System.out.println(bm);
		Employees emp=null;
		if (!bm.isEmpty()) {
			 
			  emp = (Employees)bm.get(0);
			  
			 
			  emp.setEmployeeFirstName("Arindam7");
			 //emp.setEmployeeLastName("Sanyal");
			 //emp.setEmployeeEmail("a3234@gmail.com");
			 //emp.setJobID("IT_PROG");
			  //s.update(emp);
			  
			// s.delete(emp); 
			 
		//	s.getTransaction().commit();
			
			System.out.println(emp);
		
		}
		
		
	/*	System.out.println("Is the previous transaction active "+s.getTransaction().isActive());
		//New Transaction for update
		
		s.beginTransaction();
		
		 emp.setId(302);
		 
		
		System.out.println("Before calling save or update!!!" +emp);
		
		s.saveOrUpdate(emp);
		
		s.getTransaction().commit();
		
		System.out.println("Save or update success !!!! ");*/
		
		
		//create
		/*  s.beginTransaction();
		   Random r= new Random();
		   Employees e= new Employees();
		   e.setEmployeeFirstName("Arindam");
		   e.setEmployeeLastName("Sanyal");
		   e.setEmployeeEmail("asadny35@manh.com");
           e.setSalary(50000);
		   e.setDepartmentID("100");
		   e.setHireDate(new Date(new java.util.Date().getTime()));
		   e.setJobID("IT_PROG");
		   e.setEmpType(true);
		   s.save(e);
		
		   s.getTransaction().commit();*/

		//System.out.println("Test Mapping " + bm);

	}
}
