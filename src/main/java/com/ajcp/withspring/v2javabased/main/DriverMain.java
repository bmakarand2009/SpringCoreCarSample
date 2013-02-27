package com.ajcp.withspring.v2javabased.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.ajcp.withspring.v2annotation.main.EngineService;

@Component
public class DriverMain {

	/**
	 * @param args
	 */
	private ApplicationContext context = null;
	
	public static void main(String[] args) throws Exception
	{
		DriverMain dm = new DriverMain();
		dm.createCarAndDrive();
	}
	public DriverMain(){
		 context = 
			   new AnnotationConfigApplicationContext(BeansConfig.class);
	}
	
	

	private void createCarAndDrive() {
		   EngineService engine = context.getBean(EngineService.class);
		   System.out.println(engine.getType());
	}
	

}
