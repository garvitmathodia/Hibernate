package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Song;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory = null;

	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Song.class);

			sessionFactory = configuration.buildSessionFactory(); // singleton design pattern 
		}
		
		return sessionFactory;
	}
}
