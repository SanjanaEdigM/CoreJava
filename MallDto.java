package com.xworkz.clonable.dto;


	public class MallDto implements Cloneable {
	    
		private String mallName;
		private String location;
		private long number;
		private int numOfGates;
		private int numOfShop;
		
		public String getMallName() {
			return mallName;
		}
		public void setMallName(String mallName) {
			this.mallName = mallName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public long getNumber() {
			return number;
		}
		public void setNumber(long number) {
			this.number = number;
		}
		public int getNumOfGates() {
			return numOfGates;
		}
		public void setNumOfGates(int numOfGates) {
			this.numOfGates = numOfGates;
		}
		public int getNumOfShop() {
			return numOfShop;
		}
		public void setNumOfShop(int numOfShop) {
			this.numOfShop = numOfShop;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}

		@Override
		public String toString() {
			
			return "MallDto={mallName="+this.mallName+",location="+this.location+",Number="+this.number+",noOfGates="+this.numOfGates+",noOfshop="+this.numOfShop+"}";
		}
		
	}


