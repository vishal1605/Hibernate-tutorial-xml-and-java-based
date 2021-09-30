package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.Bike;
import com.hibernate.beans.Person;

public class OnetoOneMap {

	public static void main(String[] args) {
		
//		Person p = new Person();
//		p.setName("Vishal");
//		p.setCity("kalyan");
//		
//		Bike b= new Bike();
//		b.setBikeName("Suzuki Activa");
//		b.setPer(p);
//		p.setBike(b);
		
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
//        session.save(p);
//        session.save(b);
        
        tx.commit();
        
//        Person person = (Person)session.get(Person.class, 1);
//        System.out.println(person.getName());
//        System.out.println(person.getBike().getBikeName());
        
        
        session.close();
        System.out.println("Successful");

	}

}
