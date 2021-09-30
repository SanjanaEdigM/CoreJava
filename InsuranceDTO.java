class InsuranceDTO{
      public InsuranceDTO(){
	   System.out.println("Insurance DTO object is created ");
	  }
	  
	  private String policyID;
	  private String policyName;
	  private String policyHolderName;
	  
	  public String getPolicyID(){
	   return policyID;
	  }
	  
	  public void setPolicyID(String policyID){
	   this.policyID=policyID;
	  }
	  
	  public String getPolicyName(){
	   return policyName;
	  }
	  
	  public void setPolicyName(String policyName){
	   this.policyName=policyName;
	  }
	  
	  public String getPolicyHolderName(){
	   return policyHolderName;
	  }
	  
	  public void setPolicyHolderName(String policyHolderName){
	   this.policyHolderName=policyHolderName;
	  }
	  
}