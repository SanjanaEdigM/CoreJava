package com.xworkz.phone;

import com.xworkz.phone.dto.ContactsDto;

public class Phone {

	private ContactsDto[] contacts;
	int index;
	
	public Phone(int size) {
		contacts=new ContactsDto[size];
	}
	
	public boolean createContacts(ContactsDto contacts) {
		boolean iscreated=false;
		System.out.println("Inside create contacts method");
		 if(contacts!=null) {
			 this.contacts[index++]=contacts;
			 iscreated=true;
		 }
		 else {
			 System.out.println("contacts not found");
		 }
		 return iscreated;
	}
	
	public ContactsDto getContactById(int contactId) {
		ContactsDto contact=null;
		 System.out.println("inside getContactById");
		   if(contactId!=0) {
			   for(int i=0;i<contacts.length;i++) {
				   if(contacts[i].getContactId()==contactId) {
					   System.out.println("contact found by id"+contactId);
					  contact=contacts[i];
				   }
				   else {
					   System.out.println("contact not found by id");
				   }
			   }
		   }
		return contact;
	}
	
	
	
	
	public boolean updateContactNameById(String contactName,int contactId) {
		boolean update=false;
		System.out.println("Updating ContactNameById(");
		 for(int i=0;i<contacts.length;i++) {
			 if(contacts[i].getContactId()==contactId) {
				 contacts[i].setContactName(contactName);
				 update=true;
			 }
			 else {
				 System.out.println("app id not found");
			 }
			 
		 }
		 return update;
		 
	}
	
	public boolean deleteContactByName(String contactName) {
		boolean delete=false;
		System.out.println("Deleting the contact by name");
		  for(int i=0;i<contacts.length;i++) {
			  if(contacts[i].getContactName().equals(contactName)) {
				  contacts[i]=null;
				  delete=true;
			  }
			  else {
				  System.out.print("contact name not found");
			  }
		  }
		  return delete;
	}
	
	public void getAllContactDetails() {
		for(int i=0;i<contacts.length;i++) {
			System.out.println(contacts[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
