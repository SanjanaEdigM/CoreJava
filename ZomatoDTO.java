class ZomatoDTO{
   public ZomatoDTO(){
    System.out.println("object is created for ZomatoDTO");
   }
   
   
   private String zomatoDishID;
   private String zomatoDishName;
   private String zomatoLocation;
   
   public String getZomatoDishID(){
	   return zomatoDishID;
   }
   
   public void setZomatoDishID(String zomatoDishID){
	   this.zomatoDishID=zomatoDishID;
   }
   
   public String getZomatoDishName(){
	   return zomatoDishName;
   }
   
   public void setZomatoDishName(String zomatoDishName){
	   this.zomatoDishName=zomatoDishName;
   }
   
   public String getZomatoLocation(){
	   return zomatoLocation;
   }
   
   public void setZomatoLocation(String zomatoLocation){
	   this.zomatoLocation=zomatoLocation;
   }


}