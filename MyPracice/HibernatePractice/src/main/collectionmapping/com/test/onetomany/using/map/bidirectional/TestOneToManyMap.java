package com.test.onetomany.using.map.bidirectional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import test.collectionmapping.map.Answer;
import test.collectionmapping.map.Question;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestOneToManyMap {

	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
			//saving author 
			/*Author a = new Author();
			a.setAuthorName("James Gosling");
			Book b = new Book();
			//b.setAuthor(a);
			Book b1 = new Book();
			//b1.setAuthor(a);
			b.setBookName("Java Book");
			b1.setBookName("Tech Book");
			
			Map<Integer,Book> authorBooks = new HashMap<Integer,Book>();
			
			authorBooks.put(4005, b);
			authorBooks.put(4006, b1);
			
			a.setBooks(authorBooks);
			
			session.beginTransaction();
			session.save(a);
			session.getTransaction().commit();*/
			
			//-------------------saving book-----------//
			
			Author a = new Author();
			a.setAuthorName("James Gosling");
			Book b = new Book();
	
			Book b1 = new Book();
			b1.setAuthor(a);
			b.setAuthor(a);
			b.setBookName("Java Book");
			b1.setBookName("Tech Book");
			
			
			session.beginTransaction();
			session.save(b);
			session.save(b1);
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
