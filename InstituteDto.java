package com.xworkz.clonable.dto;

public class InstituteDto implements Cloneable {
    
	
	private String name;
	private String location;
	private String course;
	
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	@Override
	public String toString() {
		
		return "InstituteDto={name="+this.name+",location="+this.location+",course="+this.course+"}";
	}
	

	
}
