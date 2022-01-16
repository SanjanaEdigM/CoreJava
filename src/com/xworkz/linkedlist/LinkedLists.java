package com.xworkz.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class LinkedLists {
  
	public static void main(String a[]) {
		
		List list=new LinkedList<>();
		
		list.add("Sanjana");
		list.add("Samridi");
		list.add("Manjunath");
		list.add("Bhagyalakshmi");
		list.add(4);
		
		
		//to iterate the string type of data
		
		//Iterator itr=list.iterator();
		//while(itr.hasNext()) { 
	     //String data=(String)itr.next();
			// System.out.println(data);
		//}
		 
		//to iterate the general type of data
		
		 //Iterator itr1 =list.iterator();
		// while(itr1.hasNext()) {
			// Object obj=(Object)itr1.next();
			// System.out.println(obj);
		// }
		 
		 //using listIterator to fetch the data (it can fetch the data in backward direction also
		
		
		 System.out.println("going forward direction");
		 ListIterator listItr1=list.listIterator();
		 while(listItr1.hasNext()) {
			 Object obj2=(Object)listItr1.next();
			 System.out.println(obj2);
		 }
		 
		 
		 System.out.println("going backward direction");
		 while(listItr1.hasPrevious()) {
			 Object obj3=(Object)listItr1.previous();
			 System.out.println(obj3);
			
		 }
		 
		 
		 
  	}
	
}
