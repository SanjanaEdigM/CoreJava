package com.xworkz.hospitalapp;
import java.util.Scanner;

import com.xworkz.hospitalapp.dto.AddressDTO;
import com.xworkz.hospitalapp.dto.AreaDTO;
import com.xworkz.hospitalapp.dto.CountryDTO;
import com.xworkz.hospitalapp.dto.DistrictDTO;
import com.xworkz.hospitalapp.dto.PatientDto;
import com.xworkz.hospitalapp.dto.StateDTO;
import com.xworkz.hospitalapp.dto.StreetDTO;

public class HospitalTester {
	public static void main(String a[]){
		
		 System.out.println("enter the size of an array");
		 Scanner sc=new Scanner(System.in);
		 int size=sc.nextInt();
		 
	  Hospital hospital=new Hospital(size);
	  
	  for(int i=0;i<size;i++){
		 //patientDto 
		  PatientDto dto1=new PatientDto();
		System.out.println("enter patient id");
			int patientId=sc.nextInt();
		  
		System.out.println("enter patient name");
			String patientName=sc.next();
		  
		System.out.println("enter patient contact no");
		  long contactNo=sc.nextLong();
		  
		   
		System.out.println("enter blood group");
		  String bloodGroup=sc.next();
		   
		System.out.println("enter the age");
		  int age=sc.nextInt();
		   
		System.out.println("enter the gender");
		  char gender=sc.next().charAt(0);
	  
	  dto1.setPatientId(patientId);
	  dto1.setPatientName(patientName);
	  dto1.setContactNo(contactNo);
	  dto1.setBloodGroup(bloodGroup);
	  dto1.setAge(age);
	  dto1.setGender(gender);
	  
	  
	  boolean isAdded1 = false;
	try {
		isAdded1 = hospital.createPatient(dto1);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	System.out.println(isAdded1);
	  
	  
	  //AddressDto
	  AddressDTO address1=new AddressDTO();
	  System.out.println("enter address id");
	  int addressId =sc.nextInt();	
	  address1.setAddressId(addressId);
	  System.out.println("enter address name");
	  String addressName =sc.next();
	  address1.setAddressName(addressName);
	  
	  
	  //CountryDto
	  CountryDTO country1=new CountryDTO();
	  System.out.println("enter country id");
	  int countryId =sc.nextInt();	
	  country1.setCountryId(countryId);
	  System.out.println("enter country name");
	  String countryName =sc.next();
	  country1.setCountryName(countryName);
	  
	  
	  //StateDto
	  StateDTO state1=new StateDTO();
	  System.out.println("enter state id");
	  int stateId =sc.nextInt();
	  state1.setStateId(stateId);
	  System.out.println("enter state name");
	  String stateName =sc.next();
	  state1.setStateName(stateName);
	  
	  
	  //DistrictDto
	  DistrictDTO district1=new DistrictDTO();
	  System.out.println("enter district id");
	  int districtId =sc.nextInt();	
	  district1.setDistrictId(districtId);
	  System.out.println("enter district name");
	  String districtName =sc.next();
	  district1.setDistrictName(districtName);
	  
	  
	  //AreaDto
	  AreaDTO area1=new AreaDTO();
	  System.out.println("enter area id");
	  int areaId=sc.nextInt();
	  area1.setAreaId(areaId);
	  System.out.println("enter area name");
	  String areaName =sc.next();
	  area1.setAreaName(areaName);
	  
	  //StreetDto
	  StreetDTO street1=new StreetDTO();
	  System.out.println("enter street id");
	  int streetId=sc.nextInt();	
	  street1.setStreetId(streetId);
	  System.out.println("enter street name");
	  String streetName =sc.next();
	  street1.setStreetName(streetName);
	  System.out.println("enter street No");
	  int streetNo=sc.nextInt();
	  street1.setStreetNo(streetNo);
	 
	 // has a realtion
	 dto1.setAddress(address1);      
	 address1.setCountry(country1);
	 country1.setState(state1);
	 state1.setDistrictDTO(district1);
	 district1.setArea(area1);
	 area1.setStreet(street1);
	  
	  }
	  int choice;
	  String text;
	  do{
		 System.out.println("Press 1 to get all Patient details");
		 System.out.println("Press 2 to get patient by id");
		 System.out.println("Press 3 to get patient by name");
		 System.out.println("Press 4 to get patient by Contact no");
		 System.out.println("Press 5 to get patient by Age");
		 System.out.println("Press 6 to get patient by BloodGroup");
		 System.out.println("Press 7 to get patient by gender");
		 
		 System.out.println("Enter your choice");
		 choice=sc.nextInt();
	  switch(choice) {
	  
	  case 1: try{
		  hospital.getAllDetails();
	  }catch(Exception sr) {
		  System.out.println("exception handled");
	  }
	          break;
	          
	  case 2: System.out.println("enter the patient id ");
	          
		PatientDto p1;
		try {
			p1 = hospital.getPatientById(sc.nextInt());
		
		      System.out.println(p1);
                if(p1!=null) {
                	System.out.println(p1);
                }
                	else {
                		System.out.println("Patient not found by id");
                	}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                
              break;
	  case 3: System.out.println("enter the patient by name");
	          PatientDto p2=hospital.getPatientByName(sc.next());
	          System.out.println(p2);
	             if(p2!=null) {
	            	System.out.println(p2);
	             }
	                  else {
	            	     System.out.println(p2);
	             }
	             
	             break;
	             
	  case 4:System.out.println("enter the patient by contactNo");
		PatientDto p3;
		try {
			p3 = hospital.getPatientByContactNo(sc.nextLong());
		
	         System.out.println(p3);
	             if(p3!=null) {
	            	 System.out.println(p3);
	             }
	                   else {
	            	 System.out.println("Patient not found by patient contact no");
	             }
		}
	             catch (Exception e) {
	     			// TODO Auto-generated catch block
	     			e.printStackTrace();
	     		}
	             break;
	             
	  case 5:System.out.println("enter the patient by Age");
		PatientDto p4;
		try {
			p4 = hospital.getPatientByAge(sc.nextInt());
		 
	         System.out.println(p4);
	              if(p4!=null) {
	            	  System.out.println(p4);
	              }
	                 else {
	                	 System.out.println("Patient not found by patient age");
	              }
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	              
	              break;
	              
	  case 6:System.out.println("enter patient by BloodGroup");
		PatientDto p5;
		try {
			p5 = hospital.getPatientByBloodGroup(sc.next());
		
		      System.out.println(p5);
		           if(p5!=null) {
		         	  System.out.println(p5);
		           }
		              else {
		             	 System.out.println("Patient not found by patient bloodGroup");
		           }
		}catch (Exception e) {
		   			// TODO Auto-generated catch block
		   			e.printStackTrace();
		   		}
		           
		           break; 
		           
	  case 7:System.out.println("enter patient by gender");
		PatientDto p6;
		try {
			p6 = hospital.getPatientByAge(sc.next().charAt(0));
		
		      System.out.println(p6);
		           if(p6!=null) {
		         	  System.out.println(p6);
		           }
		              else {
		             	 System.out.println("Patient not found by patient gender");
		              }
		           }catch (Exception e) {
		   			// TODO Auto-generated catch block
		   			e.printStackTrace();
		   		}
		           
		           break; 	
		           
	 default : System.out.println("Invalis choice");
	  }
	   System.out.println("Do you want to continue press y/n");
	   text=sc.next();
			  
	  }while(text.equals("y"));
	    System.out.println("Thanks for using our Apllications");
 
      
	  System.out.println("enter the patient address by streetname to be fetched");
	  String streetName=sc.next();
	  System.out.println(hospital.getPatientByStreetName(streetName));
	  
	  System.out.println("enter the patient address by street no to be fetched");
	  int streetNo=sc.nextInt();
	  System.out.println(hospital.getPatientByStreetNo(streetNo));
	  
	  System.out.println("enter the patient address by id to be fetched");
	  int addressId=sc.nextInt();
	  System.out.println(hospital.getPatientByAddressId(addressId));
	  
	  System.out.println("enter the patient address by state id to be fetched");
	  int stateId=sc.nextInt();
	  System.out.println(hospital.getPatientByStateId(stateId));
	  
	  System.out.println("enter the patient address by state name to be fetched");
	  String stateName=sc.next();
	  System.out.println(hospital.getPatientByStateName(stateName));
	  
	  System.out.println("enter the patient address by area name to be fetched");
	  String areaName=sc.next();
	  System.out.println(hospital.getPatientByAreaName(areaName));
	  
	  System.out.println("enter the patient address by area id to be fetched");
	  int areaId=sc.nextInt();
	  System.out.println(hospital.getPatientByAreaId(areaId));
	  
	  
	 }
}
