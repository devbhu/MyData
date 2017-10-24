package com.test.bidirectional.inverse;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestInverse {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
			//Saving author which is parent object
     		Author a = new Author();
			a.setAuthorName("James Gosling");
			Set<Book>books = new HashSet<Book>();
			
			Book b1 = new Book();
			b1.setBookName("Java");
			//b1.setAuthor(a);
			
			Book b2 = new Book();
			b2.setBookName("Spring");
			//b2.setAuthor(a);
			Book b3 = new Book();
			b3.setBookName("Hibernate");
		   // b3.setAuthor(a);
			books.add(b1);
			books.add(b2);
			books.add(b3);
			
			a.setBooks(books);
			
			
			
			
			session.beginTransaction();
			session.save(a);
			
			session.getTransaction().commit();
			
			
			//Saving Book object
			
/*			Book b1 = new Book();
			b1.setBookName("Java");
			
			Book b2 = new Book();
			b2.setBookName("Spring");
			
			Book b3 = new Book();
			b3.setBookName("Hibernate");
			
			Author a1 = new Author();
			a1.setAuthorName("James Gosling");
			b1.setAuthor(a1);
			b2.setAuthor(a1);
			b3.setAuthor(a1);
			
			session.beginTransaction();
			
			session.save(b1);
			session.save(b2);
			session.save(b3);
			
			session.getTransaction().commit();*/
			
			
			
		} catch(Exception ex){
			ex.printStackTrace();
			session.getTransaction().rollback();
			
			
			
		} finally{
			
			session.close();
			sessionFactory.close();
			
		}
	}
	
}
