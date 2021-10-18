class GoldDtoHcTester{
   
      public static void main (String[] a){
		  
		GoldDtoHc dto1=new GoldDtoHc();
		
	     dto1.setId(678);	
         dto1.setGoldGram("3gm");
		 dto1.setGoldPrice(12641);
		 dto1.setGoldDesignType("Fingure Ring");
		 
		 dto1.details();
		 System.out.println("default value of hashcode "+ dto1.hashCode());

	  }
	  
}