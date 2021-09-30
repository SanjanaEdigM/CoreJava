class AmusementParkTester{
     public static void main(String a[]){
	  AmusementPark park1=new AmusementPark();
	  AmusementPark park2=new AmusementPark();
	  AmusementPark park3=new AmusementPark();
	  
	  park1.name="Fun World";
	  park1.location="jaynagar";
	  park1.timings="11AM";
	  
	  park2.name="Snow city";
	  park2.location="vijaynagar";
	  park2.timings="10AM";
	  
	  park3.name="Wondeala";
	  park3.location="Mysore road";
	  park3.timings="10AM";
	  
	  park1.enjoying();
	  
	  System.out.println(park1.name+" "+park1.location+" "+ park1.timings);
	  System.out.println(park2.name+" "+park2.location+" "+ park2.timings);
	  System.out.println(park3.name+" "+park3.location+" "+ park3.timings);
	  
	  
	 
	 }

}