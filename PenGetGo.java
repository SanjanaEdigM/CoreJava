package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.PenDto;

public class PenGetGo {
   
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		PenDto pen=new PenDto();
		
		pen.setId(34);
		pen.setName("Renoylds");
		pen.setPrice(5);
		pen.setType("BallPoint");
		
		Object obj=pen.clone();
		PenDto pencopy=(PenDto)obj;
		
		System.out.println(pen);
		System.out.println(pencopy.toString());
	}
}
