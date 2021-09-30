class PlanetUtil{
    public static void main(String a[]){
	 Planet planet1=new Planet();
	  planet1.planetName="Mercury";
      planet1.isTerrestrialPlanet=true;
	  planet1.isGiantPlanet=false;
	  
	  planet1.planetStudy();
	  System.out.println(planet1.planetName+" terrestrial palnet "+planet1.isTerrestrialPlanet+" giant planet "+planet1.isGiantPlanet);
	  
	  
	 Planet planet2=new Planet();
	  planet2.planetName="Jupiter";
      planet2.isTerrestrialPlanet=false;
	  planet2.isGiantPlanet=true;
	  
	  planet2.planetStudy();
	  System.out.println(planet2.planetName+" terresrial planet "+planet2.isTerrestrialPlanet+" giat planet  "+planet2.isGiantPlanet);
	  
	 Planet planet3=new Planet();
	  planet3.planetName="venus";
      planet3.isTerrestrialPlanet=true;
	  planet3.isGiantPlanet=false;
	  
	  planet3.planetStudy();
	  System.out.println(planet3.planetName+" terrestrial planet "+planet3.isTerrestrialPlanet+" giant planet "+planet3.isGiantPlanet);
	  
	}
}