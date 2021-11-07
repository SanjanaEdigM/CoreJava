package com.xworkz.makemytrip;

public class Agency {

	private MakeMyTripContract trip;
	
	public Agency(MakeMyTripContract trip) {
		this.trip=trip;
	}
	
	public void checkingAvailableBooking() {
		System.out.println("Inside checkingAvailableBooking()");
		boolean warranty=trip.checkWarranty();
		if(warranty) {
			int available=trip.bookingAvailable();
			if(available>0 && available<21) {
				System.out.println("Booking available");
				
			}
			else {
				System.out.println("Booking closed");
			}
		}
			
			else {
				System.out.println("Check warranty");
			}
		
	}	
	
}
