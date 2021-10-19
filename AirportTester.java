class AirportTester{
    public static void main(String a[]){
	  Airport airport=new Airport();
	  
	   airport.setAirportId(567);
	   airport.setAirportName("KIA");
	   airport.setLocation("near Devanahalli ");
	   
	  Terminal terminal=new Terminal();
	  
	    terminal.terminalId=56;
		terminal.name="Terminal 1";
		
	  airport.setTerminal(terminal); //has-A realtions
		
	  System.out.println(airport.toString());
	  System.out.println(terminal.toString());
	}
	

}