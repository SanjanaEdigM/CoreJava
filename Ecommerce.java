class Ecommerce
{
  String name[]={"Snapdeal","Amazon","Flipcart"};
  String type;
  
  public Ecommerce(){
  this("Mobile");
   System.out.println("Ecmmerce object is created");
  }
  
  public Ecommerce(String type){
  this.type=type;
  }

  public void shopping(){
   System.out.println("Shop the items you wish");
  }
  
  public void displayEcommerceDetails(){
   System.out.println(type);
  }
   
  public void getItems(){
   System.out.println("from any of the Ecommerce you wish");
    for(int i=0;i<name.length;i++){
     System.out.println(name[i]);
   }
  }
}