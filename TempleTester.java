class TempleTester{

   public static void main(String a[]){
     Temple temple=new Temple();
	 
	  temple.setTempleName("Raghavendra swamy mutt");
	  temple.setLocation("Rajajinagar");
	  temple.setGodName("Guru Raghavendra");
	  
	 Poojari poojari=new Poojari();
	   
	   poojari.name="ramswamy";
	   
	 temple.setPoojari(poojari);
	 
	 System.out.println(temple);
   
   }

}