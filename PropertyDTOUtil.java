class PropertyDTOUtil{
  public static void main(String a[]){
    PropertyDTO dto1= new PropertyDTO();
	
		dto1.setPropertyID("456RDWSGT");
		dto1.setPropertyHolderName("Ram");
		dto1.setPropertyLocation("BH Road");
	
	PropertyDTO dto2= new PropertyDTO();
	
		dto2.setPropertyID("RSTU562134");
		dto2.setPropertyHolderName("Manjunath");
		dto2.setPropertyLocation("MRS");
		
    System.out.println(dto1.getPropertyID()+" "+dto1.getPropertyHolderName()+" "+dto1.getPropertyLocation());
	System.out.println(dto2.getPropertyID()+" "+dto2.getPropertyHolderName()+" "+dto2.getPropertyLocation());
		
  
  }

}