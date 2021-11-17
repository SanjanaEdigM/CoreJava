package com.xworkz.olympic;

import com.xworkz.olympic.dto.GamesDto;

public class Olympic {
	
	private GamesDto[] games;
	int index;
	
	public Olympic (int size) {
		games=new GamesDto[size];
	}
	
	public boolean createGames(GamesDto games) throws Exception {
		boolean iscreated=false;
		System.out.println("Inside create game method");
			 if(games!=null) {
			 this.games[index++]=games;
			 iscreated=true;
			 System.out.println("cannot add third element to array");
	  }
		
 	   
		 else {
			 System.out.println("game not found");
		 }
		 return iscreated;
	}

	
	public GamesDto getGameById(int gameId) throws Exception {
		GamesDto game=null;
		 System.out.println("inside getGameById");
		   if(gameId!=0) {
			   for(int i=0;i<games.length;i++) {
				   if(games[i].getGameId()==gameId) {
					   System.out.println("game found by id"+gameId);
					  game=games[i];
				   }
				   else {
					   System.out.println("game not found by id");
				   }
			   }
		   }
		return game;
	}
	
	
	
	
	public boolean updateGameNameById(String gameName,int gameId) throws Exception{
		boolean update=false;
		System.out.println("Updating GameNameById(");
		 for(int i=0;i<games.length;i++) {
			 if(games[i].getGameId()==gameId) {
				 games[i].setGameName(gameName);
				 update=true;
			 }
			 else {
				 System.out.println("game id not found");
			 }
			 
		 }
		 return update;
		 
	}
	
	public boolean deleteGameByName(String gameName) throws Exception {
		boolean delete=false;
		System.out.println("Deleting the game by name");
		  for(int i=0;i<games.length;i++) {
			  if(games[i].getGameName().equals(gameName)) {
				  games[i]=null;
				  delete=true;
			  }
			  else {
				  System.out.print("game name not found");
			  }
		  }
		  return delete;
	}
	
	public void getAllGameDetails() {
		for(int i=0;i<games.length;i++) {
			System.out.println(games[i]);
		}
	}
	
	
		
	
	

}
