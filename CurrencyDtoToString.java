class CurrencyDtoToString{
   
     public String currencyType;
	 public String currencyId;
	 public int currencyValue;
	 
	 public void setCurrencyType(String currencyType){
	  this.currencyType=currencyType;
	 }
	 public void setCurrencyId(String currencyId){
	  this.currencyId=currencyId;
	 }
	 public void setCurrencyValue(int currencyValue){
	  this.currencyValue=currencyValue;
	 }
	 
	 @Override
	 public String toString(){
	  return "CurrencyDtoToString =[currencyType="+this.currencyType+",currencyId="+this.currencyId+",currencyValue="+this.currencyValue+"]";
	  
	 }
	 

}