package com.xworkz.socket;

import java.util.Scanner;

public class SocketTester {
	public static void main(String a[]) {
	
	    System.out.println("Enter your connection input");
		Scanner connect=new Scanner(System.in);
		
		System.out.println("Enter your switch on or off input");
		Scanner swich=new Scanner(System.in);
		
		
		Socket c=SocketFactory.getCharging(connect.next(),swich.next());
		
		if(c!=null) {
			c.chargerConnected();
			c.chargerNotConnected();
		}	
		
	}
}
