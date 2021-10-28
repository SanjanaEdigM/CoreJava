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
			

			
			boolean isAdded=movie.createCast(cast);
			System.out.println("cast found is "+isAdded);
			
			movie.getAllCastDetails();
		
			System.out.println("Enter the cast id to be fectched");
			System.out.println(movie.getCastById(sc.nextInt()));
			
			
			System.out.println("Enter the cast name to be updated by id");
			System.out.println(movie.updateCastNameById(sc.next(),sc.nextInt()));
			
			
			movie.getAllCastDetails();
			
			
			System.out.println("Enter the cast name to be deleted");
			System.out.println(movie.deleteCastByName(sc.next()));
			
			movie.getAllCastDetails();

		}
}
	
	

	
}
