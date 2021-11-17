package com.xworkz.gym;

import com.xworkz.gym.dto.EquipmentDto;

public class Gym {

	private EquipmentDto[] equipments;
	int index;
	
	public Gym (int size) {
		equipments=new EquipmentDto[size];
	}
	
	public boolean createEquipment(EquipmentDto equipments) throws Exception {
		boolean iscreated=false;
		System.out.println("Inside create equipment method");
		 if(equipments!=null) {
			 try {
			 this.equipments[index++]=equipments;
			 iscreated=true;
		 }
			 catch(ArrayIndexOutOfBoundsException sr) {
				 sr.printStackTrace();
		    	   System.out.println("cannot add element to array");
			 }
		 }
		 else {
			 System.out.println("equipment not found");
		 }
	
		 return iscreated;
	}
	
	public EquipmentDto getEquipmentById(int equipmentId) throws Exception{
		EquipmentDto equipment=null;
		 System.out.println("inside getEquipmentById");
		   if(equipmentId!=0) {
			   for(int i=0;i<equipments.length;i++) {
				   if(equipments[i].getEquipmentId()==equipmentId) {
					   System.out.println("equipment found by id"+equipmentId);
					   equipment=equipments[i];
				   }
				   else {
					   System.out.println("equipments not found by id");
				   }
			   }
		   }
		return equipment;
	}
	
	
	
	
	public boolean updateEquipmentNameById(String equipmentName,int equipmentId) throws Exception {
		boolean update=false;
		System.out.println("Updating equipmentById(");
		 for(int i=0;i<equipments.length;i++) {
			 if(equipments[i].getEquipmentId()==equipmentId) {
				 equipments[i].setEquipmentName(equipmentName);
				 update=true;
			 }
			 else {
				 System.out.println("equipments id not found");
			 }
			 
		 }
		 return update;
		 
	}
	
	public boolean deleteEquipmentsByName(String equipmentName) throws Exception {
		boolean delete=false;
		System.out.println("Deleting the equipment by name");
		  for(int i=0;i<equipments.length;i++) {
			  if(equipments[i].getEquipmentName().equals(equipmentName)) {
				  equipments[i]=null;
				  delete=true;
			  }
			  else {
				  System.out.print("equipment name not found");
			  }
		  }
		  return delete;
	}
	
	public void getAllEquipmentDetails() {
		for(int i=0;i<equipments.length;i++) {
			System.out.println(equipments[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
