package com.ajcp.nospring.v1;

import java.util.ArrayList;

public class DriverMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ArrayList<Tire> aTires = new ArrayList<Tire>();
		aTires.add(new Tire(Tire.ALL_SEASON_TIRE));
		aTires.add(new Tire(Tire.ALL_SEASON_TIRE));
		aTires.add(new Tire(Tire.ALL_SEASON_TIRE));
		aTires.add(new Tire(Tire.ALL_SEASON_TIRE));

		Engine e1 = new Engine();
		e1.setType(Engine.V4_ENGINE);

		Car aCar = new Car(aTires, e1);

		System.out.println(aCar);
	}

}
