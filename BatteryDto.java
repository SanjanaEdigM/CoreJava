package com.xworkz.collection;

public class BatteryDto {
  private String batteryType;
  
  public BatteryDto(String batteryDto) {
	  this.batteryType=batteryType;
  }
  
  public void setBatteryType(String batteryType) {
	this.batteryType = batteryType;
  }
  
  @Override
  public String toString() {
	  return "BatteryDto={batteryType="+this.batteryType+"}";
  }
}
