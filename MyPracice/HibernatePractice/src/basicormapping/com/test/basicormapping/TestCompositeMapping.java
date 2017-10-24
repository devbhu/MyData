package com.test.basicormapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.basic.compositeid.mapping.EmployeeCompositeId;
import com.basic.compositeid.mapping.Employees;
import com.test.hibernate.util.HibernateConfigUtil;

public class TestCompositeMapping {
	public static void main(String[] args) {

			SessionFactory sFactory = HibernateConfigUtil
					.configure("com/basic/ormaping/hibernate.cfg.xml");

			Session s = sFactory.openSession();
			try {
			//1st approach loading the persistent class with composite id's	
			//Employees emp = new Employees();
			//emp.setId(227);
			//emp.setEmployeeFirstName("Vickey");
			
			//2nd Approach by mapped=true and providing an composite id class
				
				EmployeeCompositeId cmpId = new EmployeeCompositeId();
				cmpId.setId(227);
				cmpId.setEmployeeFirstName("Vickey");

			System.out.println((Employees) s.get(Employees.class, cmpId));
		} finally {
			s.close();
			sFactory.close();
		}
	}
}
