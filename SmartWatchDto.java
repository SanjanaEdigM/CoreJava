package com.xworkz.collection;

public class SmartWatchDto {
  private int smartWatchPrice;
  
  public SmartWatchDto(int smartWatchPrice) {
	   this.smartWatchPrice=smartWatchPrice;
  }
  
  public void setSmartWatchDto(int smartWatchPrice) {
	this.smartWatchPrice= smartWatchPrice;
  }
  
  @Override
  public String toString() {
	   return "SmartWatchDto={smartWatchPrice="+this.smartWatchPrice+"}";
  }
  
}
