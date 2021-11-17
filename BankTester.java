package com.xworkz.bank.dto;

import java.util.Scanner;

import com.xorkz.bank.Bank;
import com.xorkz.bank.Exceptions;

public class BankTester {
	
	public static void main(String a[]) {
		System.out.println("enter the number of bank accounts");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Bank bank=new Bank(size);
		
		for(int i=0;i<size;i++) {
			AccountsDto account=new AccountsDto();
			
			System.out.println("enter the Account id");
			int accountId=sc.nextInt();
			account.setAccountId(accountId);
			
			System.out.println("enter the Account holder name");
			String accountHolderName=sc.next();
			account.setAccountHolderName(accountHolderName);
			
			System.out.println("enter the Account Type");
			String accountType=sc.next();
			account.setAccountType(accountType);
			
			try {
			boolean isAdded=bank.createAccount(account);
			System.out.println("account found is "+isAdded);
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			bank.getAllAccountDetails();
			
			System.out.println("Enter the account id to be fectched");
			try {
				System.out.println(bank.getAccountById(sc.nextInt()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Enter the account Name to be fectched");
			try {
				System.out.println(bank.getAccountByName(sc.next()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Enter the account type to be fectched");
			try {
				System.out.println(bank.getAccountByType(sc.next()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Enter the account type to be updated by id");
			try {
				System.out.println(bank.updateAccountTypebyId(sc.next(),sc.nextInt()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			bank.getAllAccountDetails();
			
			
			System.out.println("Enter the account name to be deleted");
			try {
				System.out.println(bank.deleteAccountbyName(sc.next()));
			} catch (Exceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			bank.getAllAccountDetails();
					
			
		}		
	}

}
