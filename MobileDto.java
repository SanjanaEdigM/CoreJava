package com.xworkz.collection;



public class MobileDto {
   private int mobilePrice;
   
  public MobileDto(int mobilePrice) {
	  this.mobilePrice=mobilePrice;
  }
   
  
  public void setMobilePrice(int mobilePrice) {
	this.mobilePrice = mobilePrice;
  } 
  
  @Override
  public String toString() {
	  return "MobileDto={mobilePrice="+this.mobilePrice+"}";
  }
   
}
