package com.xworkz.hotel;


import com.xworkz.hotel.dto.FoodItemsDto;

public class Hotel {
   
		private FoodItemsDto[] items;
		int index;
		
		public Hotel(int size) {
			items=new FoodItemsDto[size];
		}
		
		public boolean createFoodItems(FoodItemsDto items) {
			boolean iscreated=false;
			System.out.println("Inside create foodItems method");
			 if(items!=null) {
				 this.items[index++]=items;
				 iscreated=true;
			 }
			 else {
				 System.out.println("items not found");
			 }
			 return iscreated;
		}
		
		
		
		public FoodItemsDto getFoodItemsById(int foodItemId) {
			FoodItemsDto item=null;
			 System.out.println("inside getFoodItemsById() ");
			   if(foodItemId!=0) {
				   for(int i=0;i<items.length;i++) {
					   if(items[i].getFoodItemId()==foodItemId) {
						   System.out.println("account found by id"+foodItemId);
						   item=items[i];
					   }
					   else {
						   System.out.println("food not found by id");
					   }
				   }
			   }
			return item;
		}
		
		public FoodItemsDto getFoodItemByName(String foodItemName) {
			FoodItemsDto item=null;
			 System.out.println("inside getAccountByName() ");
			   if(foodItemName!=null) {
				   for(int i=0;i<items.length;i++) {
					   if(items[i].getFoodItemName().equals(foodItemName)) {
						   System.out.println("food found by name"+foodItemName);
						   item=items[i];
					   }
					   else {
						   System.out.println("food not found by name");
					   }
				   }
			   }
			return item;
		}
		
		
		public boolean updateFoodPricebyId(double foodItemPrice,int foodItemId) {
			boolean update=false;
			System.out.println("Updating FoodPricebyId");
			 for(int i=0;i<items.length;i++) {
				 if(items[i].getFoodItemId()==foodItemId) {
					 items[i].setFoodItemPrice(foodItemPrice);
					 update=true;
				 }
				 else {
					 System.out.println("food id not found");
				 }
				 
			 }
			 return update;
			 
		}
		
		public boolean deleteFoodItembyName(String foodItemName) {
			boolean delete=false;
			System.out.println("Deleting the food by name");
			  for(int i=0;i<items.length;i++) {
				  if(items[i].getFoodItemName().equals(foodItemName)) {
					  items[i]=null;
					  delete=true;
				  }
				  else {
					  System.out.print("food name not found");
				  }
			  }
			  return delete;
		}
		
		public void getAllFoodDetails() {
			for(int i=0;i<items.length;i++) {
				System.out.println(items[i]);
			}
		}
		
		
			 
}



