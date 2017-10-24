package com.test.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfigUtil {

	
	public static SessionFactory configure(String cfgResourcePath){
		
		
		SessionFactory sessionFactory = new Configuration().configure(cfgResourcePath).buildSessionFactory();
		
		return sessionFactory;
		
		
	}
	
	
}
