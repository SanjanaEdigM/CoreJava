package com.xworkz.socket;

public class SocketFactory {
  
	public static Socket getCharging(String connect,String swich) {
		if(connect.equals("Connected") && swich.equals("SwitchOn")) {
			return new ChargerImplementation();
		}
		else {
			System.out.println("Not connectes");
		}
		
		return null;
		
	}	
	
	
}
