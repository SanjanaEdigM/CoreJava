class InsuranceDtoHc{
	  
	  int policyID;
	  String policyName;
	  String policyHolderName;
	  
	  public void details(){
		  System.out.println(getPolicyID()+" "+getPolicyName()+" "+getPolicyHolderName());
	  }
	  
	  public int getPolicyID(){
	   return policyID;
	  }
	  
	  public void setPolicyID(int policyID){
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

     @Override
	 public int hashCode(){
		 return policyID;
	 }

}