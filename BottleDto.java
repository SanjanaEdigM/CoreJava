package com.xworkz.clonable.dto;

public class BottleDto implements Cloneable {
   
	private int id;
	private String name;
	private int price;
	private String type;
	private String liters;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLiters() {
		return liters;
	}
	public void setLiters(String liters) {
		this.liters = liters;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	@Override
	public String toString() {
		return "BottleDto={id="+this.id+",name="+this.name+",price="+this.price+",type="+this.type+",liters="+this.liters+"}";
	}
	
	
	
	
}
