class HardiskDto{
   public int id;
   public String name;
   public int price;
   public Data data;
   
   public void setId(int id){
    this.id=id;
   }
   public void setName(String name){
    this.name=name;
   }
   public void setPrice(int price){
    this.price=price;
   }
   public void setData(Data data){
    this.data=data;
   }
   
   @Override
   public String toString(){
    return "HardiskDto ={id="+this.id+",name="+this.name+",price="+this.price+"}";
    }
}







