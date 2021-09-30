class CityUtil{
    public static void main(Strings a[]){
	  City city1=new City();
	  city1.cityName="Shimoga";
	  city1.streetName[]={"Ghandi Bazar","Navule","Savalanga"};
	  
	  city1.ciytVisit();
	  System.out.println(city1.cityName);
	  for(int i=0;i<streetName.length;i++){
		  System.out.println(city1.streetName[i]);
	  }
	  
	  City city2=new City();
	  city2.cityName="Bengaluru";
      city2.streetName[]={"fourthBlock","Malleshwaram"};	  
	  
	  city2.ciytVisit();
	  System.out.println(city2.cityName);
	  for(int i=0;i<streetName.length;i++){
		  System.out.println(city2.streetName[i]);
	  }
	    
	  
}
}