package com.xworkz.atm;

public class AtmFactory {
      
	public static AtmCard getAmount(int amt,String card) {
		if(amt==3000 && card.equals("BOB")) {
			return new AtmImplementation();
		}
		
		else {
	         System.out.println("No balance");
		}
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
