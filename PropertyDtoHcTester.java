class PropertyDtoHcTester{
  public static void main(String a[]){
    PropertyDtoHc dto1= new PropertyDtoHc();
	
		dto1.setPropertyID(456);
		dto1.setPropertyHolderName("Ram");
		dto1.setPropertyLocation("BH Road");
		
		dto1.details();
		System.out.println("default value of hashcode "+ dto1.hashCode());
  }
}
