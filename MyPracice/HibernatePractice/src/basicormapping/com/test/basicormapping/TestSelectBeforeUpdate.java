package com.test.basicormapping;

import java.sql.Date;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.basicormapping.model.Employees;
import com.test.hibernate.util.HibernateConfigUtil;

public class TestSelectBeforeUpdate {

	public static void main(String[] args) {

		SessionFactory sFactory = HibernateConfigUtil
				.configure("com/basic/ormaping/hibernate.cfg.xml");

		Session s = sFactory.openSession();

		List bm = s.createQuery("from Employees as e where e.id='213' ").list();
	
		System.out.println("IS list empty : " + bm.isEmpty());
		Employees emp = null;
		if (!bm.isEmpty()) {

			emp = (Employees) bm.get(0);
            emp.setEmployeeEmail("asanyarrr@manh.com");
		}
       
		s.close();
		
		   //transient object
		   Employees e= new Employees();
		   e.setId(206);
		   e.setEmployeeFirstName("Vickey");
		   e.setEmployeeLastName("Sanyal");
		   e.setEmployeeEmail("asanyaggg@manh.com");
           //e.setSalary("50000");
		   e.setDepartmentID("100");
		   e.setHireDate(new Date(new java.util.Date().getTime()));
		   e.setJobID("IT_PROG");
		Session s1 = sFactory.openSession();
		s1.beginTransaction();
		
		s1.save(e);
		s1.getTransaction().commit();
		
	}
}
