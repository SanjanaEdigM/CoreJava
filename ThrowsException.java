package com.xworkz.throwsexception;

public class ThrowsException {
	
	
	public static void main(String a[]) {
		
		System.out.println("main method started");
		 ThrowsException t=new  ThrowsException();
		 try {
			 t.method1();
			 System.out.println("inside ClassNotFoundException ");
			 Class.forName("com.xworkz.throwsexception");
		     
		 }catch(ClassNotFoundException sr) {
		  
		   System.out.println("classNotFound exception handled");
		 }

	}
	
	 void method1() throws ClassNotFoundException{  //called Exception Propagation or stackFlow
		 System.out.println("Indide method1()");
		 method2();
		 System.out.println("ended method1()");
	 }
	 
	 void method2() throws ClassNotFoundException{
		 System.out.println("Indide method2()");
		 method3();
		 System.out.println("ended method2()");
	 }
	 
	 void method3() throws ClassNotFoundException {
		System.out.println("inside method3()");
		System.out.println("main method ended()");
	 }
		
	
	

}
