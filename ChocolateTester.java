class ChocolateTester{
	
     public static void main(String[] a){
	    Chocolate chocolate1=new Chocolate();
		Chocolate chocolate2=new Chocolate();
		Chocolate chocolate3=new Chocolate();
		
		  chocolate1.name="Milkybar";
		  chocolate1.price=10;
		  chocolate1.manufactured_date=2021;
		  
		  
		  chocolate2.name="Gems";
		  chocolate2.price=10;
		  chocolate2.manufactured_date=2021;
		  
		  
		  chocolate3.name="KinderJoy";
		  chocolate3.price=40;
		  chocolate3.manufactured_date=2011;
		  
		  chocolate1.openAndEat();
		  
		  System.out.println(chocolate1.name+" "+chocolate1.price+" " +chocolate1.manufactured_date);
		  System.out.println(chocolate2.name+" "+chocolate2.price+" " +chocolate2.manufactured_date);
		  System.out.println(chocolate3.name+" "+chocolate3.price+" " +chocolate3.manufactured_date);
	 
	 }
}