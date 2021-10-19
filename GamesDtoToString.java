class GamesDtoToString{
    public int gameId;
	public String type;
	public String name;
	
	public void setGameId(int gameId){
	 this.gameId=gameId;
	}
	public void setType(String type){
	 this.type=type;
	}
	public void setName(String name){
	 this.name=name;
	}
	
	@Override
	public String toString(){
	 return "GamesDtoToString -[gameId="+this.gameId+",type="+this.type+",name="+this.name+"]";
	}
}