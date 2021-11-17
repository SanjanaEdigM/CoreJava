package com.xworkz.shopapp.dto;

public class ElectronicGadgetsDto {
	
	
	private int gadgetId;
	private String gadgetName;
	private double gadgetPrice;
	
	public int getGadgetId() {
		return gadgetId;
	}
	public void setGadgetId(int gadgetId) {
		this.gadgetId = gadgetId;
	}
	
	
	public String getGadgetName() {
		return gadgetName;
	}
	public void setGadgetName(String gadgetName) {
		this.gadgetName = gadgetName;
	}
	
	public double getGadgetPrice() {
		return gadgetPrice;
	}
	public void setGadgetPrice(double gadgetPrice) {
		this.gadgetPrice = gadgetPrice;
	}
    
	public String toString() {
		return "ElectronicGadgetsDto={gadgetid="+this.gadgetId+",gadgetName="+this.gadgetName+",gadgetPrice="+this.gadgetPrice+"}";
		
	}
}
