class InsuranceDtoHcTester{
   public static void main(String a[]){
   InsuranceDtoHc dto1=new InsuranceDtoHc();
   
	  dto1.setPolicyID(145);
	  dto1.setPolicyName("Jeevan Tunga");
	  dto1.setPolicyHolderName("Sanjana");
	  
	  dto1.details();
	  System.out.println("default value of hashcode "+dto1.hashCode());
   }

}