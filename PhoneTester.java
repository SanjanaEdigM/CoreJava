package com.xworkz.phone.dto;

import java.util.Scanner;

import com.xworkz.phone.Phone;

public class PhoneTester {

public static void main(String a[]) {
		
		System.out.println("enter the number of contacts");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Phone phone=new Phone(size);
		
		for(int i=0;i<size;i++) {
			ContactsDto contact=new ContactsDto();
			
			System.out.println("enter the contact id");
			int contactId=sc.nextInt();
			contact.setContactId(contactId);
			
			System.out.println("enter the contact name");
			String contactName=sc.next();
			contact.setContactName(contactName);
			

			
			boolean isAdded;
			try {
				isAdded = phone.createContacts(contact);
				System.out.println("contact found is "+isAdded);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			phone.getAllContactDetails();
		
			System.out.println("Enter the contact id to be fectched");
			try {
			System.out.println(phone.getContactById(sc.nextInt()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			
			System.out.println("Enter the contact name to be updated by id");
			try {
			System.out.println(phone.updateContactNameById(sc.next(),sc.nextInt()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			
			phone.getAllContactDetails();
			
			
			System.out.println("Enter the contact name to be deleted");
			try {
			System.out.println(phone.deleteContactByName(sc.next()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			phone.getAllContactDetails();

		}
	
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
