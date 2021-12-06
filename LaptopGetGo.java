package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.LaptopDto;

public class LaptopGetGo {
   
	public static void main(String[] args) throws CloneNotSupportedException {
		
		LaptopDto laptop=new LaptopDto();
		
		laptop.setId(234);
		laptop.setLaptopName("Hp");
		laptop.setPrice(44908);
		laptop.setProcessor("i5");
		laptop.setRam("8RAM");
		
		
		Object obj=laptop.clone();   //cloning lap
		LaptopDto lapcopy=(LaptopDto)obj; //downncasting
		
		
		System.out.println(laptop);
		System.out.println(lapcopy.toString());
		
		
		
		
	}
	

}
