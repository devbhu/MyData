package com.test.spring.transaction.ItemDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.spring.transaction.Item;

public class ItemDao {
    
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation=Propagation.REQUIRED)
	public void saveItemObject(Item item) {
        System.out.println(this);
		Session sesion = getSessionFactory().getCurrentSession();
		sesion.saveOrUpdate(item);
		//sesion.flush();

	}

}
