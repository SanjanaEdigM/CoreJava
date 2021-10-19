class StatesDtoToString{
  public int numOfStates;
  public String name;
  
  public void setNumOfStates(int numOfStates){
	 this.numOfStates=numOfStates;
	}
	
	public void setName(String name){
	 this.name=name;
	}
	
	@Override
	public String toString(){
		return "StatesDtoToString ={numOfStates="+this.numOfStates+",name="+this.name+"}";
	}


}