package com.ajcp.nospring.v2;

import java.util.ArrayList;
import java.util.List;

import com.ajcp.nospring.v2.Tire;


public class DriverMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		List<TireIf> aTires = new ArrayList<TireIf>();
		aTires.add(new Tire(Tire.ALL_SEASON_TIRE));
		aTires.add(new Tire(Tire.ALL_SEASON_TIRE));
		aTires.add(new Tire(Tire.ALL_SEASON_TIRE));
		aTires.add(new Tire(Tire.ALL_SEASON_TIRE));
		
		EngineIf e1 = new Engine();
		e1.setType(Engine.V4_ENGINE);

		CarIf aCar = new Car(aTires,e1);
		System.out.println(aCar);
	}

}
