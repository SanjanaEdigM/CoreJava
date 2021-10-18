class Mask{
   int id;
   String name;
   double price;
   String color; 
   
   public void getMaskDetails(){
	   System.out.println(getId()+" "+getName()+" "+getPrice()+" "+getColor());
	  
   }
   
    public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name=name;
	}
    public String getName(){
		return name;
	}

    public void setPrice(double price){
		this.price=price;
	}
    public double getPrice(){
		return price;
	}

    public void setColor(String color){
		this.color=color;
	}
    public String getColor(){
		return color;
	}	
	
   @Override
   public int hashCode(){
	   return id;
   }
   
}