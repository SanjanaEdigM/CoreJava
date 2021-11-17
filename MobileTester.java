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
			

			
			boolean isAdded;
			try {
				isAdded = mobile.createApplication(app);
			System.out.println("Application found is "+isAdded);
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			mobile.getAllAppDetails();
		
			System.out.println("Enter the foodapp id to be fectched");
			try {
			System.out.println(mobile.getApplicationById(sc.nextInt()));
			}catch(Exception r) {
				r.printStackTrace();
			}
			
			System.out.println("Enter the app Name to be fectched");
			try {
			System.out.println(mobile.getApplicationByName(sc.next()));
			}catch(Exception r) {
				r.printStackTrace();
			}
			
			System.out.println("Enter the app name to be updated by id");
			try {
			System.out.println(mobile.updateApplicationNameById(sc.next(),sc.nextInt()));
			}catch(Exception r) {
				r.printStackTrace();
			}
			
			
			mobile.getAllAppDetails();
			
			
			System.out.println("Enter the app name to be deleted");
			try {
			System.out.println(mobile.deleteApplicationByName(sc.next()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			mobile.getAllAppDetails();

	
		}
	}


	}
}
