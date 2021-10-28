package com.xworkz.bank.dto;

public class AccountsDto {
	private int accountId;
	private String accountHolderName;
	private String accountType;
	
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public String toString() {
		return "AccountsDto={accountId="+this.accountId+",accountHolderName="+this.accountHolderName+",accountType="+this.accountType+"}";
	}
	
	
	
	
	

}
