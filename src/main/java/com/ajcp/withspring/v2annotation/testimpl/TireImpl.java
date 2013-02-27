package com.ajcp.withspring.v2annotation.testimpl;

import com.ajcp.withspring.v2annotation.main.TireService;


public class TireImpl implements TireService
{
	public static String ALL_SEASON_TIRE ="All_Season";
	public static String ALL_TERRIAN_TIRE ="All_Terrian";
	public static String WINTER_USE_TIRE ="Winter_Use";

	private String type;
	private Brand brand;

	/**
	 *  TODO - Convert the type from String to Enum so that it
	 *  only allows to select the valid tire types only
	 */
	
	public TireImpl() {
		type = ALL_TERRIAN_TIRE;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String toString() {
		return "Tire type=" + type;
	}
	
	
}
