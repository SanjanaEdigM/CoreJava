class Airport{
   public int airportId;
   public String airportName;
   public String location;
   public Terminal terminals; //classtype reference to achieve has a -relation class which have reference of another class


   public Airport(){
	   System.out.println(this.getClass().getSimpleName()+" Obeject is created" );
	   }

   public void setAirportId(int airportId){
	   this.airportId=airportId;
   }

   public void setAirportName(String airportName){
	   this.airportName=airportName;
   } 
   
   public void setLocation(String location){
	   this.location=location;
   } 
   
   public void setTerminal(Terminal terminals){
	   this.terminals=terminals;
   }   
   
   @Override
   public String toString(){
	   return "Airport -[airportId="+this.airportId+" ,airportName="+this.airportName+" ,location="+this.location+" ,terminals="+this.terminals+" ]";
   }
	   
	   
}