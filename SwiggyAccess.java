package com.xworkz.swiggy;

public class SwiggyAccess implements SwiggyContract {

	@Override
	public boolean checkWarranty() {
		System.out.println("Inside checkWarranty()");
        return true;		
	}

	@Override
	public String SouthIndianDishAvailable() {
			System.out.println("inside SouthIndianDishAvailable()");
			return "masala dosa";
	}
       
}
