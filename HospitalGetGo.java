package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.HospitalDto;

public class HospitalGetGo {
    public static void main(String[] args) throws CloneNotSupportedException {
		
    	HospitalDto hospital=new HospitalDto();
    	
    	hospital.setName("Fortis");
    	hospital.setLocation("Jaynagar");
    	hospital.setType("MultiSpeciality");
    	hospital.setOrgType("Private");
    	
    	 Object obj=hospital.clone();
    	 HospitalDto hospitalcopy=(HospitalDto)obj;
    	
    	System.out.println(hospital);
    	System.out.println(hospitalcopy.toString());
    	
    	
	}
		
}
