class KfcDTOUtil{
     public static void main(String a[]){
	   KfcDTO dto1=new KfcDTO();
		 
	 dto1.setKfcLocation("JP Nagar");
	 dto1.setKfcItemID("456TRE");
	 dto1.setKfcItemName("Wings");
        
	  KfcDTO dto2=new KfcDTO();
		
	 dto2.setKfcLocation("Jaynagar");
	 dto2.setKfcItemID("789TYU");
	 dto2.setKfcItemName("chicken popcorn");
		 
     System.out.println("At "+dto1.getKfcLocation()+" we ordered the item "+dto1.getKfcItemName()+" of item ID "+dto1.getKfcItemID()+" at Kfc");
     System.out.println("At "+dto2.getKfcLocation()+" we ordered the item "+dto2.getKfcItemName()+" of item ID "+dto2.getKfcItemID()+" at kfc");
				 
	 
	 }

}