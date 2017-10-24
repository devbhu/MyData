package com.test.fetch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.hibernate.util.HibernateConfigUtil;
import com.test.workingwithobjects.Author;
import com.test.workingwithobjects.Book;

public class FetchusingBatch {
	
public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		Session session = null;
		try{
			
		session= sessionFactory.openSession();
	
		Transaction tx1 = session.beginTransaction();
	//Creating bulk data for fetching 1 author 20 books	
	/*	for(int i=1;i<=10;i++){
		Author a = new Author();
		a.setAuthorName("James Gosling"+i);
		a.setAuthorRegistration("3535252"+i);
		Set<Book> books = new HashSet<Book>();
		for(int j=1;j<=20;j++){
			
			Book b = new Book();
			b.setBookName("ABCD"+j);
			books.add(b);
			
		}
		a.setBooks(books);
		session.save(a);

		}*/
		
	Author as = (Author) session.get(Author.class, 1);
	as.getBooks().size();
		
	/*   for(Author a : as){
			
			Set<Book> books = a.getBooks();
			books.size();
		}*/
		
		
		tx1.commit();
		
		} catch(HibernateException ex){
			
			ex.printStackTrace();
		}
		finally{
			if(session.isOpen())
			session.close();
			sessionFactory.close();
			
		}
		
		
	}

}
