package com.test.manytomany.using.list;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestManyToManyUsingListBidirectionalFetch {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

		Session session = sessionFactory.openSession();
		
		try{
			
			List<Student> students = session.createQuery(" from Student st").list();
			
			for(Student stu : students){
				
				System.out.println(stu.getStudentName() +"---->" +stu.getCourses());
				
			}
			
			
		}catch(Exception ex){
			
			ex.printStackTrace();
			
			
		}finally{
			
			session.close();
			sessionFactory.close();
			
		}
		
		
	}
	
}
