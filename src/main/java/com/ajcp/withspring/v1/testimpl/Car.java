package com.ajcp.withspring.v1.testimpl;

import java.util.List;

import com.ajcp.withspring.v1.main.CarIf;
import com.ajcp.withspring.v1.main.EngineIf;
import com.ajcp.withspring.v1.main.TireIf;

/**
 * Demo to show a Raw Car class without use of any dependency 
 * decoupling concepts.
 */
public class Car implements CarIf {
	
	private List<TireIf> tires;
	private EngineIf engine;
	/*
	 * TODO validate the noOfAreTires for
	 * 1. There are 4 tires, not less not more, none of them is null
	 * 2. are and are of same type only
	 * 3. they should be different instance of tire, not the same 
	 * Ideally such type of validation should go in another class
	 * like Utils.java, which will have all static helper methods
	 * to execute the logic.
	 */
	public Car(List<TireIf> tires, EngineIf engine) throws Exception {
		super();
		this.tires = tires;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [tires=" + tires + ", engine=" + engine + "]";
	}

	
	

}
