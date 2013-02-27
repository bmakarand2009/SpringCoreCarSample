package com.ajcp.withspring.v2annotation.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ajcp.withspring.v2annotation.testimpl.Car;
import com.ajcp.withspring.v2annotation.testimpl.Engine;

@Component
public class DriverMain {

	/**
	 * @param args
	 */
	private ApplicationContext context = null;

	
	private Car car;
	
	private Engine engine;
	
	@Autowired
	public void setCar(Car car){
		this.car = car;
	}
	
	@Autowired
	public void setEngine(Engine engine){
		this.engine = engine;
	}
//	private CarKeysIf carKeys;
	
//	@Required
//	public void setCarKeys(CarKeysIf carKeys){
//		this.carKeys = carKeys;
//	}
	public static void main(String[] args) throws Exception
	{
		DriverMain dm = new DriverMain();
		dm.createCarAndDrive();
	}
	public DriverMain(){
		 context =
			new ClassPathXmlApplicationContext("BeansWithAnnotation.xml");
	}
	
	

	private void createCarAndDrive() {
//		CarIf aCar = (CarIf) context.getBean("car");
		System.out.println(car);
		System.out.println(engine.getType());
	}
	

}
