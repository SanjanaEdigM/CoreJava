class SportsTester{
       public static void main(String a[]){
	     Sports sports1=new Sports(); 
		 Sports sports2=new Sports(); 
		 Sports sports3=new Sports(); 
	   
	      sports1.name="Cricket";
		  sports1.players=11;
		  sports1.type="outdoor game";
		  
		  
	      sports2.name="ShuttleCock";
		  sports2.players=2;
		  sports2.type="outdoor game";
		  
		  
	      sports3.name="Table Tennis";
		  sports3.players=2;
		  sports3.type="indoor game";
		  
		  sports1.watchingSports();
		  
		  System.out.println(sports1.name+" "+sports1.players+" "+sports1.type);
		  System.out.println(sports2.name+" "+sports2.players+" "+sports2.type);
		  System.out.println(sports3.name+" "+sports3.players+" "+sports3.type);
		  
	   
	   
	   }



}