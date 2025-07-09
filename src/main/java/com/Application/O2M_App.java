package com.Application;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Associations.Answers;
import com.Associations.Questions;

public class O2M_App {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("OneToMany.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Questions q = session.find(Questions.class, 1);
		System.out.println(q);

//		Questions q1 = new Questions();
//		q1.setQID(1);
//		q1.setQuestion("What is Java?");
//
//		Answers a1 = new Answers();
//		a1.setAid(1);
//		a1.setAnswer("Java is a High level programming Language");
//		a1.setQue(q1);
//		Answers a2 = new Answers();
//		a2.setAid(2);
//		a2.setAnswer("Java follows OOP'S principles");
//		a2.setQue(q1);
//
//		List<Answers> ans = new ArrayList<Answers>();
//		ans.add(a1);
//		ans.add(a2);
//		q1.setAns(ans);
//		boolean status = false;
//		Transaction trans = session.beginTransaction();
//
//		try {
//			session.persist(q1);
//			session.persist(a1);
//			session.persist(a2);
//			status = true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (status == true) {
//				System.out.println("Data Inserted Successfully");
//				trans.commit();
//			} else {
//				System.out.println("Data Insertion Failed");
//				trans.rollback();
//			}
		session.close();
		sessionFactory.close();
		// }
	}

}