package com.ajcp.withspring.v2annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context =
			new ClassPathXmlApplicationContext("BeansWithAnnotation.xml");
		Driver driver = (Driver) context.getBean("driver");
		driver.createCarAndDrive();

	}

}
