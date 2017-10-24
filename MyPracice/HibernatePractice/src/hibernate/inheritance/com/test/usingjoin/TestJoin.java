package com.test.usingjoin;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestJoin {
public static void main(String[] args) {
	
	SessionFactory sessionFactory = HibernateConfigUtil
			.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");
	
	Session session= sessionFactory.openSession();
	
	try{
		
		session.beginTransaction();
		
		Person p = new Person();
         p.setPersonName("Arindam");
     //    p.setPersonVersion(0);
        p.setPersonCity("Jorhat");
       p.setPersonId(new Integer(3));
        p.setPersonCountry("India");
         p.setPersonState("Assam");
         
         session.saveOrUpdate(p);
         session.getTransaction().commit();
         
       List datas = session.getNamedQuery("SQL_GET_ALL_EMPLOYEE").list();
       System.out.println(datas);
	}
	
	finally{
		session.close();
		sessionFactory.close();
	}
	
}
}
