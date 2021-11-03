package com.xworkz.tubelight;
import java.util.Scanner;

public class LightTester {

	public static void main(String a[]) {
		
		System.out.println("Enter your input");
		Scanner type=new Scanner(System.in);
		
		ISwitch iSwitch=LightFactory.getLight(type.next());
		
		if(iSwitch!=null) {
			iSwitch.sOn();
			iSwitch.sOff();
		}	
		
	}	
}
