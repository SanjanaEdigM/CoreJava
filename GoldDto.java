package com.xworkz.collection;

public class GoldDto {

	private double goldPrice;
	
	public GoldDto(double goldPrice) {
		this.goldPrice=goldPrice;
	}
	
	public void setGoldPrice(double goldPrice) {
		this.goldPrice = goldPrice;
	}
	
	 @Override
	  public String toString() {
		  return "GoldDto={GoldPrice="+this.goldPrice+"}";
	  }
}
