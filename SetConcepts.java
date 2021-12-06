package com.xworkz.setconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.setconcepts.DTO.PetDto;
import com.xworkz.setconcepts.comparator.PetNameComparator;


public class SetConcepts {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		//set.add("set");

		list.add(new PetDto(6, "puppy", 3));
		list.add(new PetDto(3, "bunty", 2));
		list.add(new PetDto(2, "scuby", 4));
		list.add(new PetDto(1, "chintu", 3));
		
		Collections.sort(list);
	 	new PetNameComparator();
		Collections.sort(list, new PetNameComparator());
		
		//set.forEach(System.out::println);	
		
		Iterator iterator=list.iterator();
		
			while(iterator.hasNext()) {
				Object obj=(Object)iterator.next();
				System.out.println(obj);
			
		}
	}
}
