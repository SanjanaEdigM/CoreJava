class FancyStore{
    String nameStore;
	String location;
	String type[]={"Comb","Clips","Creams","Bangles","Earings"};
	
	public FancyStore(){
	 this("Ram Store","B H road");
	 System.out.println("FancyStore object is created");
	}
	
	public FancyStore(String nameStore,String location){
	 this.nameStore=nameStore;
	 this.location=location;
	}
	
	public void toPurchase(){
	System.out.println("To purchase");
	}
	
	public void displayFancyStore(){
	System.out.println(nameStore+" "+location);
	}
	
	public void getItems(){
	for(int i=0;i<type.length;i++){
	System.out.println(type[i]);
	}
  }
}