package com.xworkz.atmapp;

import java.util.Scanner;

import com.xworkz.atmapp.Exception.AtmException;
import com.xworkz.atmapp.withdraw.Withdraw;

public class AtmTester {
	
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pin");
		int pin=sc.nextInt();
		
		System.out.println("enter the amount");
		int amt=sc.nextInt();
		
		Withdraw wd=new Withdraw();
		
		try {
			wd.check(amt,pin);	
		}catch(AtmException sr) {
			sr.printStackTrace();
			sr.getMessage();			
			
		}finally {
			sc.close();
			System.out.println(" costlier resource is  closed");
		}
		
		
	}

}
