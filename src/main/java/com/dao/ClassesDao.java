package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Classes;


public class ClassesDao {
public int storeClasses(Classes classes) {
    try {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.getTransaction();
        tran.begin();
                session.save(classes);
        tran.commit();
        return 1;
    } catch (Exception e) {
        System.out.println(e);
        return 0;
    }
}

 public List<Classes> findAllClasses() {
     Configuration con = new Configuration();
     con.configure("hibernate.cfg.xml");
     SessionFactory sf = con.buildSessionFactory();
     Session session = sf.openSession();
     Query qry = session.createQuery("select c from Classes c");
     List<Classes> listOfClasses = qry.getResultList();
     return listOfClasses;
}

 
 public List<Classes> findClassesSubject() {
     Configuration con = new Configuration();
     con.configure("hibernate.cfg.xml");
     SessionFactory sf = con.buildSessionFactory();
     Session session = sf.openSession();
     Query qry = session.createQuery("select c.id, c.subject from Classes c");
     List<Classes> listOfClassesSubject = qry.getResultList();
     return listOfClassesSubject;
}

}
