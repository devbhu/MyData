package com.test.persistent.collection;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.collection.internal.PersistentSet;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestPersistentCollection {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
			
		
			session.beginTransaction();
			Author a1 = new Author();
			a1.setAuthorName("Gavin King");
			
			HashSet<Books> books = new HashSet<Books>();
			Books b1= new Books();
			b1.setBookName("Action Hibernate");
			b1.setBookPrice(345.78);
			
			Books b2= new Books();
			b2.setBookName("Jboss Official hibernate");
			b2.setBookPrice(555.78);
			
			books.add(b1);
			books.add(b2);
			
			a1.setBooks(books);
			
			session.persist(a1);
			
			System.out.println((PersistentSet)a1.getBooks());
			
	
		    
			
		}catch(Exception ex){
			session.getTransaction().rollback();
			ex.printStackTrace();	
			
		}finally{
			
			session.close();
			sessionFactory.close();
			
		}
		
		
	}

}
