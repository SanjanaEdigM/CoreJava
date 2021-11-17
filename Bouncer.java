package com.xworkz.pub.bouncer;

import com.xworkz.pub.Exception.PubException;

public class Bouncer {
	
	public void check(int age)  throws PubException {
		if(age<=18) {
			
			throw new PubException();   //throwing object in PubException
		}
		else {
			System.out.println("please enter.... and Enjoyyyyyy");
		}
	}
	
	

}
