package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.CanteenDto;

public class CanteenGetGo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CanteenDto canteen =new CanteenDto();
		
		canteen.setName("dosecamp");
		canteen.setLocation("Kuvempu Road");
		canteen.setFoodtype("SouthIndiana");
		
		
		Object obj=canteen.clone();
		CanteenDto canteencopy=(CanteenDto)obj;
		
		System.out.println(canteen);
		System.out.println(canteencopy.toString());
		
		
	}

}
