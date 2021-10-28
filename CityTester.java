package com.xworkz.city.dto;

import java.util.Scanner;

import com.xworkz.city.City;

public class CityTester {

	public static void main(String a[]) {
		System.out.println("enter the number of companys");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		City city=new City(size);
		
		for(int i=0;i<size;i++) {
			CompanyDto company=new CompanyDto();
			
			System.out.println("enter the company id");
			int companyId=sc.nextInt();
			company.setCompanyId(companyId);
			
			System.out.println("enter the company name");
			String companyName=sc.next();
			company.setCompanyName(companyName);
			

			
			boolean isAdded=city.createCompany(company);
			System.out.println("company found is "+isAdded);
			
			city.getAllCompanyDetails();
		
			System.out.println("Enter the company id to be fectched");
			System.out.println(city.getCompanyById(sc.nextInt()));
			
			System.out.println("Enter the company Name to be fectched");
			System.out.println(city.getCompanyByName(sc.next()));
			
			
			System.out.println("Enter the company name to be updated by id");
			System.out.println(city.updateCompanyNameById(sc.next(),sc.nextInt()));
			
			
			city.getAllCompanyDetails();
			
			
			System.out.println("Enter the company name to be deleted");
			System.out.println(city.deleteCompanyByName(sc.next()));
			
			city.getAllCompanyDetails();

		}
	
	
	}
}
