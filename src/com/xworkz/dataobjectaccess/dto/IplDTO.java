package com.xworkz.dataobjectaccess.dto;

import com.xworkz.dataobjectaccess.doa.IplDAO;
import com.xworkz.dataobjectaccess.doa.PgDAO;

public class IplDTO {
        public static void main(String[] args) {
		
		IplDAO dao=new IplDAO();
		
		dao.save("Royal Challengers Banglore");
		dao.save("Chennai Super Kings");
		dao.save("Mumbai Super Kings");
		
		boolean found=dao.find("Royal Challengers Banglore");
		System.out.println(found);
		
		found=dao.findByCaseSensitive("chennai super kings");
		System.out.println(found);
		
		found =dao.findByCaseSensitiveAndTrimmed("mumbaisuperkings");
		System.out.println(found);
	}
}
