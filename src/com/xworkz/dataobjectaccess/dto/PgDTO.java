package com.xworkz.dataobjectaccess.dto;

import com.xworkz.dataobjectaccess.doa.PgDAO;

public class PgDTO {

	public static void main(String[] args) {
		
		PgDAO dao=new PgDAO();
		
		dao.save("Sri Sai PG");
		dao.save("Rajajinagar");
		dao.save("5500 rent");
		
		boolean found=dao.find("Rajajinagar");
		System.out.println(found);
		
		found=dao.findByCaseSensitive("sri sai pg");
		System.out.println(found);
		
		found =dao.findByCaseSensitiveAndTrimmed("5500RENT");
		System.out.println(found);
	}

}
