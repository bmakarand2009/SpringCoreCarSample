package com.ajcp.withspring.v2annotation.testimpl;

import com.ajcp.withspring.v2annotation.main.EngineService;


public class EngineImpl implements EngineService{
	
	public static String V4_ENGINE ="V4";
	public static String V6_ENGINE ="V6";
	public static String V8_ENGINE ="V8";
	
	private String type;
	private boolean isEngineGood;

	public String getType() {
		return type;
	}

	/*
	 * TODO : Convert the String type to Enum so that we 
	 * restrict the user to only enter the valid engine types
	 */
	public void setType(String type) {
		this.type = type;
	}

	/*
		TODO add properties  to engine like oilLevel,temperature,
		leakage indicators etc, and write logic to see if level is good
		else return false if engine is not good
	 * 
	 */
	public boolean isEngineGood() {
		return isEngineGood;
	}
	
	/*
	 * TODO: Nice toString() once the class matures
	 */
	public String toString(){
		return "type="+type ;
	}
	
	
}
