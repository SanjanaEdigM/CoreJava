package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.StadiumDto;

public class StadiumGetGo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		StadiumDto stadium=new StadiumDto();
		
		stadium.setName("Nehru Stadium");
		stadium.setLocation("Gopi Circle");
		stadium.setOpenTime("6 am");
		stadium.setCloseTime("7 pm");
		
		
		Object obj=stadium.clone();
		StadiumDto stadiumcopy=(StadiumDto)obj;
		
		System.out.println(stadium);
		System.out.println(stadiumcopy.toString());
		
	}
	

	
}
