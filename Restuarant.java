class Restuarant{
   
   
   public int restuarantId;
   public String restuarantName;
   public String type;
   public String location;
   public String ownerName;
   
   
   public Restuarant(){      //default constructor
     System.out.println(" Restuarant object is created");   //object created 
   }

   public void serveFood(){
	 System.out.println("Serving food with delicious items");      
   }
   
   public void displayRestuarant(){
	   System.out.println(restuarantName+" "+type+" "+location+" "+ownerName+" "+restuarantId);
   }

}