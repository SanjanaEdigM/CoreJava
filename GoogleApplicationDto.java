package com.xworkz.google.dto;

public class GoogleApplicationDto {
   
	private int appId;
	private String appName;
	
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	@Override
	public String toString() {
		return "GoogleApplicationDto={appId="+this.appId+",appName="+this.appName+"}";
	}	
	
}
