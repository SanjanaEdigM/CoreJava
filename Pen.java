class Pen {
  public int id;
  public String name;
  public String color;
  public String type;
  public int price;
  public Reffil reffil;
  
  
	public void setId(int id){
	 this.id=id;
	}
	public void setName(String name){
	 this.name=name;
	}
	public void setColor(String color){
	 this.color=color;
	}
	public void setType(String type){
	 this.type=type;
	}
	public void setPrice(int price){
	 this.price=price;
	}
	public void setReffil(Reffil reffil ){
		this.reffil=reffil;
	}
	
	@Override
	public String toString(){
	 return "Pen ={id="+this.id+",name="+this.name+",color="+this.color+",price="+this.color+",reffil="+this.reffil+"}";
	}



}