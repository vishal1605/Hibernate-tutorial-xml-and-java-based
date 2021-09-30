package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		//Hibernate Fetch single data
		
		
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
//        Students students = (Students)session.get(Students.class, 4);
//        System.out.println(students.getName());
        
        Students load = session.get(Students.class, 4);
        System.out.println(load);
        
        session.close();
        factory.close();

	}

}
