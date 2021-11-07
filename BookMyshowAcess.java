package com.xworkz.bookmyshow;

public class BookMyshowAcess implements BookMyShowContract {

	@Override
	public int seatsBooking() {
		System.out.println("inside seatsBooking() ");
		return 50;
	}

	@Override
	public boolean checkWarranty() {
		System.out.println("inside checkWarranty() ");
		return true;
	}

}
