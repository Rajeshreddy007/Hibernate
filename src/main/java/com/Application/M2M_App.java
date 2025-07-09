package com.Application;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Associations.Courses;
import com.Associations.Students;

public class M2M_App {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("ManyToMany.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Students s1=session.find(Students.class, 2501);
		System.out.println(s1);
		
		Courses c = session.find(Courses.class, 1);
		System.out.println(c);

//		Courses c1 = new Courses();
//		c1.setCid(1);
//		c1.setCoursename("Java");
//
//		Courses c2 = new Courses();
//		c2.setCid(2);
//		c2.setCoursename("C");
//
//		Courses c3 = new Courses();
//		c3.setCid(3);
//		c3.setCoursename("C++");
//
//		Courses c4 = new Courses();
//		c4.setCid(4);
//		c4.setCoursename("Python");
//
//		List<Courses> cou1 = new ArrayList<Courses>();
//		cou1.add(c1);
//		cou1.add(c4);
//
//		List<Courses> cou2 = new ArrayList<Courses>();
//		cou2.add(c1);
//		cou2.add(c3);
//
//		List<Courses> cou3 = new ArrayList<Courses>();
//		cou3.add(c1);
//		cou3.add(c2);
//		cou3.add(c3);
//
//		Students sc1 = new Students();
//		sc1.setSid(2501);
//		sc1.setName("Rajesh");
//		sc1.setCou(cou3);
//
//		Students sc2 = new Students();
//		sc2.setSid(2502);
//		sc2.setName("Shiva");
//		sc2.setCou(cou1);
//
//		Students sc3 = new Students();
//		sc3.setSid(2503);
//		sc3.setName("Vishnu");
//		sc3.setCou(cou2);
//
//		Transaction trans = session.beginTransaction();
//		boolean status = false;
//
//		try {
//			session.persist(c1);
//			session.persist(c2);
//			session.persist(c3);
//			session.persist(c4);
//			session.persist(sc1);
//			session.persist(sc2);
//			session.persist(sc3);
//			status = true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (status) {
//				trans.commit();
//				System.out.println("Data Inserted Successfully");
//
//			} else {
//				trans.rollback();
//				System.out.println("Data Insertion Failed");
//
//			}
			session.close();
			sessionFactory.close();

//		}

	}

}
