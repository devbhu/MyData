package com.test.pessismistic.lock;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.workingwithobjects.Author;

public class TestWriteLockMode {

	public static void main(String[] args) {
		try{
		SessionFactory sf = TestLockModeNone.getSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx1 = session.beginTransaction();
		
		 Author a1 = (Author)session.get(Author.class,6797,LockMode.UPGRADE); 
		 
		 
		 a1.setAuthorName("vickeyarindam123");
		 
		 
		 tx1.commit();
		 session.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
}
