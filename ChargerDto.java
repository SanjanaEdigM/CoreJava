package com.xworkz.collection;

public class ChargerDto {

   private int chargerPrice;
	
	public ChargerDto(int chargerPrice) {
		this.chargerPrice=chargerPrice;
	}
	
	public void setChargerPrice(int chargerPrice) {
		this.chargerPrice = chargerPrice;
	}
	
	 @Override
	  public String toString() {
		  return "ChargerDto={ChargerPrice="+this.chargerPrice+"}";
	  }
}
