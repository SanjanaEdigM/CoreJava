class KfcDTO{
    public KfcDTO(){
	  System.out.println("Object is created for KfcDTO");
	 }
     
	 private  String kfcLocation;
	 private String kfcItemID;
	 private String kfcItemName;
	 
	 public String getKfcLocation(){
	  return kfcLocation;
	 }
	 
	 public void setKfcLocation(String kfcLocation){
	  this.kfcLocation=kfcLocation;
	 }
	 
	 public String getKfcItemID(){
	  return kfcItemID;
	 }
	 
	 public void setKfcItemID(String kfcItemID){
	  this.kfcItemID=kfcItemID;
	 }
	 
	 public String getKfcItemName(){
	  return kfcItemName;
	 }
	 
	 public void setKfcItemName(String kfcItemName){
	  this.kfcItemName=kfcItemName;
	 }

}