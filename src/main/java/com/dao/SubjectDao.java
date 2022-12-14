package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Subject;



public class SubjectDao {
	public int storeSubject(Subject subject) {
        try {
            Configuration con = new Configuration();
            con.configure("hibernate.cfg.xml");
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tran = session.getTransaction();
            tran.begin();
                    session.save(subject);
            tran.commit();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
	
	 public List<Subject> findAllSubject() {
         Configuration con = new Configuration();
         con.configure("hibernate.cfg.xml");
         SessionFactory sf = con.buildSessionFactory();
         Session session = sf.openSession();
         Query qry = session.createQuery("select sb from Subject sb");
         List<Subject> listOfSubject = qry.getResultList();
         return listOfSubject;
 }


}
