class PropertyDTO{
    PropertyDTO(){
	 System.out.println("Object is created for projectDTO");
	}
	
    private String propertyID;
	private String propertyHolderName;
	private String propertyLocation;
	
	public String getPropertyID(){
		return propertyID;
	}
	public void setPropertyID(String propertyID){
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



}