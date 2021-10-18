class PropertyDtoHc{
	
     int propertyID;
	 String propertyHolderName;
	 String propertyLocation;
	 
	 public void details(){
		 System.out.println(getPropertyID()+" "+getPropertyHolderName()+" "+getPropertyLocation());
	 }
	
	public int getPropertyID(){
		return propertyID;
	}
	public void setPropertyID(int propertyID){
		this.propertyID=propertyID;
	}
	
	public String getPropertyHolderName(){
		return propertyHolderName;
	}
	public void setPropertyHolderName(String propertyHolderName){
		this.propertyHolderName=propertyHolderName;
	}
	
	public String getPropertyLocation(){
		return propertyLocation;
	}
	public void setPropertyLocation(String propertyLocation){
		this.propertyLocation=propertyLocation;
	}

   @Override
   public int hashCode(){
	   return propertyID;
   }

}