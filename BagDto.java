package com.xworkz.collection;

public class BagDto {
    
	private String bagName;
	private int bagPrice;
	
	public BagDto(String bagName,int bagPrice) {
		this.bagName=bagName;
		this.bagPrice=bagPrice;
	}
	
	public void setBagName(String bagName) {
		this.bagName = bagName;
	}
	
	public void setBagPrice(int bagPrice) {
		this.bagPrice = bagPrice;
	}
	
	@Override
	public String toString() {
		return "BagDto={bagName="+this.bagName+",bagPrice="+this.bagPrice+"}";
	}
	
	
	
}
