package com.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQL_App {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("HQL.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// Query<Employees> query = session.createQuery("FROM Employees",
		// Employees.class);
		Query<Object[]> query = session.createQuery("SELECT emp_name, emp_address FROM Employees WHERE emp_age=:age",
				Object[].class);
		query.setParameter("age", 25);
		List<Object[]> result = query.list();

		for (Object[] row : result) {
			System.out.println("Name: " + row[0] + ", Address: " + row[1]);
		}

	}

}
