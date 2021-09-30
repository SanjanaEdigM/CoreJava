class PatientDTOUtil{
   public static void main(String a[]){
	 PatientDTO dto=new PatientDTO(); //object created
	  
	  dto.setPatientId(0563);
	  dto.setPatientName("Sanjana");  //using setter method to initialse & access the private data
	  dto.setAge(21);
	  dto.setGender("female");
	  dto.setAddress("XYZ");
	  dto.setBloodGroup("O+");
	  
	 PatientDTO dto1=new PatientDTO();
	 
	  dto1.setPatientId(45678);
	  dto1.setPatientName("Chirantana");
	  dto1.setAge(21);
	  dto1.setGender("female");
	  dto1.setAddress("CXZ");
	  dto1.setBloodGroup("O+");
  
	  System.out.println(dto.getPatientId()+" "+dto.getPatientName()+" "+dto.getAge()+" "+dto.getGender()+" "+dto.getAddress()
	  +" "+dto.getBloodGroup());
	  
	  System.out.println(dto1.getPatientId()+" "+dto1.getPatientName()+" "+dto1.getAge()+" "+dto1.getGender()+" "+dto1.getAddress()
	  +" "+dto1.getBloodGroup());
	
	}

}