package com.hibernate.test;

import org.hibernate.SessionFactory;

import com.hibernate.util.HibernateUtils;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();
		SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();
		System.out.println(sessionFactory1 + "  " +sessionFactory2); //both object are different 
		//every time the new object of sessionFactory got created
	}
}
