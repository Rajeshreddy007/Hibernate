package com.Application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Associations.Driver;
import com.Associations.Vehicle;

public class One2One_App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("OneToOne.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Vehicle v = new Vehicle();
		v.setVehicleId(2501);
		v.setType("Car");
		Driver d = new Driver();
		d.setDriverId(1);
		d.setName("Rajesh");
		d.setVehicle(v);
		v.setDriver(d);

		Transaction trans = session.beginTransaction();
		boolean status = false;

		try {
			session.persist(v);
			session.persist(d);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (status) {
				trans.commit();
				System.out.println("Data Inserted Successfully");
			} else {
				trans.rollback();
				System.out.println("Data Insertion Failed");
			}
			session.close();
			factory.close();
		}
	}
}
