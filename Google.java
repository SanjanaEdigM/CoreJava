package com.xworkz.google;

import com.xworkz.google.dto.GoogleApplicationDto;

public class Google {

	
	private GoogleApplicationDto[] apps;
	int index;
	
	public Google(int size) {
		apps=new GoogleApplicationDto[size];
	}
	
	public boolean createGoogleApplication(GoogleApplicationDto apps) throws ArrayIndexOutOfBoundsException{
		
		boolean iscreated=false;
		System.out.println("Inside create GoogleApplication method");
		 if(apps!=null) {
			 
				 
			 this.apps[index++]=apps;
			 iscreated=true;
		 }
		 else {
			 System.out.println("GoogleApplication not found");
		 }
		 return iscreated;
	}
	
	public GoogleApplicationDto getGoogleApplicationById(int appId) throws ArrayIndexOutOfBoundsException {
		
		GoogleApplicationDto app=null;
		 System.out.println("inside getGoogleApplicationById ");
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
	
	
	
	
	public boolean updateGoogleApplicationNameById(String appName,int appId) throws ArrayIndexOutOfBoundsException{
		
		boolean update=false;
		System.out.println("Updating GoogleApplicationNameById");
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
	
	public boolean deleteAppByName(String appName) throws ArrayIndexOutOfBoundsException{
		
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
