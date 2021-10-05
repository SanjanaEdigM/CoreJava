class DrivingLicenceDTOUtil{
    public static void main(String a[]){
	
	  DrivingLicenceDTO dto1=new DrivingLicenceDTO();
	  
	  dto1.setDlNo("TN4577REW76");
	  dto1.setDlHolderName("Manjunath");
	  dto1.setAddress("Vijaynagar");
	  dto1.setPin(34560);
	  
	  
	  
	  DrivingLicenceDTO dto2=new DrivingLicenceDTO();
	  
	  dto2.setDlNo("KR4577REW76");
	  dto2.setDlHolderName("Ravi");
	  dto2.setAddress("Ghandinagar");
	  dto2.setPin(789566);
	  
	  System.out.println(dto1.getDlNo()+" "+ dto1.getDlHolderName()+" "+ dto1.getAddress()+" "+ dto1.getPin());
	  System.out.println(dto2.getDlNo()+" "+ dto2.getDlHolderName()+" "+ dto2.getAddress()+" "+ dto2.getPin());
	  
	  
	
	
	}




}