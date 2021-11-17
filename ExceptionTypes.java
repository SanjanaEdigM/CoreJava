package com.xworkz.exceptiontypes;

public class ExceptionTypes {
	
	public static void main(String a[]) {
		System.out.println("inside main method");
		
		
		try {
			Class.forName("com.xworkz.exceptiontypes");
			String str=null;
			String str1="null";
			System.out.println(str.equals(str1));
		}catch(ClassNotFoundException sr) {
			sr.printStackTrace();
			System.out.println("inside ClassNotFoundException ");
		}catch(NullPointerException sr) {
			sr.printStackTrace();               
			System.out.println("inside NullPointerException");    //exception handling with one try and multiple catch type
		}finally {
			System.out.println("No costlier resource to be closed"); //try catch with finally
		}
		
		
		try {
			int n=10/0;
			Class.forName("com.xworkz.exceptiontypes");
			
		}catch(ArithmeticException  | ClassNotFoundException sr ) { //multiple exception in one class
			sr.printStackTrace();
		}
		
		
	}

}
