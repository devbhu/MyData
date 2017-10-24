package com.test.basicormapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.basicormapping.model.EmployeeDepartmentView;
import com.test.hibernate.util.HibernateConfigUtil;

public class TestSubSelect {

	public static void main(String[] args) {
		

		SessionFactory sFactory = HibernateConfigUtil
				.configure("com/basic/ormaping/hibernate.cfg.xml");

		Session s = sFactory.openSession();

		List bm = s.createQuery("from EmployeeDepartmentView as v ").list();
	
		System.out.println("IS list empty : " + bm.isEmpty());
		
		System.out.println(bm);
		
		//EmployeeDepartmentView vv= new EmployeeDepartmentView();
		//System.out.println(vv);
		
		//s.beginTransaction();
		
		
		//EmployeeDepartmentView edv = (EmployeeDepartmentView)bm.get(0);
		
		//edv.setDepartmentName("oxford");
		//s.update(edv);
		
		//s.delete(edv);
		
		//s.getTransaction().commit();
		
		
		
		
	}
	
}
