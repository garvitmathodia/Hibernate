package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.entities.Song;

@SpringBootApplication
public class HibernateLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateLearningApplication.class, args);
	}

}
