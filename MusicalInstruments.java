class MusicalInstruments{

    public String name;
	public double price;
	public String frequency;
	public String type;
	
	public MusicalInstruments(String nm, double pr, String freq, String tp){	//Default constructor
		name=nm;
		price=pr;
		frequency=freq;
		type=tp;
		System.out.println("MusicalInstruments object is created  ");
		
	}
	
	public void play(String name){
	
	System.out.println("invoked play()");
	System.out.println("Playing"+name+"with friends");
	System.out.println("end of play()");
	}
	
	public void displayInstrument(){
		System.out.println( name+" "+price+" "+frequency+" "+type);
	}
}