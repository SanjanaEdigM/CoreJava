class PharmacyDTO{
    public PharmacyDTO(){
	 System.out.println("object is created for PharmacyDTO");
	}
	
	private String name;
	private String address;
	
	public String getName(){
	 return name;
	}
	public void setName(String name){
	 this.name=name;
	}
	
	public String getAddress(){
	 return address;
	}
	public void setAddress(String address){
	 this.address=address;
	}

}