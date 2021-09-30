class RestuarantUtil{

    public static void main(String a[]){
	  
	   Restuarant rest=new Restuarant();
	   rest.restuarantName="1947";
	   rest.type="Veg";
	   rest.location="Malleshwaram";
	   rest.ownerName="Sadananda Gowda";
	   rest.restuarantId=467;
	   
	   rest.serveFood();
	   rest.displayRestuarant();
	   
	   Restuarant rest1=new Restuarant();
	   rest1.restuarantName="Empire";
	   rest1.type="Non-Veg";
	   rest1.location="Vijaynagara";
	   rest1.ownerName="Sanjana";
	   rest1.restuarantId=187;
	   
	   rest1.serveFood();
	   rest1.displayRestuarant();
	   
	   Restuarant rest2=new Restuarant();
	   rest2.restuarantName="Anmol";
	   rest2.type="Veg&Non-veg";
	   rest2.location="Ghandibazar";
	   rest2.ownerName="Samridi";
	   rest2.restuarantId=167;
	   
	   rest2.serveFood();
	   rest2.displayRestuarant();
	     
	 }
}