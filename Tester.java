package com.xworkz.makemytrip;

public class Tester {

	
	public static void main(String a[] ) {
		MakeMyTripContract  makeMyTrip=new VrlImplement();
		
		
		Agency agency=new Agency(makeMyTrip); //Abstraction
		agency.checkingAvailableBooking();	
		
	}
		
}
