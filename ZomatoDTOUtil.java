class ZomatoDTOUtil{
   public static void main(String a[]){
     ZomatoDTO dto1=new ZomatoDTO();
	 
	 dto1.setZomatoDishID("56RESW765");
	 dto1.setZomatoDishName("Panner Manchurian");
	 dto1.setZomatoLocation("Rajajinagar");
	 
	 ZomatoDTO dto2=new ZomatoDTO();
	 
	 dto2.setZomatoDishID("56RESW74th");
	 dto2.setZomatoDishName("Naan with Curry");
	 dto2.setZomatoLocation("Vijaynagar");
	 
	 System.out.println(dto1.getZomatoDishID()+" "+ dto1.getZomatoDishName()+" "+ dto1.getZomatoLocation());
	 System.out.println(dto2.getZomatoDishID()+" "+ dto2.getZomatoDishName()+" "+ dto2.getZomatoLocation());
   
   
   
   }




}