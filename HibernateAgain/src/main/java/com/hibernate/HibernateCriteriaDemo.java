package com.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCriteriaDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria c = session.createCriteria(Students.class);
		List<Students> list = c.list();
		for(Students s:list) {
			System.out.println(s);
		}
		
		session.close();

	}

}
