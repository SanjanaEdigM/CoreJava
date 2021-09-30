class SuperMarketArr{

static String  biscuits[]= {"Hide & Seek" , "Mom's Magic" ,"Good day","Marie Gold", "Parle G","Oreo","Dark Fantasy","Marie lite"};
static String vegetables[]= {"carrot","onion","potato" ,"tomato"};
static String dairyProducts[]  = {"Milk" , "Curd" ,"Cheese", "Paneer","Butter","Ghee","ButterMilk"};
static String  softDrinks[]  = {"MoguMogu","BadamDrink" ,"Fanta","Pepsi","Maaza","7up","Slice","Mountain"};


public static void main(String a[]){
System.out.println(biscuits.length);
    System.out.println("Welcome to Biscuits Department");
     for(int i= 0  ;  i < biscuits.length ; i++ ){
        System.out.println(biscuits[i]);
   }
   System.out.println("Welcome to Vegetables Department");
     for(int i=0 ; i < vegetables.length; i++){
       System.out.println(vegetables[i]);
}
System.out.println("Welcome to DairyProducts Department");
     for(int i=0 ; i < dairyProducts.length; i++){
       System.out.println(dairyProducts[i]);
}

  System.out.println("Welcome to SoftDrinks Department");
     for(int i=0 ; i < softDrinks.length; i++){
      System.out.println(softDrinks[i]);
}

}
}
