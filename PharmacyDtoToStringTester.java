class PharmacyDtoToStringTester{
   public static void main(String a[]){
   
     PharmacyDtoToString dto1=new PharmacyDtoToString();
	 
		dto1.setId(234);
		dto1.setName("Apollo");
		dto1.setAddress("VijayNagara");
		
		System.out.println(dto1);
		dto1.details();
		
   
   }

}