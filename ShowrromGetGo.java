package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.ShowroomDto;

public class ShowrromGetGo {
          
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		ShowroomDto showroom=new ShowroomDto();
		
		showroom.setId(5533);
		showroom.setName("bajaj showroom");
		showroom.setLocation("savlanga road");
		showroom.setType("Vehicle showroom");
		
		
		Object obj=showroom.clone();
		ShowroomDto showroomcopy=(ShowroomDto)obj;
		
		System.out.println(showroom);
		System.out.println(showroomcopy.toString());
		
		
	}

}
