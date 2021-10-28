package com.xworkz.google.dto;

import java.util.Scanner;

import com.xworkz.google.Google;

public class GoogleTester {
	public static void main(String a[]) {
		
		System.out.println("enter the number of apps");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Google google=new Google(size);
		
		for(int i=0;i<size;i++) {
			GoogleApplicationDto app=new GoogleApplicationDto();
			
			System.out.println("enter the app id");
			int appId=sc.nextInt();
			app.setAppId(appId);
			
			System.out.println("enter the app name");
			String appName=sc.next();
			app.setAppName(appName);
			

			
			boolean isAdded=google.createGoogleApplication(app);
			System.out.println("company found is "+isAdded);
			
			google.getAllAppDetails();
		
			System.out.println("Enter the app id to be fectched");
			System.out.println(google.getGoogleApplicationById(sc.nextInt()));
			
			
			System.out.println("Enter theapp name to be updated by id");
			System.out.println(google.updateGoogleApplicationNameById(sc.next(),sc.nextInt()));
			
			
			google.getAllAppDetails();
			
			
			System.out.println("Enter the company name to be deleted");
			System.out.println(google.deleteAppByName(sc.next()));
			
			google.getAllAppDetails();

		}
	
	
	}	
	
}
