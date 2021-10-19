class GodDtoToString{
   public String name;
   public String religion;
   
   public void setName(String name){
    this.name=name;
   }
   public void setReligion(String religion){
    this.religion=religion;
   } 
   
   @Override
   public String toString(){
    return "GodDtoToString -[name="+this.name+",religion="+this.religion+"]";
   }

}