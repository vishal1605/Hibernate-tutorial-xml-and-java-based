package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PaginationDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query query = session.createQuery("from Students");
		
		// Implementing Pagination using hibernate
		
		query.setFirstResult(0);   //Where to start  ---Mysql index Always start with 0
		
		query.setMaxResults(5);    // How many result you want to see
		
		List<Students> list = query.list();
		
//		list.forEach(stud -> System.out.println(stud));
		
		for(Students s:list) {
			System.out.println(s);
		}

		session.close();

	}

}
