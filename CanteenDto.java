package com.xworkz.clonable.dto;

public class CanteenDto implements Cloneable{
	
   private String name;
   private String location;
   private String foodtype;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getFoodtype() {
			return foodtype;
		}
		public void setFoodtype(String foodtype) {
			this.foodtype = foodtype;
		}
   
     
		@Override
			public Object clone() throws CloneNotSupportedException {
				// TODO Auto-generated method stub
				return super.clone();
			}
   
       @Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return "CanteenDto={name="+this.name+",location="+this.location+",foodtype="+this.foodtype+"}";
    	}
   
   
}
