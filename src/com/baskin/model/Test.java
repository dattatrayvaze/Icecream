package com.baskin.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[]) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Icecream icecream = new Scoop("Vanilla", 40, null,null);
	session.save(icecream);
	}
}
