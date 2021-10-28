package com.xworkz.shopapp.dto;
import java.util.Scanner;

import com.xworkz.shopapp.Shop;

public class ShopTester {
   public static void main(String a[]) {
	   
	   System.out.println("enter the gadget array");
	   Scanner sc=new Scanner(System.in);
	   int size=sc.nextInt();
	   
	   Shop shop=new Shop(size);
	   
	   for(int i=0;i<size;i++) {
		   
		   ElectronicGadgetsDto gadget=new ElectronicGadgetsDto();
		   
		   System.out.println("enter the gadget Id");
		   int gadgetId=sc.nextInt();
		   gadget.setGadgetId(gadgetId);
		   
		   System.out.println("enter the gadget Name");
		   String gadgetName=sc.next();
		   gadget.setGadgetName(gadgetName);
		   
		   System.out.println("enter the gadget price");
		   double gadgetPrice=sc.nextDouble();
		   gadget.setGadgetPrice(gadgetPrice);
		   
		   
		   boolean isAdded=shop.createGadget(gadget);
		   System.out.println("Gadget found is "+isAdded);
		   
		   shop.getAllGadgetdetails();
		   
		   System.out.println("enter the gadget name to be fetched");
		   String Name=sc.next();
		   System.out.println(shop.getGadgetByName(gadgetName));
		   
		   System.out.println("enter the gadget id to be fetched");
		   int id=sc.nextInt();
		   System.out.println(shop.getGadgetById(gadgetId));
		   
		   System.out.println("enter the gadget name to be updated by gadget price");
		   System.out.println(shop.updateNameByGadgetPrice(sc.next(),sc.nextDouble()));
		   
		   shop.getAllGadgetdetails();
		   
		   System.out.println("enter the gadget id to be deleted");
		   System.out.println(shop.deleteGadgetById(sc.nextInt()));
		  
		   shop.getAllGadgetdetails();
	   }
	   	   
   }
		
}
