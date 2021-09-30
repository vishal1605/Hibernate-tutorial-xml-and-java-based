package com.hibernate.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.Bike;
import com.hibernate.beans.Person;

public class OnetoManyMap {

	public static void main(String[] args) {
		
//		Person p = new Person();
//		p.setName("Vishal");
//		p.setCity("Kalyan");
//		
//		Bike b = new Bike();
//		b.setBikeName("Honda Active");
//		b.setPer(p);
//		
//		
//		Bike b1 = new Bike();
//		b1.setBikeName("Suzuki Hayabusa");
//		b1.setPer(p);
//		
//		Bike b2 = new Bike();
//		b2.setBikeName("Bajaj pulser");
//		b2.setPer(p);
//		
//		List<Bike> list = new ArrayList<>();
//		list.add(b);
//		list.add(b1);
//		list.add(b2);
//		p.setBikes(list);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		session.save(p);
//		session.save(b);
//		session.save(b1);
//		session.save(b2);
		
		tx.commit();
		
		Person person = session.get(Person.class, 1);
		System.out.println(person.getName()+": "+person.getId()+": "+person.getCity());
		System.out.println(person.getBikes().size());
//		for(Bike b: person.getBikes()) {
//			System.out.println(b.getBikeName());
//		}
		session.close();
		System.out.println("Successful");

	}

}
