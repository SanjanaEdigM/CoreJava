package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class CollectionTester {
	int objIntValue;
	String objName;
	double objDoubleValue;
	char objCharValue;
	boolean objBooleanValue;
	short objShortValue;
	byte objByteValue;
	
	public static void main(String a[]) {
		
		Collection collection= new ArrayList<>();
		
		CollectionTester collection1=new CollectionTester();
		CollectionTester collection2=new CollectionTester();
		CollectionTester collection3=new CollectionTester();
		CollectionTester collection4=new CollectionTester();
		CollectionTester collection5=new CollectionTester();
		CollectionTester collection6=new CollectionTester();
		CollectionTester collection7=new CollectionTester();
		CollectionTester collection8=new CollectionTester();
		CollectionTester collection9=new CollectionTester();
		CollectionTester collection10=new CollectionTester();
		
		
		collection1.objIntValue=1;
		collection1.objName="collection2";
		collection2.objDoubleValue=56.8;
		collection2.objCharValue='c';
		collection3.objBooleanValue=true;
		collection4.objShortValue=6;
		collection5.objByteValue=1;
		collection5.objIntValue=10;
		collection6.objName="collection6";
		collection6.objDoubleValue=45.65;
		collection7.objBooleanValue=false;
		collection8.objByteValue=5;
			
//Tester test=new Tester();
//test.setRemoteId(5);
//test.setRemoteName("LG");   
			
		collection.add(1);
		collection.add("Telegram");
		collection.add(56.4);
		collection.add(5);
		collection.add("rs");
		collection.add(true);
		collection.add(67);
		collection.add("cr");
		collection.add("collection2");
		collection.add(45.89);
		
		
		
// collection.add(test);
		
		collection.add(new RemoteDto(5,"R"));
		collection.add(new BottleDto(50));
		collection.add(new BagDto("SkyBag",450));
		collection.add(new PenDto(3));
		collection.add(new GoldDto(4598.54));
		collection.add(new ChargerDto(456));
		collection.add(new LaptopDto("RS4584E"));
		collection.add(new SmartWatchDto(1234));
		collection.add(new MobileDto(12578));
		collection.add(new BatteryDto("Rechargable"));
		
       
		
		collection.remove(56.4);
		
		System.out.println(collection.size());
	
		collection.forEach(System.out::println);   //printing all details of collection using forEach() method 
	}

}
