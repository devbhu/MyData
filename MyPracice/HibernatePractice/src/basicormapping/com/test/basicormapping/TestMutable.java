package com.test.basicormapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.basicormapping.model.Employees;
import com.test.hibernate.util.HibernateConfigUtil;

public class TestMutable {

	public static void main(String[] args) {
		
		SessionFactory sFactory = HibernateConfigUtil
				.configure("com/basic/ormaping/hibernate.cfg.xml");

		Session s = sFactory.openSession();

		List bm = s.createQuery("from Employees as e where e.id='222'").list();
        s.getTransaction().begin();
		System.out.println("IS list empty : " + bm.isEmpty());
		System.out.println(bm);
		Employees emp=null;
		if (!bm.isEmpty()) {
		
			 emp = (Employees)bm.get(0);
			 
			 //emp.setEmployeeEmail("asanyal@gmail.com");
			
		}
		s.delete(emp);
		s.getTransaction().commit();
	}
	
}
