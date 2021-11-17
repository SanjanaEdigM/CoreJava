package com.xworkz.atmapp.Exception;

public class AtmException extends Exception{
	@Override
	public String getMessage() {
		return "invalid amount";
	}

}
