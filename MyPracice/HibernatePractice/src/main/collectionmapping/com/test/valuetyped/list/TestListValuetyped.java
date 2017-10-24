package com.test.valuetyped.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;


public class TestListValuetyped {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
			
			Student s = new Student();
			Student s2 = new Student();
			Student s3 = new Student();
			
			s.setStudentName("Arindam");
			s2.setStudentName("Vickey");
			s3.setStudentName("Rahul");
			
			List studentBooks = new ArrayList();
			studentBooks.add("Java");
			studentBooks.add("Dot net");
			studentBooks.add("C sharp");
			studentBooks.add("Database");
			
			s.setBooks(studentBooks);
			s2.setBooks(studentBooks);
			s3.setBooks(studentBooks);
			
			Set<Activity> act1 = new HashSet<Activity>();
			Set<Activity> act2 = new HashSet<Activity>();
			Set<Activity> act3 = new HashSet<Activity>();
			
		     Activity a = new Activity("Guitar",8);
		     Activity a1 = new Activity("Violine",20);
		     Activity a2 = new Activity("Cricket",12);
		     Activity a3 = new Activity("Football",67);
			
		     
		     act1.add(a);
		     act1.add(a1);
		     
		     act2.add(a3);
		     act2.add(a2);
			
		     act3.add(a1);
		     act3.add(a);
			
			s.setActivities(act1);
			s2.setActivities(act2);
			s3.setActivities(act3);
		     
		     
			session.beginTransaction();
			
			session.save(s);
			session.save(s2);
			session.save(s3);
			
			session.getTransaction().commit();
			
		} catch(Exception ex){
			session.getTransaction().rollback();
			ex.printStackTrace();
			
			
		} finally{
			
			session.close();
			sessionFactory.close();
			
		}
	}

}
