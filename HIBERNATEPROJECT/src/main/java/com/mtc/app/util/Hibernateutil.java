package com.mtc.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import com.mtc.app.entity.vendors;

public class Hibernateutil {
	
	private static SessionFactory sessionFactory;
	
	static{
		
		Configuration configuration = new Configuration();
		
		//Loads hibernate.cfg.xml
		configuration.configure();
		
configuration.addAnnotatedClass(vendors.class);
		
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		 sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
