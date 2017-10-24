package test.manytoone.bidirectional;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestManyToOneBidirectional {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
			
			//saving authors
			session.beginTransaction();
			/*Author a1 = new Author();
			a1.setAuthorName("Gavin King");
			
			Set<Books> books = new HashSet<Books>();
			Books b1= new Books();
			//b1.setAuthor(a1);
			b1.setBookName("Action Hibernate");
			b1.setBookPrice(345.78);
			
			Books b2= new Books();
			//b2.setAuthor(a1);
			b2.setBookName("Jboss Official hibernate");
			b2.setBookPrice(555.78);
			
			books.add(b1);
			books.add(b2);
			
			a1.setBooks(books);
			*/
			//session.save(a1);
			
		    //......................................//
			//saving books
			
			Books b1 = new Books();
			b1.setBookName("Hibernate in Action");
			b1.setBookPrice(578.35);
			
			Books b2 = new Books();
			b2.setBookName("Official Jboss Doc");
			b2.setBookPrice(999.56);
			
			Author a1 = new Author();
			a1.setAuthorName("Gavin King");
			
		   	b1.setAuthor(a1);
		   	b2.setAuthor(a1);
			
			session.save(b1);
			session.save(b2);
			
			session.getTransaction().commit();
			
			//Fetching can be done from any sides basically in bidirectional.
			
			//For bidirectional mapping we can fetch from any sides.basically we can query from either Author or Books.
		
			
		}catch(Exception ex){
			session.getTransaction().rollback();
			ex.printStackTrace();	
			
		}finally{
			
			session.close();
			sessionFactory.close();
			
		}
		
		
	}

}
