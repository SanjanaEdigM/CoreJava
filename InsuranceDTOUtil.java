class InsuranceDTOUtil{
    public static void main(String a[]){
	 InsuranceDTO dto1=new InsuranceDTO();
	  dto1.setPolicyID("145SRFD");
	  dto1.setPolicyName("Jeevan Tunga");
	  dto1.setPolicyHolderName("Sanjana");
	  
	  InsuranceDTO dto2=new InsuranceDTO();
	  dto2.setPolicyID("45679RSGGT");
	  dto2.setPolicyName("Jeevan Rakshak");
	  dto2.setPolicyHolderName("Samridi");
	  
	  System.out.println(dto1.getPolicyID()+" "+dto1.getPolicyName()+" "+dto1.getPolicyHolderName());
	  System.out.println(dto2.getPolicyID()+" "+dto2.getPolicyName()+" "+dto2.getPolicyHolderName());
	   
	}

}
