package com.xworkz.hotel.dto;
import java.util.Scanner;

import com.xworkz.hotel.Hotel;

public class HotelTester {
	
	public static void main(String a[]) {
		System.out.println("enter the number of food items");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Hotel hotel=new Hotel(size);
		
		for(int i=0;i<size;i++) {
			FoodItemsDto item=new FoodItemsDto();
			
			System.out.println("enter the foodItem id");
			int foodItemId=sc.nextInt();
			item.setFoodItemId(foodItemId);
			
			System.out.println("enter the food item name");
			String foodItemName=sc.next();
			item.setFoodItemName(foodItemName);
			
			System.out.println("enter the food price");
			double foodItemPrice=sc.nextDouble();
			item.setFoodItemPrice(foodItemPrice);
			
			boolean isAdded=hotel.createFoodItems(item);
			System.out.println("foodItems found is "+isAdded);
			
			hotel.getAllFoodDetails();
		
			System.out.println("Enter the food Item id to be fectched");
			System.out.println(hotel.getFoodItemsById(sc.nextInt()));
			
			System.out.println("Enter the foodItem Name to be fectched");
			System.out.println(hotel.getFoodItemByName(sc.next()));
			
			
			System.out.println("Enter the food item price to be updated by id");
			System.out.println(hotel.updateFoodPricebyId(sc.nextDouble(),sc.nextInt()));
			
			hotel.getAllFoodDetails();
			
			
			System.out.println("Enter the food name to be deleted");
			System.out.println(hotel.deleteFoodItembyName(sc.next()));
			
			hotel.getAllFoodDetails();

	
		}
	}

}
