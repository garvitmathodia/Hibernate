package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.hibernate.entities.Song;
import com.hibernate.util.HibernateUtils;

public class UpdateApp {
	
	@Autowired
	private HibernateUtils hibernateUtils;

	public static void main(String[] args) {
		
		Session session = HibernateUtils.getSessionFactory().openSession();
		
		Song song =session.get(Song.class, 2);
		song.setSongName("desi den balzirian");
		session.beginTransaction();
		session.update(song);
		session.getTransaction().commit();
	}
}
