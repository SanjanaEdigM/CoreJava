package com.xworkz.movie.dto;

import java.util.Scanner;

import com.xworkz.movie.Movie;


public class MovieTester {

public static void main(String a[]) {
		
		System.out.println("enter the number of cast");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Movie movie=new Movie(size);
		
		for(int i=0;i<size;i++) {
			CastDto cast=new CastDto();
			
			System.out.println("enter the cast id");
			int castId=sc.nextInt();
			cast.setCastId(castId);
			
			System.out.println("enter the game name");
			String castName=sc.next();
			cast.setCastName(castName);
			

			
			boolean isAdded;
			try {
				isAdded = movie.createCast(cast);
				System.out.println("cast found is "+isAdded);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			movie.getAllCastDetails();
		
			System.out.println("Enter the cast id to be fectched");
			try {
			System.out.println(movie.getCastById(sc.nextInt()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			
			System.out.println("Enter the cast name to be updated by id");
			try {
			System.out.println(movie.updateCastNameById(sc.next(),sc.nextInt()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			
			movie.getAllCastDetails();
			
			
			System.out.println("Enter the cast name to be deleted");
			try {
			System.out.println(movie.deleteCastByName(sc.next()));
			}catch(Exception sr) {
				sr.printStackTrace();
			}
			
			movie.getAllCastDetails();

		}
}
	
	

	
}
