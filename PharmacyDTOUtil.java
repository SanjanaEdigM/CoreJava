class PharmacyDTOUtil{
   public static void main(String a[]){
    
	PharmacyDTO dto1=new PharmacyDTO();
	
	dto1.setName("RTY4567TYU");
    dto1.setAddress("Mediplus");
	
	
	PharmacyDTO dto2=new PharmacyDTO();
	
	dto2.setName("56TRED899");
    dto2.setAddress("Apollo");
	
	System.out.println(dto1.getName()+" "+ dto1.getAddress());
	System.out.println(dto2.getName()+" "+ dto2.getAddress());
		
   }

}