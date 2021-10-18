class KfcDtoHcTester{
     public static void main(String a[]){
	   KfcDtoHc dto1=new KfcDtoHc();
	
     	
	 dto1.setKfcLocation("JP Nagar");
	 dto1.setKfcItemID(456);
	 dto1.setKfcItemName("Wings");
	 
	 dto1.details();
	 System.out.println("default value of hashcode "+ dto1.hashCode());
	 }
	 
}