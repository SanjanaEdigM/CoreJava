package com.xworkz.listconcepts;

import java.util.ArrayList;
import java.util.List;

public class ListConcepts {
	
	public static void main(String a[]) {
   
	List list1 = new ArrayList<>();
    list1.add("Yuvaratna");
    list1.add("Prutvi");
    list1.add("Drishya2");
    list1.add( "100");
    list1.add("Shivaji suratkal");
    list1.add("6-5=2");
    list1.add("rama shama bhama");
    list1.add("mast maja maadi");
    list1.add("muru guttu ondu sullu ondu nija");
    list1.add("om");
    list1.add("3 idiots");
    list1.add("police story");
    
    list1.add(0,"Appu");   //adding the data at partiular index using add(index,onject);
    list1.add(5,"law");
    
	list1.forEach(System.out::println);
	
	System.out.println("printing the object at 6 position");
	System.out.println(list1.get(6));  // to get the particular data from the index get(index);
	System.out.println(list1.size());

	System.out.println("getting the data from 4-10");
	System.out.println(list1.subList(4, 10)); //to get data from index 5-10 so on we use subList(index,index);
	
	System.out.println("toget the index from the particular objec");
	System.out.println(list1.indexOf("Prutvi")); //toget the index from the particular object we use indexOf(object);
	
	System.out.println("removing the particular element using index");
	System.out.println(list1.remove(6));
	System.out.println(list1.size());
	
	System.out.println("to get the last index of the list");
	System.out.println(list1.lastIndexOf("police story"));

	
	}
	
	
}
