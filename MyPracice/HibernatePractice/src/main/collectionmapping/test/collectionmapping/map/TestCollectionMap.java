package test.collectionmapping.map;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestCollectionMap {

	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
			
			Question q = new Question();
			
			q.setQuestion("Who is the father of java language ? ");
			
			HashMap<UserName,Answer>userAnswers = new HashMap<UserName,Answer>();
			
			userAnswers.put(new UserName("Arindam"), new Answer("Gavin king"));
			userAnswers.put(new UserName("Vickey"), new Answer("Rod Johnson"));
			userAnswers.put(new UserName("Arindam"), new Answer("James Gosling"));
			
			
			q.setUserAnswers(userAnswers);
			
			session.beginTransaction();
			
			session.save(q);
			
			System.out.println(q);
			
			session.getTransaction().commit();
			
			
			
		} catch(Exception ex){
			session.getTransaction().rollback();
			ex.printStackTrace();
			
			
		} finally{
			
			session.close();
			sessionFactory.close();
			
		}
		
		
	}
	
}
