package com.xorkz.bank;

import com.xworkz.bank.dto.AccountsDto;

public class Bank {
	private AccountsDto[] accounts;
	int index;
	
	public Bank(int size) {
		accounts=new AccountsDto[size];
	}
	
	public boolean createAccount(AccountsDto accounts) {
		boolean iscreated=false;
		System.out.println("Inside create account method");
		 if(accounts!=null) {
			 this.accounts[index++]=accounts;
			 iscreated=true;
		 }
		 else {
			 System.out.println("accounts not found");
		 }
	
	return iscreated;		
	}
	
	public AccountsDto getAccountById(int accountId) {
		AccountsDto account=null;
		 System.out.println("inside getAccountById() ");
		   if(accountId!=0) {
			   for(int i=0;i<accounts.length;i++) {
				   if(accounts[i].getAccountId()==accountId) {
					   System.out.println("account found by id"+accountId);
					   account=accounts[i];
				   }
				   else {
					   System.out.println("Account not found by id");
				   }
			   }
		   }
		return account;
	}
	
	public AccountsDto getAccountByName(String accountHolderName) {
		AccountsDto account=null;
		 System.out.println("inside getAccountByName() ");
		   if(accountHolderName!=null) {
			   for(int i=0;i<accounts.length;i++) {
				   if(accounts[i].getAccountHolderName().equals(accountHolderName)) {
					   System.out.println("account found by name"+accountHolderName);
					   account=accounts[i];
				   }
				   else {
					   System.out.println("Account not found by name");
				   }
			   }
		   }
		return account;
	}
	
	public AccountsDto getAccountByType(String accountType) {
		AccountsDto account=null;
		 System.out.println("inside getAccountById() ");
		   if(accountType!=null) {
			   for(int i=0;i<accounts.length;i++) {
				   if(accounts[i].getAccountType()==accountType) {
					   System.out.println("account found by type"+accountType);
					   account=accounts[i];
				   }
				   else {
					   System.out.println("Account not found by type");
				   }
			   }
		   }
		return account;
	}
	
	
	public boolean updateAccountTypebyId(String accountType,int accountId) {
		boolean update=false;
		System.out.println("Updating AccountTypebyId");
		 for(int i=0;i<accounts.length;i++) {
			 if(accounts[i].getAccountId()==accountId) {
				 accounts[i].setAccountType(accountType);
				 update=true;
			 }
			 else {
				 System.out.println("Account id not found");
			 }
			 
		 }
		 return update;
		 
	}
	
	public boolean deleteAccountbyName(String accountHolderName) {
		boolean delete=false;
		System.out.println("Deleting the account by name");
		  for(int i=0;i<accounts.length;i++) {
			  if(accounts[i].getAccountHolderName().equals(accountHolderName)) {
				  accounts[i]=null;
				  delete=true;
			  }
			  else {
				  System.out.print("account name not found");
			  }
		  }
		  return delete;
	}
	
	public void getAllAccountDetails() {
		for(int i=0;i<accounts.length;i++) {
			System.out.println(accounts[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	

}
