class Metro{
    String arrivingLocation;
	String metroColor;
	int priceOfTicket;
	String destinationLocation;
	
	public Metro(){
	 this("Vijaynagar","green",30,"Majestic");
	 System.out.println("Metro pbject is created");
	
	}
	
	public Metro(String arrivingLocation,String metroColor,int priceOfTicket,String destinationLocation){
		this.arrivingLocation=arrivingLocation;
		this.metroColor=metroColor;
		this.priceOfTicket=priceOfTicket;
		this.destinationLocation=destinationLocation;
		
	}
	
	public void toTravel(){
		System.out.println("Travelling");
	}
	
	public void displayMetroDetails(){
		System.out.println(arrivingLocation+" "+metroColor+" "+priceOfTicket+" "+destinationLocation);
	}
	
}