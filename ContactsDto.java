package com.xworkz.phone.dto;



public class ContactsDto {
	
	
	private int contactId;
	private String contactName;
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	@Override
	public String toString() {
		return "ContactDto={contactId="+this.contactId+",contactName="+this.contactName+"}";
	}

}





