package test.collectionmapping.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestFetchingMapCollection {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
		
		Session session= sessionFactory.openSession();
		
		try{
			
			List<Question> questions= session.createQuery("from QuestionClass q").list();
			
			for(Entry entry : questions.get(0).getUserAnswers().entrySet()){
				
				entry.setValue(new Answer("Gavin King"));
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				
			}
			
			//deleting the question object;
			
			session.beginTransaction();
			
			//session.delete(questions.get(0));
			
		
			
			session.saveOrUpdate(questions.get(0));
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
