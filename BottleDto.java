package com.xworkz.collection;



public class BottleDto {
	
	
	private int bottlePrice;
	
	public BottleDto(int bottlePrice) {
		this.bottlePrice=bottlePrice;
		
	}
	
	public void setBottlePrice(int bottlePrice) {
		this.bottlePrice = bottlePrice;
	}
	
	public int getBottlePrice() {
		return bottlePrice;
	}
	
	@Override
	public String toString() {
		return "BottleDto={bootlePrice="+this.bottlePrice+"}";
	}
	
}
