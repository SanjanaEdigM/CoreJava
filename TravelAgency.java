package com.xworkz.redbusapp.agency;

import com.xworkz.redbusapp.contract.RedBusContract;

public class TravelAgency {

	private RedBusContract redBusContract;
	   
	 String name  = "Balaji Travels";

	public TravelAgency(RedBusContract redBusContract) {
		this.redBusContract = redBusContract;
	}

	public void acceptBooking() {
		System.out.println("inside acceptBooking()");
      System.out.println("checking booking  for "+name+"");
     boolean warrenty =redBusContract.checkWarrenty();
     if(warrenty) {
    	  int min =     redBusContract.minBooking();
    	  if(min >= 0 && min <= 20) {
    		  System.out.println("can accept booking ");
    	  }
    	  else {
    		  System.out.println("cannot accpet booking");
    	  }
     }
     else {
    	 System.out.println("please check warrenty");
     }
	}

}
