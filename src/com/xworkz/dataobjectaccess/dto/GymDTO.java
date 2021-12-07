package com.xworkz.dataobjectaccess.dto;

import com.xworkz.dataobjectaccess.doa.GymDAO;
import com.xworkz.dataobjectaccess.doa.IplDAO;

public class GymDTO {
	
        public static void main(String[] args) {
		
		GymDAO dao=new GymDAO();
		
		dao.save("HN7 Fitness Arena");
		dao.save("Malleshwaram");
		
		
		boolean found=dao.find("HN7 Fitness Arena");
		System.out.println(found);
		
		found=dao.findByCaseSensitive("Malleshwaram");
		System.out.println(found);
		
		found =dao.findByCaseSensitiveAndTrimmed("hn7fitnessarena");
		System.out.println(found);
	}
}
