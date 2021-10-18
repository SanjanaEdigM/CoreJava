class KfcDtoHc{
    
     
	  String kfcLocation;
	  int kfcItemID;
	  String kfcItemName;
	  
	 public void details(){
	  System.out.println(getKfcLocation()+" "+getKfcItemID()+" "+getKfcItemName());
	 }
	  
	 public String getKfcLocation(){
	  return kfcLocation;
	 }
	 
	 public void setKfcLocation(String kfcLocation){
	  this.kfcLocation=kfcLocation;
	 }
	 
	 public int getKfcItemID(){
	  return kfcItemID;
	 }
	 
	 public void setKfcItemID(int kfcItemID){
	  this.kfcItemID=kfcItemID;
	 }
	 
	 public String getKfcItemName(){
	  return kfcItemName;
	 }
	 
	 public void setKfcItemName(String kfcItemName){
	  this.kfcItemName=kfcItemName;
	 }
 
      @Override
	  public int hashCode(){
	   return kfcItemID;
	  }
}