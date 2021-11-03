package com.xworkz.tubelight;

public class LightFactory {
   
	public static ISwitch getLight(String type) {
		if(type.equals("TubeLight")){
			return new TubeLightImplementation();
		}
		
		else {
			System.out.println("ligth not found");
		}
		
		return null;
	}
}
