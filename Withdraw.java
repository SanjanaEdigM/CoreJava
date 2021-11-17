package com.xworkz.atmapp.withdraw;

import com.xworkz.atmapp.Exception.AtmException;

public class Withdraw {
    public void check(double amt,int pin) throws AtmException{
    	
    	if(pin!=0000) {
    	if( amt%100!=0 || amt>=25000) {
    		throw new AtmException();
    	
    }
    	
    	else {
    		
    		System.out.println("Thanks for using our ATM");
    	}
     }
	
   }
	
	
	
	
	
	
	
	
}
