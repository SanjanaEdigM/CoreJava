class IceCreamDtoToString{
   public int id;
   public String flavour;
   public int price;
   
	public void setId(int id){
	this.id=id;
	}
	public void setFlavour(String flavour){
	this.flavour=flavour;
	}
	public void setPrice(int price){
	this.price=price;
	}
	
	@Override
	public String toString(){
	 return "IceCreamDtoToString -[id="+this.id+",flavour="+this.flavour+",price="+this.price+"]";
	}  

}