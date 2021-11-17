package com.xworkz.pub;


import java.util.Scanner;

import com.xworkz.pub.Exception.PubException;
import com.xworkz.pub.bouncer.Bouncer;

public class PubTester {

		
		
	    public static void main(String ar[]) {
	    Scanner sc=new Scanner(System.in);
	    	System.out.println("enter the age");
	    	int age=sc.nextInt();
	    	
		Bouncer bounce=new Bouncer();
		
		
		try {
			Class.forName("com.xworkz.pub.bouncer.Bouncer");
			bounce.check(17);
		} catch (PubException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		catch(ClassNotFoundException sr) {
			sr.printStackTrace();
		}finally {
			if(sc!=null){
				sc.close();
			}
		
	   }
	}
}

