package com.xworkz.swiggy;

public class Restaurant {
  
	
	private SwiggyContract swiggy;
	
	public Restaurant(SwiggyContract swiggy) {
	    this.swiggy=swiggy;
	}
	
	public void acceptOrder() {
		System.out.println("inside accept order");
		System.out.println("Checking for south Indian dishes");
		
		boolean warranty=swiggy.checkWarranty();
		if(warranty) {
			String availableSouthIndianDishes=swiggy.SouthIndianDishAvailable();
			if(availableSouthIndianDishes=="masala dosa") {
				System.out.println("can accept order");
			}
			  else {
				System.out.println("food item not available");
			  }		
			}
		else {
			System.out.println("Please check warranty");
		}
	}	
}
