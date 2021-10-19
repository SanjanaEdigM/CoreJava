class ContinentDtoToString{
    public int numberOfContinents;
	public String name;
	
	public void setNumberOfContinents(int numberOfContinents){
	 this.numberOfContinents=numberOfContinents;
	}
	
	public void setName(String name){
	 this.name=name;
	}
	
	@Override
	public String toString(){
		return "ContinentDtoToString ={numberOfContinents="+this.numberOfContinents+",name="+this.name+"}";
	}



}