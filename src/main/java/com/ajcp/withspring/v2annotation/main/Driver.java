package com.ajcp.withspring.v2annotation.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Driver {

	private String name;
	@Autowired // beans are autowired by Type
	private EngineService engineService;
	
	@Autowired
	@Qualifier("tire1")
	private TireService tireService;
	
	
	public void createCarAndDrive() {
		StringBuilder sb = new StringBuilder();
		sb.append("Autowire ByType example, Brand Name of Tire=")
		.append(tireService.getBrand()).append("\n")
		.append("@Autowired Example, Engine Type is=")
		.append(engineService.getType()).append("\n")
		.append("setterInject Example, Driver Name is=")
		.append(name);
		 System.out.println(sb.toString());
		
	}
	//Getters And Setters
	public EngineService getEngineService() {
		return engineService;
	}
	public void setEngineService(EngineService engineService) {
		this.engineService = engineService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
