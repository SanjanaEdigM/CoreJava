package com.xworkz.bookmyshow;

public class Pvr {
    
	
	private BookMyShowContract book;
	
	public Pvr(BookMyShowContract book) {
		this.book=book;
	}
	
	public void acceptBooking() {
		System.out.println("Inside acceptBooking() ");
		boolean warranty=book.checkWarranty();
		if(warranty) {
			int booking=book.seatsBooking();
			if(booking<=50) {
				System.out.println("Can accept booking");
			}
			else {
				System.out.println("cannot accept booking ");
			}
		}
		else {
			System.out.println("check warranty");
		}
	}
}
