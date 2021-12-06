package com.xworkz.clonable.dto;

public class HospitalDto  implements Cloneable{

	private String name;
	private String location;
	private String type;
	private String orgType;
	
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
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	@Override
	public String toString() {
		return "HospitalDto={name="+this.name+",location="+this.location+",type="+this.type+",orgType="+this.orgType+"}";
	}
	

	
}
