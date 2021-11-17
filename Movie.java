package com.xworkz.movie;

import com.xworkz.movie.dto.CastDto;

public class Movie {

	private CastDto[] casts;
	int index;
	
	public Movie (int size) {
		casts=new CastDto[size];
	}
	
	public boolean createCast(CastDto casts) throws Exception {
		boolean iscreated=false;
		System.out.println("Inside create cast method");
		 if(casts!=null) {
			 try {
			 this.casts[index++]=casts;
			 iscreated=true;
		 }
			 catch(ArrayIndexOutOfBoundsException sr) {
				sr.printStackTrace();
		    	   System.out.println("cannot add element to array");
			 }
		 }
		 else {
			 System.out.println("cast not found");
		 }
		 return iscreated;
	}
	
	public CastDto getCastById(int castId) throws Exception {
		CastDto cast=null;
		 System.out.println("inside getCastById");
		   if(castId!=0) {
			   for(int i=0;i<casts.length;i++) {
				   if(casts[i].getCastId()==castId) {
					   System.out.println("cast found by id"+castId);
					  cast=casts[i];
				   }
				   else {
					   System.out.println("cast not found by id");
				   }
			   }
		   }
		return cast;
	}
	
	
	
	
	public boolean updateCastNameById(String castName,int castId) throws Exception{
		boolean update=false;
		System.out.println("Updating CastNameById(");
		 for(int i=0;i<casts.length;i++) {
			 if(casts[i].getCastId()==castId) {
				 casts[i].setCastName(castName);
				 update=true;
			 }
			 else {
				 System.out.println("cast id not found");
			 }
			 
		 }
		 return update;
		 
	}
	
	public boolean deleteCastByName(String castName) throws Exception {
		boolean delete=false;
		System.out.println("Deleting the cast by name");
		  for(int i=0;i<casts.length;i++) {
			  if(casts[i].getCastName().equals(castName)) {
				  casts[i]=null;
				  delete=true;
			  }
			  else {
				  System.out.print("cast name not found");
			  }
		  }
		  return delete;
	}
	
	public void getAllCastDetails() {
		for(int i=0;i<casts.length;i++) {
			System.out.println(casts[i]);
		}
	}
	
}
