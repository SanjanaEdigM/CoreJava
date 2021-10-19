class RouterDtoToString{
	int routerId;
	String name;
	String color;
	int price;
	
	public int getRouterId(){
	  return routerId;
	}
	public void setRouterId(int routerId){
	 this.routerId=routerId;
	}
	
	public String getName(){
	  return name;
	}
	public void setName(String name){
	  this.name=name;
	}
	
	public String getColor(){
	  return color;
	}
	public void setColor(String color){
	  this.color=color;
	}
	
	public int getPrice(){
	  return price;
	}
	public void setPrice(int price){
	  this.price=price;
	}

	@Override
	public String toString(){
	 return "RouterDtoToString-[routerId=" +this.routerId+ ",name=" +this.name+ ",color=" +this.color+ ",price=" +this.price+ "]";
	}
}