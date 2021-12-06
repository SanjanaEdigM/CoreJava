package com.xworkz.clonable.dto;

public class StadiumDto implements Cloneable {

	private String name;
	private String location;
	private String openTime;
	private String closeTime;
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
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
  @Override
public Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}
	@Override
	public String toString() {

		return "StadiumDto ={name="+this.name+",location="+this.location+",OpenTime="+this.openTime+",closeTime="+this.closeTime+"}";
	}
}