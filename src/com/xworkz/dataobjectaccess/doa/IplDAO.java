package com.xworkz.dataobjectaccess.doa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IplDAO {
	private Collection<String> IplTeamNameCollection=new ArrayList<String>();
	  
	public boolean save(String iplTeamName) {	
		return  IplTeamNameCollection.add(iplTeamName);
	}
	
	public boolean find(String iplTeamName) {
		return IplTeamNameCollection.contains(iplTeamName);
	}
	

	public boolean findByCaseSensitive(String iplTeamName) {
       
		Iterator<String> itr=IplTeamNameCollection.iterator();
		while(itr.hasNext()) {
			String tempIplTeamName=itr.next();
			if(tempIplTeamName.equalsIgnoreCase(iplTeamName)) {
				return true;
			}
			
		}
           return false;
	}
    
	
	public boolean findByCaseSensitiveAndTrimmed(String iplTeamName) {
		
		 Iterator<String> itr=IplTeamNameCollection.iterator();
		 while(itr.hasNext()) {
			 String tempIplTeamName=itr.next();
			 tempIplTeamName=tempIplTeamName.replace(" ","");
			 iplTeamName=iplTeamName.replace(" ","");
			 if(tempIplTeamName.equalsIgnoreCase(iplTeamName)) {
				 return true;
			 }
		 }
		
		return false;
	}
	
}
