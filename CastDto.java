package com.xworkz.movie.dto;

public class CastDto {
   
	private int castId;
	private String castName;

	
	public int getCastId() {
		return castId;
	}
	public void setCastId(int castsId) {
		this.castId = castsId;
	}
	
	public String getCastName() {
		return castName;
	}
	public void setCastName(String castName) {
		this.castName = castName;
	}
	
	@Override
	public String toString() {
		return "CastDto={castId="+this.castId+",castName="+this.castName+"}";
	}
	
	
	
	
}
