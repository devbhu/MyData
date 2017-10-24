package com.test.tableperclass;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.util.HibernateConfigUtil;

public class TestInheritance {

	public static void main(String[] args) {
		
	/*	Payment p = new Payment();
		p.setAmount(BigDecimal.valueOf(200));
		*/
		/*Payment p1 = new Payment();
		p1.setAmount(BigDecimal.valueOf(201));
		
		Payment p2 = new Payment();
		p2.setAmount(BigDecimal.valueOf(202));
		
		Payment p3 = new Payment();
		p3.setAmount(BigDecimal.valueOf(203));*/
		
		CreditCardPayment ccPayment = new CreditCardPayment();
		
		ChequePayment chequePayment = new ChequePayment();
		
		CashPayment cashPayment = new CashPayment();
		
		ccPayment.setAmount(BigDecimal.valueOf(200.99));
		ccPayment.setCreditCardType("Amex");
		
		chequePayment.setAmount(BigDecimal.valueOf(900.78));
		cashPayment.setAmount(BigDecimal.valueOf(450.88));
		cashPayment.setType("CASH");
		
		Payment p = new Payment();
		p.setAmount(BigDecimal.valueOf(56.909));
	
		/*p1.setPaymentDetails(ccPayment);
		p2.setPaymentDetails(chequePayment);
		p3.setPaymentDetails(cashPayment);

		*/
		SessionFactory sessionFactory = HibernateConfigUtil
				.configure("com/test/hibernate/resources/test-hibernate-mapping.cfg.xml");

		Session session = sessionFactory.openSession();
		try{
			
		 //List<Payment>	paymentDetails = session.createQuery(" from com.test.tableperclass.Payment payment").list();
		
		//System.out.println(paymentDetails);
		 
		session.beginTransaction();
		
		//session.delete(paymentDetails.get(0));
		//session.save(p1);
		//session.save(p2);
		//session.save(p3);
	 /*   session.save(ccPayment);
		session.save(chequePayment);
		session.save(cashPayment);*/
		session.save(p);
		session.getTransaction().commit();
		}catch(Exception ex){
			//if(session.getTransaction().isActive())
		 session.getTransaction().rollback();
		 ex.printStackTrace();
			
		}
		finally{
			
			session.close();
		sessionFactory.close();
			
		}
		
	}
	
}
