class MaskTester{
   public static void main(String a[]){
	   
     System.out.println("Main method started");
	 
	  Mask mask=new Mask();
	   mask.setId(234);
	   mask.setName("positive");
	   mask.setPrice(120.00);
	   mask.setColor("blue");
	   
	   mask.getMaskDetails();
	   System.out.println(mask);
	   System.out.println("Default value of hashcode "+ mask.hashCode());
	   
	 System.out.println(mask.hashCode());
	 
	 Mask mask2=new Mask();
	   mask2.setId(23);
	   mask2.setName("N95");
	   mask2.setPrice(120.00);
	   mask2.setColor("blue");
	   
	   mask2.getMaskDetails();
	      System.out.println(mask2);
	   
	 System.out.println(mask2.hashCode());
	 
	 System.out.println("Main method ended");
	 System.out.println("Default value of hashcode "+ mask2.hashCode());
	 
	 
  
   }
}


 
