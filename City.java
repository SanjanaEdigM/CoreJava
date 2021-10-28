package com.xworkz.city;

import com.xworkz.city.dto.CompanyDto;

public class City {

	private CompanyDto[] companys;
	int index;
	
	public City(int size) {
		companys=new CompanyDto[size];
	}
	
	public boolean createCompany(CompanyDto companys) {
		boolean iscreated=false;
		System.out.println("Inside create Companys method");
		 if(companys!=null) {
			 this.companys[index++]=companys;
			 iscreated=true;
		 }
		 else {
			 System.out.println("company not found");
		 }
		 return iscreated;
	}
	
	public CompanyDto getCompanyById(int companyId) {
		CompanyDto company=null;
		 System.out.println("inside getCompanyById ");
		   if(companyId!=0) {
			   for(int i=0;i<companys.length;i++) {
				   if(companys[i].getCompanyId()==companyId) {
					   System.out.println("company found by id"+companyId);
					   company=companys[i];
				   }
				   else {
					   System.out.println("company not found by id");
				   }
			   }
		   }
		return company;
	}
	
	public CompanyDto getCompanyByName(String companyName) {
		CompanyDto company=null;
		 System.out.println("inside CompanyByName ");
		   if(companyName!=null) {
			   for(int i=0;i<companys.length;i++) {
				   if(companys[i].getCompanyName().equals(companyName)) {
					   System.out.println("comapany found by name"+companyName);
					  company=companys[i];
				   }
				   else {
					   System.out.println("company not found by name");
				   }
			   }
		   }
		return company;
	}
	
	
	public boolean updateCompanyNameById(String companyName,int companyId) {
		boolean update=false;
		System.out.println("Updating updateCompanyNameById");
		 for(int i=0;i<companys.length;i++) {
			 if(companys[i].getCompanyId()==companyId) {
				 companys[i].setCompanyName(companyName);
				 update=true;
			 }
			 else {
				 System.out.println("company id not found");
			 }
			 
		 }
		 return update;
		 
	}
	
	public boolean deleteCompanyByName(String companyName) {
		boolean delete=false;
		System.out.println("Deleting the company by name");
		  for(int i=0;i<companys.length;i++) {
			  if(companys[i].getCompanyName().equals(companyName)) {
				  companys[i]=null;
				  delete=true;
			  }
			  else {
				  System.out.print("company name not found");
			  }
		  }
		  return delete;
	}
	
	public void getAllCompanyDetails() {
		for(int i=0;i<companys.length;i++) {
			System.out.println(companys[i]);
		}
	}
	

	
}
