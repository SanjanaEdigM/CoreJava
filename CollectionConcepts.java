package com.xworkz.collectionConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionConcepts {
   
	public static void main(String a[]) {
		
		Collection c1=new ArrayList<>();
		
		c1.add(1);
		c1.add(23.45);
		c1.add('c');
		c1.add("ss");
		c1.add(true);
		
		List c2=new LinkedList<>();
		
		c2.add(1);
		c2.add("ss");
		c2.add(true);       // add method()
		
		c2.addAll(c1);      // addAll method()
		
		System.out.println("printing elements contains in collection c1 true or false:"+c1.contains(true));
		System.out.println("printing all elements contains in collection c2 have c1 true or false:"+c2.containsAll(c1));
		System.out.println(c2.equals(c1));   //equals whether two collection are equal
		System.out.println(c2.size());
		
		
		System.out.println(c1.retainAll(c2));
		
		System.out.println(c1.size());
		
		System.out.println(c2);
		System.out.println(c1);
		
        
		
		int arr[]= {1,45,6,7};
		List list=Arrays.asList(arr);    // Converting array to linkedlist
		System.out.println("Converting array to collection using asList()");
        Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		    System.out.println(arr[i]);
		}
		
		
		Object[] obj= c1.toArray();
		System.out.println("Coverting collection to array using toArray()");
		for(int i=0;i<obj.length;i++) {          //coverting collection to array
			System.out.println(obj[i]);
		}
		
		
		
		
		c1.remove(23.45);   // removing particular object from collection c1
		c1.removeAll(c1);   // removing all elements of collection c1
		
        c2.clear();         // erase all data from the collection c2
		System.out.println(c2.size());
	}	
}
