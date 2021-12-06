package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.BottleDto;

public class BottleGetGo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		BottleDto bottle=new BottleDto();
		
		bottle.setId(567);
		bottle.setName("Bisleri");
		bottle.setPrice(10);
		bottle.setType("plastic");
		bottle.setLiters("50ml");		
		
		
		Object obj=bottle.clone();
		BottleDto bottlecopy=(BottleDto)obj;
		
		System.out.println(bottle);
		System.out.println(bottle.toString());
		
	}
	

}
