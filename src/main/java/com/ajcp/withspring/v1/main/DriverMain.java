package com.ajcp.withspring.v1.main;

import org.springframework.context.ApplicationContext;
import
org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		ApplicationContext context =
			new ClassPathXmlApplicationContext("Beans.xml");
//		List<TireIf> tireList =  (List<TireIf>)context.getBean("tireList");
//		EngineIf e1 = (EngineIf) context.getBean("engine");
		CarIf aCar = (CarIf) context.getBean("car");
		System.out.println(aCar);
	}

}
