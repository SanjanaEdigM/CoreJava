package com.xworkz.swiggy;
import java.util.Scanner;

public class RestaurantTester {
		
		public static void main(String[] args) {
			
			SwiggyContract swiggyContarct=new SwiggyAccess();
			
			Restaurant restaurant=new Restaurant(swiggyContarct);
			restaurant.acceptOrder();		
			
			
		}
}
