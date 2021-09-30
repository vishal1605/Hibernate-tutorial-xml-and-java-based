package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        Students stud = new Students();
        stud.setName("Rahul");
        stud.setCity("Thane");
        stud.setLastName("maurya");
        
//        Students stud1 = new Students();
//        stud1.setName("Amit");
//        stud1.setCity("Ghatkopar");
//        stud1.setLastName("nishad");
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(stud);
        
        tx.commit();
        session.close();
        System.out.println("Successful");
    }
}
