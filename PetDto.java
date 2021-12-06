package com.xworkz.setconcepts.DTO;

import java.util.Comparator;

public class PetDto implements Comparable<PetDto>{


	private Integer id;
	private String name;
	private int age;
	
	public PetDto(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "PetDto ={id="+this.id+",name="+this.name+";age="+this.age+"}";
	}
	
	
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public int compareTo(PetDto o) {
		return this.hashCode() -  o.hashCode();
	}
	
	
}
