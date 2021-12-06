package com.xworkz.clonable.entry;

import com.xworkz.clonable.dto.MobileDto;

public class MobileGetGo {
  public static void main(String[] args) throws CloneNotSupportedException {
	
	 MobileDto mobile=new MobileDto();
	 
	 mobile.setId(45);
	 mobile.setName("mi");
	 mobile.setPrice(12000);
	 mobile.setType("Android");
	 
	 Object obj=mobile.clone();
	 MobileDto mobilecopy=(MobileDto)obj;
	 
	 System.out.println(mobile);
	 System.out.println(mobilecopy.toString());
	  
 }
}
