package com.xworkz.dataobjectaccess.doa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GymDAO {
	private Collection<String> GymNameCollection=new ArrayList<String>();
	  
	public boolean save(String pgName) {
		return  GymNameCollection.add(pgName);
	}
	
	public boolean find(String gymName) {
		return GymNameCollection.contains(gymName);
	}
	

	public boolean findByCaseSensitive(String gymName) {
       
		Iterator<String> itr=GymNameCollection.iterator();
		while(itr.hasNext()) {
			String tempGymName=itr.next();
			if(tempGymName.equalsIgnoreCase(gymName)) {
				return true;
			}
			
		}
           return false;
	}
    
	
	public boolean findByCaseSensitiveAndTrimmed(String gymName) {
		
		 Iterator<String> itr=GymNameCollection.iterator();
		 while(itr.hasNext()) {
			 String tempGymName=itr.next();
			 tempGymName=tempGymName.replace(" ","");
			 gymName=gymName.replace(" ","");
			 if(tempGymName.equalsIgnoreCase(gymName)) {
				 return true;
			 }
		 }
		
		return false;
}
}
