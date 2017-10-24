package com.test.hibernate.controller;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.workingwithobjects.Author;

/**
 * Servlet implementation class HibernateController
 */
@WebServlet("/HibernateController")
public class HibernateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HibernateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.getWriter().print("Hello Hibernate");
		Context ctx = null;
		SessionFactory factory=null;
		UserTransaction tx = null;
		try {
			new Configuration().configure().buildSessionFactory();
			new Configuration().configure("hibernate-mysql.cfg.xml").buildSessionFactory();
			ctx = new InitialContext();
			
			SessionFactory sessionFactory1 = (SessionFactory)ctx.
			lookup("java:/hibernateNew/MySessionFactory");
			
			
			SessionFactory sessionFactory2 = (SessionFactory)ctx.
					lookup("java:/hibernateMysql/MySessionFactory");
			
			
			getServletContext().setAttribute("sessionFactory", factory);
			
			 tx =(UserTransaction) ctx.lookup("java:comp/UserTransaction");
			
			
			tx.begin();
			
			Session session = sessionFactory1.getCurrentSession();
			
			Session session2 = sessionFactory2.getCurrentSession();
			
			Author a = new Author();
			//a.setAuthorId(902);
			a.setAuthorName("ADFRGJ");
			a.setAuthorRegistration("90084637");
			
			Author a1 = new Author();
			//a.setAuthorId(902);
			a1.setAuthorName("ADFRGJ");
			a1.setAuthorRegistration("90084637");
			
			session.save(a);
			session2.save(a1);

			tx.commit();
			 
			
			 
		    }
	
			catch (Exception e) {
			    try {
					tx.rollback();
				} catch (IllegalStateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SystemException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	
	

}
