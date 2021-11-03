package com.xworkz.socket;

public class ChargerImplementation implements Socket{

	@Override
	public void chargerConnected() {
		System.out.println("Mobile charging");
		
	}

	@Override
	public void chargerNotConnected() {
		System.out.println("Mobile Not Charging");
		
	}
	
}
