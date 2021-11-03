package com.xworkz.atm;

import java.util.Scanner;

public class AtmCardTester {
    public static void main (String a[]) {
    	
    	System.out.println("Enter your amount input");
		Scanner amt=new Scanner(System.in);
		
		System.out.println("Enter your card input");
		Scanner card=new Scanner(System.in);
    	
		AtmCard ac=AtmFactory.getAmount(amt.nextInt(),card.next());
		
		 if(ac!=null) {
			 ac.amtWithDraw();
			 ac.balanceCheck();
		 }
    	
    	
    }	
	
}
