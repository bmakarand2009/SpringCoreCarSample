package com.ajcp.withspring.v2annotation.testimpl;

import java.util.List;

import com.ajcp.withspring.v2annotation.main.CarService;
import com.ajcp.withspring.v2annotation.main.EngineService;
import com.ajcp.withspring.v2annotation.main.TireService;


/**
 * Demo to show a Raw Car class without use of any dependency 
 * decoupling concepts.
 */
public class CarImpl implements CarService {
	
	private List<TireService> tires;
	private EngineService engine;
	/*
	 * TODO validate the noOfAreTires for
	 * 1. There are 4 tires, not less not more, none of them is null
	 * 2. are and are of same type only
	 * 3. they should be different instance of tire, not the same 
	 * Ideally such type of validation should go in another class
	 * like Utils.java, which will have all static helper methods
	 * to execute the logic.
	 */
	public CarImpl(List<TireService> tires, EngineService engine) throws Exception {
		super();
		this.tires = tires;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [tires=" + tires + ", engine=" + engine + "]";
	}

	
	
	

}
