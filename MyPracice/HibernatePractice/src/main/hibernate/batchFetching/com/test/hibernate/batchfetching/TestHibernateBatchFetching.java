package com.test.hibernate.batchfetching;

import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;

import com.test.hibernate.util.HibernateConfigUtil;
import com.test.workingwithobjects.Author;
import com.test.workingwithobjects.Book;

public class TestHibernateBatchFetching {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		StatelessSession session = null;
		try {
            
			session= sessionFactory.openStatelessSession();
			session.beginTransaction();
             Author a = new Author();
             a.setAuthorName("dsggsd");
             a.setAuthorRegistration("3253223535");
             
			

		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();

		} finally {

			session.close();
			sessionFactory.close();

		}
	}

	private static void modifyBook(Book b, int i) {

		b.setBookName("Gavin King --" + i+6);

	}

}
