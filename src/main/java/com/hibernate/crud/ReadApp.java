package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.hibernate.entities.Song;
import com.hibernate.util.HibernateUtils;

public class ReadApp {
	@Autowired
	private HibernateUtils hibernateUtils;

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		
		Song song = session.get(Song.class,2); //we can also use load method here but they work in different manner
		System.out.println(song);
	}
	
	
}
