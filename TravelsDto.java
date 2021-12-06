package com.xworkz.clonable.dto;

public class TravelsDto implements Cloneable{
   
	private String name;
	private int price;
	private String destination;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	@Override
	public String toString() {
		
		return "TravelsDto={name="+this.name+",price="+this.price+",destination="+this.destination+"}";
	}
	
	
	
	
}
