package com.ajcp.nospring.v1;

import java.util.ArrayList;

/**
 * Demo to show a Raw Car class without use of any dependency 
 * decoupling concepts.
 */
public class Car {
	
	private ArrayList<Tire> tires;
	private Engine engine;
	/*
	 * TODO validate the noOfAreTires for
	 * 1. There are 4 tires, not less not more, none of them is null
	 * 2. are and are of same type only
	 * 3. they should be different instance of tire, not the same 
	 * Ideally such type of validation should go in another class
	 * like Utils.java, which will have all static helper methods
	 * to execute the logic.
	 */
	public Car(ArrayList<Tire> tires, Engine engine) throws Exception {
		super();
		this.tires = tires;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [tires=" + tires + ", engine=" + engine + "]";
	}

	
	
	

}
