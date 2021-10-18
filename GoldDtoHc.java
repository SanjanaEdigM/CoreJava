class GoldDtoHc{
    
	 int id;
	 float goldPrice;
	 String goldGram;
	 String goldDesignType;
	 
	 public void details(){
	  System.out.println(getId()+" "+getGoldPrice()+ " "+getGoldGram()+" "+getGoldDesignType());
	 }
	 
	 public int getId(){
	  return id;
	 }
	 public void setId(int id){
	  this.id=id;
	 }
	
	 public float getGoldPrice(){
		 return goldPrice;
	 }
	 public void setGoldPrice(float goldPrice){
		 this.goldPrice=goldPrice;
	 }
	 
	 public String getGoldGram(){
		 return goldGram;
	 }
	 public void setGoldGram(String goldGram){
		 this.goldGram=goldGram;
	 }
	 
	 public String getGoldDesignType(){
		return goldDesignType;   
	 }
	 public void setGoldDesignType(String goldDesignType){
		 this.goldDesignType=goldDesignType;
	 }
	 
	 
	 public int hashcode(){
		 return id;
	 }
	 
}