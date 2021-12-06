package com.xworkz.clonable.dto;

public class LaptopDto implements Cloneable{

	private int id;
	private String laptopName;
	private float price;
	private String processor;
	private String ram;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
			return super.clone();
	}
	
	@Override
	public String toString() {
		return "LaptopDto={id="+this.id+",laptopName="+this.laptopName+",price="+this.laptopName+",processor="+this.processor+",ram="+this.ram+"}";
		}

	
}
