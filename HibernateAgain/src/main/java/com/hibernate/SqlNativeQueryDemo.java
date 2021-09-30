package com.hibernate;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SqlNativeQueryDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		String query = "select * from students_details";
		NativeQuery q = session.createSQLQuery(query);
		List<Object[]> list = q.list();  //Object is use because it return Objects of table , Not a class
		for(Object[] stud:list) {
			System.out.println(Arrays.toString(stud));   //For All Value
//			stud[0];            //this indicates index of your sql tables
		}
		
		session.close();

	}

}
