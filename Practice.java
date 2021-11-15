package com.xworkz.pratice;


 class Practice {
    public static  void main(String[] a) {
    	
    	
    	//String literals
    	String str="practicing string"; //creating object of string without using new keyword
    	
    	String s=new String();
    	String s1=new String("pratice");  
    	System.out.println(s);
    	
    	StringBuffer s2=new StringBuffer("Hi");      
    	s2.append("Namsakara");
    	System.out.println(s2);
    	
    	StringBuilder s3=new StringBuilder("String");
    	s3.append("Builder");
    	System.out.println(s3);	
    	
    }
}