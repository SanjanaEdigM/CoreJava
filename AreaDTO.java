package com.xworkz.hospitalapp.dto;

public class AreaDTO {
  private int areaId;
  private String areaName;
  private StreetDTO street;
  
  public int getAreaId() {
	  return areaId;
  }
  public void setAreaId(int areaId) {
	  this.areaId=areaId;
  }
  
  public String getAreaName() {
	  return areaName;
  }
  public void setAreaName(String areaName) {
	  this.areaName=areaName;
  }
  
  public StreetDTO getStreet() {
	return street;
  }
  public void setStreet(StreetDTO street) {
	this.street = street;
  }		
	
	
  @Override
  public String toString() {
	   return "AreaDTO={areaId="+this.areaId+",areaName="+this.areaName+",street="+this.street+"}";
  }
	
	
}
