package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.TravelsDto;

public class TravelsGetGo {
   public static void main(String[] args) throws CloneNotSupportedException {
	 
	  TravelsDto travels=new TravelsDto();
	  
	  travels.setName("Sai travels");
	  travels.setPrice(10000);
	  travels.setDestination("siradi");
	  
	  Object obj=travels.clone();
	  TravelsDto travelscopy=(TravelsDto)obj;
	  
	  System.out.println(travels);
	  System.out.println(travelscopy.toString());
	   
   
	   
 }
}
