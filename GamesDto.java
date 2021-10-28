package com.xworkz.olympic.dto;

public class GamesDto {
  private int gameId;
  private String gameName;
  
  public int getGameId() {
	return gameId;
  }
  public void setGameId(int gameId) {
	this.gameId = gameId;
  }
  
  public String getGameName() {
	return gameName;
  }
  public void setGameName(String gameName) {
	this.gameName = gameName;
  }
  
  @Override
  public String toString() {
	  return "GamesDto={gameId="+this.gameId+",gameName="+this.gameName+"}";
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
