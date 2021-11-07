package com.xworkz.redbusapp;

import com.xworkz.redbusapp.agency.TravelAgency;
import com.xworkz.redbusapp.contract.RedBusContract;
import com.xworkz.redbusapp.vrl.VrlImplementation;

public class AgencyTester {
	
	public static void main(String[] args) {
		RedBusContract busContract = new VrlImplementation();
		
		//Abstraction
		TravelAgency agency = new TravelAgency(busContract);
		 agency.acceptBooking();
	}

}
