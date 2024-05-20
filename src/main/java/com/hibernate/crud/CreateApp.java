package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.hibernate.entities.Song;
import com.hibernate.util.HibernateUtils;

public class CreateApp {
	@Autowired
	private HibernateUtils hibernateUtils;

	public static void main(String[] args) {
		// create configuration
		// create session factory
		// initialize the session object

		Session session = HibernateUtils.getSessionFactory().openSession();
		Song song = new Song(); //transient
		song.setSongId(1);
		song.setSongName("hare krishna hare Krishna");
		song.setSinger("don't know");
		session.beginTransaction();
		session.save(song); //persisted
		session.getTransaction().commit();

		session.close(); //detached

		System.out.println("song saved");
	}
}
