package com.xworkz.vectorconcepts;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorConcepts {
	
	
	public static void main(String[] args) {
		
		Vector vector=new Vector<>();
		
		vector.add("cr");
		vector.add("sana");
		
		Enumeration enumeration=vector.elements();  //Enumeration class for fectching the data
		
		while(enumeration.hasMoreElements()) {
			String str=(String)enumeration.nextElement();
			System.out.println(str);
			System.out.println(System.nanoTime());
			
		}
		
        Iterator iterator=vector.iterator();  
		
		while(iterator.hasNext()) {
			String str=(String)iterator.next();
			System.out.println(str);
			System.out.println(System.nanoTime());
			
		}
		
		
	}

}
