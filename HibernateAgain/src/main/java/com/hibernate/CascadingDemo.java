package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.beans.Bike;
import com.hibernate.beans.Person;

public class CascadingDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Mukesh Ambani");
		p.setCity("Mumbai");
		
		Bike b = new Bike();
		b.setBikeName("BMW");
		b.setPer(p);
		
		Bike b1 = new Bike();
		b1.setBikeName("Audi A4");
		b1.setPer(p);
		
		List<Bike> list = new ArrayList<>();
		list.add(b);
		list.add(b1);
		
		p.setBikes(list);
		
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(p);

		tx.commit();
		session.close();
	}

}
