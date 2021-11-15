package com.xworkz.methodstring;

public class MethodsString {

	public static void main(String a[]) {
		
		 String name=new String("Sanjana");
		 
		 System.out.println(name.charAt(0));
		 System.out.println(name.concat("Edig"));
		 System.out.println(name.endsWith("M"));
		 System.out.println(name.compareTo("Chaya"));
		 System.out.println(name.length());
		 System.out.println(name.toCharArray());
		 System.out.println(name.toLowerCase());
		 System.out.println(name.toUpperCase());
		 System.out.println(name.repeat(5));
		 System.out.println(name.compareToIgnoreCase("sanjana"));
		 System.out.println(name.contains("s"));
		 System.out.println(name.codePointAt(1));
		 System.out.println(name.contentEquals("Sanjana"));
		 
		
	}
	
}
