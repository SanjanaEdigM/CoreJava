package com.xworkz.hotel.dto;

public class FoodItemsDto {
	private int foodItemId;
	private String foodItemName;
	private double foodItemPrice;
	
	public int getFoodItemId() {
		return foodItemId;
	}
	public void setFoodItemId(int foodItemId) {
		this.foodItemId = foodItemId;
	}
	
	public String getFoodItemName() {
		return foodItemName;
	}
	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}
	
	public double getFoodItemPrice() {
		return foodItemPrice;
	}
	public void setFoodItemPrice(double foodItemPrice) {
		this.foodItemPrice = foodItemPrice;
	}
	
	@Override
	public String toString() {
		return "FoodItemsDto={foodItemId="+this.foodItemId+",foodItemsName="+this.foodItemName+",foodItemPrice="+this.foodItemPrice+"}";
	}	

}
