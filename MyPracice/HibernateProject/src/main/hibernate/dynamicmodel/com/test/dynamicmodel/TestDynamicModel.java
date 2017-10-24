package com.test.dynamicmodel;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestDynamicModel {
	public static void main(String[] args) {
          
		Map employee = new HashMap();
		employee.put("employeeFirstName", "Vickey");
		employee.put("employeeLastName", "San");
		employee.put("employeeEmail", "Vickey@manh.com");
		employee.put("departmentID", 100L);
		employee.put("salary", 60000L);
		employee.put("hireDate", new Date(new java.util.Date().getTime()));
		employee.put("jobID", "IT_PROG");
		
		Configuration config = new Configuration();
		
		SessionFactory factory = config.configure("com/dynamicmodel/config/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save("EmployeesModel", employee);
		
		session.getTransaction().commit();
		
		session.close();
		factory.close();
		
		
	}
}
