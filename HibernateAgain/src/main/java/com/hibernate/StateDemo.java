package com.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StateDemo {

	public static void main(String[] args) {
		
		Students s = new Students();
		
		s.setName("Rahul");
		s.setCity("Sahad");
		s.setLastName("Jha");
		s.setDate(new Date());
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		Students students = session.get(Students.class, 4);
//		session.delete(students);
//		tx.commit();
		
		
		//HQL select all Data And specific data
		List<Students> list = session.createQuery("from Students").list();
//        List<Students> list = session.createQuery("from Students where lastName='Mauraya'").list();
//		List<Students> list = session.createQuery("from Students where lastName=:x and name=:y").setParameter("x", "mauraya").setParameter("y", "rahul").list();
        for(Students stud:list) {
        	System.out.println(stud);
        }
        
		session.save(s);
		
		//HQL delete Query
//		String query = "delete from Students where id=:x";
//		Query q = session.createQuery(query);
//		q.setParameter("x", 6);
//		int e = q.executeUpdate();
//		System.out.println("Successful");
//		System.out.println(e);
		
		
		//HQL Update Query
//		String query = "update Students set name=:a, city=:b, lastName=:c where id=:x";
//		Query q = session.createQuery(query);
//		q.setParameter("x", 1);
//		q.setParameter("a", "Sahil");
//		q.setParameter("b", "Pune");
//		q.setParameter("c", "singh");
//		int r = q.executeUpdate();
//		
//		System.out.println("Successful");
		
		tx.commit();
        
        
		session.close();
		

	}

}
