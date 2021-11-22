package com.xworkz.collection;

public class LaptopDto {
   private String laptopModelNo;
   
   public LaptopDto(String laptopModelNo) {
	   this.laptopModelNo=laptopModelNo;
   }
   
   public void setLaptopModelNo(String laptopModelNo) {
	this.laptopModelNo = laptopModelNo;
   }
   
   @Override
   public String toString() {
	   return "LaptopDto={laptopModelNo="+this.laptopModelNo+"}";
   }
   
   
   
}
