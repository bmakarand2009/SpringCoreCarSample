package com.ajcp.withspring.v1.testimpl;

import com.ajcp.withspring.v1.main.TireIf;

public class Tire implements TireIf
{
	public static String ALL_SEASON_TIRE ="All_Season";
	public static String ALL_TERRIAN_TIRE ="All_Terrian";
	public static String WINTER_USE_TIRE ="Winter_Use";

	private String type;

	/**
	 *  TODO - Convert the type from String to Enum so that it
	 *  only allows to select the valid tire types only
	 */
	
	public Tire() {
		type = ALL_TERRIAN_TIRE;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "Tire type=" + type;
	}
	
	
}
