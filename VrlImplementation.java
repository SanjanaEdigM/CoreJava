package com.xworkz.redbusapp.vrl;

import com.xworkz.redbusapp.contract.RedBusContract;

public class VrlImplementation implements RedBusContract{

	@Override
	public int minBooking() {
		System.out.println("inside minBooking()");
		return 19;
	}

	@Override
	public boolean checkWarrenty() {
		System.out.println("inside checkWarrenty()");
		return true;
	}

}
