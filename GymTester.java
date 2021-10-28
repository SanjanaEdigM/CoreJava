package com.xworkz.gym.dto;

import java.util.Scanner;

import com.xworkz.gym.Gym;


public class GymTester {
public static void main(String a[]) {
		
		System.out.println("enter the number of equipment");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Gym gym=new Gym(size);
		
		for(int i=0;i<size;i++) {
			EquipmentDto equipment=new EquipmentDto();
			
			System.out.println("enter the Equipment id");
			int equipmentId=sc.nextInt();
			equipment.setEquipmentId(equipmentId);
			
			System.out.println("enter the Equipment name");
			String equipmentName=sc.next();
			equipment.setEquipmentName(equipmentName);
			

			
			boolean isAdded=gym.createEquipment(equipment);
			System.out.println("equipment found is "+isAdded);
			
			gym.getAllEquipmentDetails();
		
			System.out.println("Enter the equipment id to be fectched");
			System.out.println(gym.getEquipmentById(sc.nextInt()));
			
			
			System.out.println("Enter the equipment name to be updated by id");
			System.out.println(gym.updateEquipmentNameById(sc.next(),sc.nextInt()));
			
			
			gym.getAllEquipmentDetails();
			
			
			System.out.println("Enter the equipment name to be deleted");
			System.out.println(gym.deleteEquipmentsByName(sc.next()));
			
			gym.getAllEquipmentDetails();

		}
}
	

}
