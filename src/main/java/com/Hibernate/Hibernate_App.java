package com.Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Employee;

public class Hibernate_App {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		
		config.configure();
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee ep1 = new Employee();
		ep1.seteid(2501);
		ep1.setName("Rajesh");
		ep1.setAge(21);
		ep1.setCity("Nalgonda");
		
		Employee ep2 = new Employee();
		ep2.seteid(2502);
		ep2.setName("Shiva");
		ep2.setAge(24);
		ep2.setCity("Hyderabad");
		boolean status = false;
		
		try {
			session.persist(ep1);
			session.persist(ep2);
			status=true;
		}
		catch(HibernateException e){
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(status==true) {
				transaction.commit();
				System.out.println("Data Inserted Successfully");
			}
			else {
				transaction.rollback();
				System.out.println("Data Insertion Failed");
			}
			session.close();
			sessionFactory.close();
		}
	}

}
