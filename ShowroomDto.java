package com.xworkz.clonable.dto;

public class ShowroomDto implements Cloneable {
   
	
	private int id;
	private String name;
	private String location;
	private String type;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	@Override
	public String toString() {
		
		return "ShowroomDto={id="+this.id+",name="+this.name+",location="+this.location+",type="+this.type+"}";
	}
	
	
	
}
