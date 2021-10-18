class PharmacyDtoHcTester{
   public static void main(String a[]){
   
     PharmacyDtoHc dto1=new PharmacyDtoHc();
	 
		dto1.setId(234);
		dto1.setName("Apollo");
		dto1.setAddress("VijayNagara");
		
		System.out.println(dto1);
		dto1.details();
		System.out.println("default value of hashcode "+dto1.hashCode());
   
   }

}