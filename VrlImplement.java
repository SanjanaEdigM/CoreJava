package com.xworkz.makemytrip;

public class VrlImplement implements MakeMyTripContract {

	@Override
	public int bookingAvailable() {
		System.out.println("Inside bookingAvailable() ");
		return 20;
	}

	@Override
	public boolean checkWarranty() {
		System.out.println("Inside checkWarranty()");
		return true;
	}
	

}
