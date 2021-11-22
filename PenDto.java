package com.xworkz.collection;

public class PenDto {
  private int penPrice;
  
  public PenDto(int penPrice) {
	  this.penPrice=penPrice;
  }
  
  
  public void setPenPrice(int penPrice) {
	this.penPrice = penPrice;
  }
  
  @Override
  public String toString() {
	  return "PenDto={penPrice="+this.penPrice+"}";
  }
  
}
