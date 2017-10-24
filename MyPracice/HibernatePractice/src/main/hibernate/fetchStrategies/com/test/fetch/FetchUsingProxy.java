package com.test.fetch;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.hibernate.util.HibernateConfigUtil;
import com.test.workingwithobjects.Author;
import com.test.workingwithobjects.AuthorDetails;
import com.test.workingwithobjects.Book;

public class FetchUsingProxy {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		Session session = null;
		try{
			
		session= sessionFactory.openSession();
		
		Transaction tx1 = session.beginTransaction();
		
		AuthorDetails ad = (AuthorDetails)session.load(AuthorDetails.class, 1);
		
	   
		Object author = ad.getAuthor();
	
		

	    
		
		
		
/*		Set<Book>books = new HashSet<Book>();
		Book b = new Book();
		b.setBookName("xyz");
		books.add(b);
		 Author a = new Author();
		 
		 a.setAuthorName("James Gosling");
		 a.setAuthorRegistration("8383939");
		 a.setBooks(books);
		 
		 AuthorDetails ad = new AuthorDetails();
		 ad.setAuthorCity("Bangalore");
         ad.setAuthor(a);
         session.save(ad);*/
        
		/* String reg = a.getAuthorRegistration();
		 
		 Set<Book>books = a.getBooks();
		
		  books.size();		
		  
		  for(Book b : books){
			  
			 System.out.println(b.getBookName());
			  
		  }*/
		 
	//	 a.setAuthorName("34434dd");
		 
	/*	 System.out.println(HibernateProxyHelper.getClassWithoutInitializingProxy(a));
		 
		 Book b = new Book();
		 System.out.println(a.getAuthorName());
		 b.setAuthor(a);
		 b.setBookName("ABCD");
		 
		 session.save(b);
		 */
		 //System.out.println(a.getAuthorId());
//		 System.out.println(a.getAuthorName());
		
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
