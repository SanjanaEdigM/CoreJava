package com.xworkz.mapconcepts;

import java.util.HashMap;
import java.util.Map;

public class MapConcepts {
	
	public static void main(String[] args) {

	Map<String,MapConcepts> map=new HashMap<String, MapConcepts>();
	
	MapConcepts m=new MapConcepts();
	
	map.put("Mysore", m);
	map.put("Shimoga",m);
	map.put("Bengaluru", m);
	
	MapConcepts m2=new MapConcepts();
	
	map.put("Sanjana", m2);
	map.put("Samridi", m2);
	
	map.putAll(map);
	
	System.out.println(map.containsKey("Mysore"));
	System.out.println(map.containsKey("mysore"));
	System.out.println(map.containsValue(m));  // check for map contains object or not
	System.out.println(map.isEmpty());
	System.out.println(map.size());
	
	
	System.out.println(map);
	
	
	System.out.println(map.equals(m2));   // check two maps equal or not
	
	System.out.println(map.keySet());  // print all the values in map
	System.out.println(map.entrySet());
	System.out.println(map.remove(m2));
	System.out.println(map.remove("Bengaluru", m));

	System.out.println(map.equals(m2));

    System.out.println(map.size());   //gives the size of all the map object values
    
    
	}
	
}
