package com.xworkz.exception;

public class TesterException {
	public static void main(String a[]){
		
		   // ArrayOutOfBoundException
		//RunTimeException
			try {   
			char arr[]=new char[2];
			System.out.println("**********************************");
			  
			   arr[0]='s';
			   arr[1]='r';
			   arr[2]='*';
			   
			   for(int i=0;i<arr.length;i++) {
					 System.out.println(arr[i]);
				 }
			   
			}
			
			catch(ArrayIndexOutOfBoundsException sr) {
				sr.printStackTrace();
		    	   System.out.println("cannot add third element to array");
		    	   
		       }
		   
		   
		  StringBuilder str=new StringBuilder("Sana");
		   str.append("san");
		   System.out.println(str);

		    String s1=null;
			String s2="null";
			
			// NullPointerException
			System.out.println("comparing null object");
			try{
			System.out.println(s1.equals(s2));  //program will be abrupted because of null pointer execption
			
			}

		    catch(NullPointerException sr){             //using try and catch blocks handling the exception
		    	sr.printStackTrace();
				System.out.println("cannot access null object");
				
			}

		    System.out.println("main method ended");	
		  
		    
		    //ArithmeticException
		     try {
		    	 int i=5;
		    	 int j=0;
		    	 int r=i/j;
		     }
		     catch(ArithmeticException sr) {
		    	 sr.printStackTrace();																																													
		    	 System.out.println("cannot divide by 0");
		    	 
		     }
		     
		    //ClassNotFoundException 
		     //CompileTimeException
		     
		    	try {
		    		System.out.println("Inside classnotfound exception");
		    		Class.forName("com.xworkz.exception");     //Static method() purpose to load the class
		    		
		    }
		    	catch(ClassNotFoundException sr) {
		    		sr.printStackTrace();
		    		System.out.println("class not found");
		    	}
	       
	}
	
}
