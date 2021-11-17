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
			

			
			boolean isAdded;
			try {
				isAdded = gym.createEquipment(equipment);
				System.out.println("equipment found is "+isAdded);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			gym.getAllEquipmentDetails();
		
			System.out.println("Enter the equipment id to be fectched");
			try {
			System.out.println(gym.getEquipmentById(sc.nextInt()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			
			System.out.println("Enter the equipment name to be updated by id");
			try {
			System.out.println(gym.updateEquipmentNameById(sc.next(),sc.nextInt()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			gym.getAllEquipmentDetails();
			
			
			System.out.println("Enter the equipment name to be deleted");
			try {
			System.out.println(gym.deleteEquipmentsByName(sc.next()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			gym.getAllEquipmentDetails();

		}
}
	

}
