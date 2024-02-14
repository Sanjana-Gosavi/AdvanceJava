package com.prowings.hibernatedemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeRepository {
	
	public static void main(String[] args) {
		

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		
		System.out.println("session factory object created successfully!!");
	}

}
