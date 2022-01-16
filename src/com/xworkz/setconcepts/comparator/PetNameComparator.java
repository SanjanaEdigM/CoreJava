package com.xworkz.setconcepts.comparator;

import java.util.Comparator;

import com.xworkz.setconcepts.DTO.PetDto;

public class PetNameComparator implements Comparator<PetDto>{

	@Override
	public int compare(PetDto o1, PetDto o2) {
		return (int)(o1.getName().compareTo(o2.getName()));
	}

}
