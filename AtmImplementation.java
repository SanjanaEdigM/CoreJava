package com.xworkz.atm;

public class AtmImplementation implements AtmCard  {

	@Override
	public void amtWithDraw() {
		System.out.println("Amount is withdrawed");
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("Balance is enquired");
		
	}

}
