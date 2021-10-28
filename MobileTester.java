package com.xworkz.mobile.dto;

import java.util.Scanner;

import com.xworkz.mobile.Mobile;

public class MobileTester {

	
	public static void main(String a[]) {
		System.out.println("enter the number of apps");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Mobile mobile=new Mobile(size);
		
		for(int i=0;i<size;i++) {
			ApplicationDto app=new ApplicationDto();
			
			System.out.println("enter the app id");
			int appId=sc.nextInt();
			app.setAppId(appId);
			
			System.out.println("enter the app name");
			String appName=sc.next();
			app.setAppName(appName);
			

			
			boolean isAdded=mobile.createApplication(app);
			System.out.println("Application found is "+isAdded);
			
			mobile.getAllAppDetails();
		
			System.out.println("Enter the foodapp id to be fectched");
			System.out.println(mobile.getApplicationById(sc.nextInt()));
			
			System.out.println("Enter the app Name to be fectched");
			System.out.println(mobile.getApplicationByName(sc.next()));
			
			
			System.out.println("Enter the app name to be updated by id");
			System.out.println(mobile.updateApplicationNameById(sc.next(),sc.nextInt()));
			
			
			mobile.getAllAppDetails();
			
			
			System.out.println("Enter the app name to be deleted");
			System.out.println(mobile.deleteApplicationByName(sc.next()));
			
			mobile.getAllAppDetails();

	
		}
	}


}
