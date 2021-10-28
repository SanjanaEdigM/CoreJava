package com.xworkz.mobile;

import com.xworkz.mobile.dto.ApplicationDto;

public class Mobile {

	private ApplicationDto[] apps;
	int index;
	
	public Mobile(int size) {
		apps=new ApplicationDto[size];
	}
	
	public boolean createApplication(ApplicationDto apps) {
		boolean iscreated=false;
		System.out.println("Inside create Application method");
		 if(apps!=null) {
			 this.apps[index++]=apps;
			 iscreated=true;
		 }
		 else {
			 System.out.println("Application not found");
		 }
		 return iscreated;
	}
	
	public ApplicationDto getApplicationById(int appId) {
		ApplicationDto app=null;
		 System.out.println("inside getApplicationById ");
		   if(appId!=0) {
			   for(int i=0;i<apps.length;i++) {
				   if(apps[i].getAppId()==appId) {
					   System.out.println("app found by id"+appId);
					   app=apps[i];
				   }
				   else {
					   System.out.println("app not found by id");
				   }
			   }
		   }
		return app;
	}
	
	public ApplicationDto getApplicationByName(String appName) {
		ApplicationDto app=null;
		 System.out.println("inside ApplicationByName ");
		   if(appName!=null) {
			   for(int i=0;i<apps.length;i++) {
				   if(apps[i].getAppName().equals(appName)) {
					   System.out.println("food found by name"+appName);
					   app=apps[i];
				   }
				   else {
					   System.out.println("food not found by name");
				   }
			   }
		   }
		return app;
	}
	
	
	public boolean updateApplicationNameById(String appName,int appId) {
		boolean update=false;
		System.out.println("Updating ApplicationNameById");
		 for(int i=0;i<apps.length;i++) {
			 if(apps[i].getAppId()==appId) {
				 apps[i].setAppName(appName);
				 update=true;
			 }
			 else {
				 System.out.println("app id not found");
			 }
			 
		 }
		 return update;
		 
	}
	
	public boolean deleteApplicationByName(String appName) {
		boolean delete=false;
		System.out.println("Deleting the app by name");
		  for(int i=0;i<apps.length;i++) {
			  if(apps[i].getAppName().equals(appName)) {
				  apps[i]=null;
				  delete=true;
			  }
			  else {
				  System.out.print("app name not found");
			  }
		  }
		  return delete;
	}
	
	public void getAllAppDetails() {
		for(int i=0;i<apps.length;i++) {
			System.out.println(apps[i]);
		}
	}
	
	
}
