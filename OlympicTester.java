package com.xworkz.olympic.dto;

import java.util.Scanner;

import com.xworkz.olympic.Olympic;



public class OlympicTester {

	
public static void main(String a[]) {
		
		System.out.println("enter the number of games");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Olympic olympic=new Olympic(size);
		
		for(int i=0;i<size;i++) {
			GamesDto game=new GamesDto();
			
			System.out.println("enter the game id");
			int gameId=sc.nextInt();
			game.setGameId(gameId);
			
			System.out.println("enter the game name");
			String gameName=sc.next();
			game.setGameName(gameName);
			

			
			boolean isAdded=olympic.createGames(game);
			System.out.println("game found is "+isAdded);
			
			olympic.getAllGameDetails();
		
			System.out.println("Enter the game id to be fectched");
			System.out.println(olympic.getGameById(sc.nextInt()));
			
			
			System.out.println("Enter the game name to be updated by id");
			System.out.println(olympic.updateGameNameById(sc.next(),sc.nextInt()));
			
			
			olympic.getAllGameDetails();
			
			
			System.out.println("Enter the game name to be deleted");
			System.out.println(olympic.deleteGameByName(sc.next()));
			
			olympic.getAllGameDetails();

		}
}
	
}
