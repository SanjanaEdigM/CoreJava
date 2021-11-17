package com.xworkz.hospitalapp.dto;

public class CountryDTO {
   private int countryId;
   private String countryName;
   private StateDTO state;
   
   public int getCountryId() {
	return countryId;
   }
   public void setCountryId(int countryId) {
	 this.countryId=countryId;
   }
   
   public String getCountryName() {
	   return countryName;
   }
   public void setCountryName(String countryName) {
	   this.countryName=countryName;
   }
   
   public StateDTO getState() {
	   return state;
   }
   public void setState(StateDTO state) {
	   this.state=state;
   }
   @Override
   public String toString() {
	   return "CountryDTO={countryId="+this.countryId+",countryName="+this.countryName+",state="+this.state+"}";
   }	
}
