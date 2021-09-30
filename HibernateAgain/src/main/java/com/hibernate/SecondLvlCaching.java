package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLvlCaching {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Students stud = session.get(Students.class, 8);
		System.out.println(stud);
		session.close();
		
		Session session1 = factory.openSession();
		
		Students s = session1.get(Students.class, 8);
		System.out.println(s);
		session1.close();

	}

}
