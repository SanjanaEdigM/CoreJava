class Temple{
    
	public String templeName;
	public String location;
	public String godName;
	public Poojari poojari;
	
	public void setTempleName(String templeName){
	 this.templeName=templeName;
	}
	public void setLocation(String location){
	 this.location=location;
	}
	public void setGodName(String godName){
	 this.godName=godName;
	}
	public void setPoojari(Poojari poojari){
	 this.poojari=poojari;
	}
	
	@Override
	public String toString(){
	 return "Temple ={templeName="+this.templeName+",location="+this.location+",godName="+this.godName+")";
	}




}