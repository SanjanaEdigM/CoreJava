package com.xworkz.dataobjectaccess.doa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PgDAO {
    
  private Collection<String> pgNameCollection=new ArrayList<String>();
  
	public boolean save(String pgName) {
		
		return  pgNameCollection.add(pgName);
		
	}
	
	public boolean find(String name) {
		return pgNameCollection.contains(name);
	}
	

	public boolean findByCaseSensitive(String pgName) {
       
		Iterator<String> itr=pgNameCollection.iterator();
		while(itr.hasNext()) {
			String tempPgName=itr.next();
			if(tempPgName.equalsIgnoreCase(pgName)) {
				return true;
			}
			
		}
           return false;
	}
    
	
	public boolean findByCaseSensitiveAndTrimmed(String pgName) {
		
		 Iterator<String> itr=pgNameCollection.iterator();
		 while(itr.hasNext()) {
			 String tempPgName=itr.next();
			 tempPgName=tempPgName.replace(" ","");
			 pgName=pgName.replace(" ","");
			 if(tempPgName.equalsIgnoreCase(pgName)) {
				 return true;
			 }
		 }
		
		return false;
		
		
	}
}
