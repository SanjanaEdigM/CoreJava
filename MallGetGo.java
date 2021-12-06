package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.MallDto;

public class MallGetGo {
   
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		MallDto mall=new MallDto();

		mall.setMallName("Global Mall");
		mall.setLocation("Binnipete");
		mall.setNumber(124578694);
		mall.setNumOfGates(4);
		mall.setNumOfShop(70);
		
		
		Object obj=mall.clone();
		MallDto mallcopy=(MallDto)obj;
		
       System.out.println(mallcopy.toString());
		
	}
	
}
