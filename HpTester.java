class HpTester{
     public static void main(String a[]){
 
       Hp hp=new Hp();
	   
	   hp.price=45000.00;
	   hp.processor="Intel";
	   hp.storage="500GB";
	   
	   hp.displayDetails();
	   String store=hp.store();
	   System.out.println(store);
	      
  }

}