package com.test.inverse.valuetyped;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestValueTypedInverse {
	
	public static void main(String[] args) {
		

		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

		Session session = sessionFactory.openSession();

		try {
             
			
			Author a = new Author();
			a.setAuthorName("James Gosling");
			
			Book b1 = new Book();
			b1.setBookName("JAVA");
			
			Book b2 = new Book();
			b2.setBookName("JAVA2");
			
			Book b3 = new Book();
			b3.setBookName("JAVA3");
			
			Set<Book> books = new HashSet<Book>();
			
			books.add(b1);
			books.add(b2);
			books.add(b3);
			
			
			a.setBooks(books);
			
			
			session.beginTransaction();
			
			session.save(a);
			
			
			
			session.getTransaction().commit();
			

		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			
		}

		finally {

			session.close();
			sessionFactory.close();
		}
		
		
	}

}
