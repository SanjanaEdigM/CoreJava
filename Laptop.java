class Laptop{

  public int id;
  public String name;
  
  public void setId(int id){
   this.id=id;
  }
  public void setName(String name){
  this.name=name;
  }
  
  @Override
  public String toString(){
   return "Laptop ={id="+this.id+",name="+this.name+"}";
  }





}