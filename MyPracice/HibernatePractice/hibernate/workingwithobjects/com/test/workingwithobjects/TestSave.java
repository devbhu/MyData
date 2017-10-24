package com.test.workingwithobjects;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestSave {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		Session session = null;
		try{
			
		session= sessionFactory.openSession();
	
		/*
     		Author a = new Author();
     		a.setAuthorId(353);
			a.setAuthorName("Gavin king");
			a.setAuthorRegistration("483949303");
			
			Book book1 = new Book();
			book1.setBookName("HIbernate");
			book1.setAuthorId(353);
			Book book2 = new Book();
			book2.setBookName("HIbernate355");
			book2.setAuthorId(353);
			
			session.save(a);
			session.save(book1);
			session.save(book2);*/
		session.beginTransaction();
		  Author a = (Author)session.get(Author.class, 353);
		    
		    Set<Book>books = a.getBooks();
		    
		    for(Book b : books){
		    	
		    	System.out.println(b);
		    	
		    }
				
			
			session.getTransaction().commit();
			
			
		} catch(Exception ex){
			ex.printStackTrace();
			session.getTransaction().rollback();
			
			
			
		} finally{
			
			session.close();
			sessionFactory.close();
			
		}
	}
	
}
