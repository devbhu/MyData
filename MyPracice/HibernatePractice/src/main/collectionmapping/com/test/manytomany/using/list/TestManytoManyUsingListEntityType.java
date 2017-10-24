package com.test.manytomany.using.list;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestManytoManyUsingListEntityType {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

		Session session = sessionFactory.openSession();
		try {
            //Saving Student
			/*Student s1 = new Student();

			Student s2 = new Student();

			Student s3 = new Student();

			s1.setStudentName("Arindam");
			s2.setStudentName("Vickey");
			s3.setStudentName("John");
			
			Course crs1 = new Course("java");
			Course crs2=new Course("Dot net");
			Course crs3 = new Course("C sharp");
			Course crs4 = new Course("Ansi");

			List<Course> c1 = new ArrayList<Course>();

			c1.add(crs1);
			c1.add(crs2);
			c1.add(crs3);

			List<Course> c2 = new ArrayList<Course>();

			c2.add(crs1);
			c2.add(crs2);
			c2.add(crs4);

			List<Course> c3 = new ArrayList<Course>();

			c3.add(crs1);
			c3.add(crs2);
			c3.add(crs4);

			s1.setCourses(c1);
			s2.setCourses(c2);
			s3.setCourses(c3);

			session.beginTransaction();

			session.saveOrUpdate(s1);
			session.saveOrUpdate(s2);
			session.saveOrUpdate(s3);

			session.getTransaction().commit();*/
			
			//----saving course ---//
			
			Course c1 = new Course("Java");
			Course c2 = new Course("Dot Net");
			Course c3=new Course("Database");
			
			Student s1= new Student();
			s1.setStudentName("Arindam");
			
			Student s2=new Student();
			
			s2.setStudentName("Vickey");
			
			Student s3 = new Student();
			s3.setStudentName("John");
			
			
		    List<Student>students1 = new ArrayList<Student>();
		    students1.add(s1);
		    students1.add(s2);
		    
		    List<Student>students2 = new ArrayList<Student>();
		    students2.add(s2);
		    students2.add(s3);
		    
		    List<Student>students3 = new ArrayList<Student>();
		    students3.add(s3);
		   // students3.add(s3);
		    
			c1.setStudents(students1);
			c2.setStudents(students2);
			c3.setStudents(students3);
			
			session.beginTransaction();
			
			session.saveOrUpdate(c1);
			session.saveOrUpdate(c2);
			session.saveOrUpdate(c3);
			session.getTransaction().commit();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
