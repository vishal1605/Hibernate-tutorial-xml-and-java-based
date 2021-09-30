package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1 {
	
	public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        Students stud = new Students();
        stud.setName("Nitesh");
        stud.setCity("Bostan");
        stud.setLastName("gupta");
        stud.setDate(new Date());
        
        //image Save process
        FileInputStream file = new FileInputStream("src/main/java/Capture-1.png");
        byte[] data = new byte[file.available()];
        file.read(data);
//        stud.setImg(data);
        
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
