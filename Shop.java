package com.xworkz.shopapp;

import com.xworkz.shopapp.dto.ElectronicGadgetsDto;

public class Shop {
	
	private ElectronicGadgetsDto[] gadgets;
	int index;
	
	public Shop(int size) {
		gadgets=new ElectronicGadgetsDto[size];
	}
	
	public boolean createGadget(ElectronicGadgetsDto gadgets) {
		boolean gadgetAdded=false;
		 System.out.println("Inside Create Gadget ");
		  if(gadgets!=null) {
			  this.gadgets[index++]=gadgets;
			  gadgetAdded=true;
		  }
		  else {
			  System.out.println("No gadgets found");
			  gadgetAdded=false;
		  }
		
		return gadgetAdded;
		
	}
	
	public ElectronicGadgetsDto getGadgetByName(String gadgetName) {
		ElectronicGadgetsDto gadget=null;
		System.out.println("Inside Get Gadget by its ID");
		if(gadgetName!=null) {
		 for(int i=0;i<gadgets.length;i++){
			if(gadgets[i].getGadgetName().equals(gadgetName)) {
				System.out.println("Gadget found by gadget name :"+gadgetName);
				gadget=gadgets[i];
			}
			else {
				System.out.println("Gadget not found");
			}
		 }
		}
		 return gadget;
	}
	
	public ElectronicGadgetsDto getGadgetById(int gadgetId) {
		ElectronicGadgetsDto gadget=null;
		System.out.println("Inside Get Gadget by its ID");
		if (gadgetId!=0) {
		 for(int i=0;i<gadgets.length;i++){
			if(gadgets[i].getGadgetId()==gadgetId) {
				System.out.println("Gadget found by gadget Id :"+gadgetId);
				gadget=gadgets[i];
			}
			else {
				System.out.println("Gadget not found");
			}
		 }
	  }
		 return gadget;
	}
	
	public boolean updateNameByGadgetPrice(String gadgetName,double gadgetPrice) {
	    boolean update=false;
	     System.out.println("updating the patientNAmeByGadgetPrice");
	    	for(int i=0;i<gadgets.length;i++) {
	    		
	    		if(gadgets[i].getGadgetPrice()==gadgetPrice) {
	    				gadgets[i].setGadgetName(gadgetName);
	    			 update=true;
	    			
	    		}
	    		else {
	    			System.out.println("Gadget price not found");   		
	    	}
	}
	    	return update;
	    }
	    
	    
	 public boolean deleteGadgetById(int id) {
		 boolean delete=false;
		 System.out.println("Deleting the Gadget by its Id");
		  for(int i=0;i<gadgets.length;i++) {
			  if(gadgets[i].getGadgetId()==id) {
				  gadgets[i]=null; 
				  delete=true;
			  }
			  else {
				  System.out.println("Cannot find the gadget be deleted");
			  }
		  }
		  return delete;
		 
	 }
		
	public void getAllGadgetdetails() {
		for(int i=0;i<gadgets.length;i++) {
			System.out.println(gadgets[i]);
		}
	}

}
