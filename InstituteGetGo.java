package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.InstituteDto;

public class InstituteGetGo {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		InstituteDto institute=new InstituteDto();
		
		institute.setName("X-workZ");
		institute.setLocation("Rajajinagar");
		institute.setCourse("Java");
		
		Object obj=institute.clone();
		
		InstituteDto institutecopy=(InstituteDto)obj;
		
		System.out.println(institute);
		System.out.println(institutecopy.toString());
		
		
		
	}
	

}
