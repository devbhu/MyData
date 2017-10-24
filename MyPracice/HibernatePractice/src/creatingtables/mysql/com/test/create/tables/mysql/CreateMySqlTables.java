package com.test.create.tables.mysql;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.hibernate.util.HibernateConfigUtil;
import com.test.workingwithobjects.Author;
import com.test.workingwithobjects.Book;

public class CreateMySqlTables {

public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-my-sql-mapping.cfg.xml");
		Session session = null;
		try{
		session= sessionFactory.openSession();
		
		
		
		Author a  = new Author();
		a.setAuthorName("James Gosling");
		a.setAuthorRegistration("47385834");
		
		Set<Book>books = new HashSet<Book>();
		
		Book b = new Book();
		b.setBookName("JAVA");
		books.add(b);
		
		a.setBooks(books);
		
		Transaction tx1 = session.beginTransaction();
		
		session.save(a);
		
		tx1.commit();
		
		
		} catch(HibernateException ex){
			
			ex.printStackTrace();
		}
		finally{
			session.close();
			sessionFactory.close();
			
		}
		
		
	}

	
}
