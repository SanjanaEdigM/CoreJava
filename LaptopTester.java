class LaptopTester{

     public static void main(String a[]){
	  
	  Laptop laptop=new Laptop();
	  laptop.name="hp";
	  laptop.RAM="8GB";
	  laptop.price=45000;
	  laptop.hard_drive="120GB";
	  laptop.screen_size="15.6 inch";
	  
	  
	  Laptop laptop2=new Laptop();
	  laptop2.name="DELL";
	  laptop2.RAM="8GB";
	  laptop2.price=55000;
	  laptop2.hard_drive="120GB";
	  laptop2.screen_size="14.6 inch";
	  
	  
	  Laptop laptop3=new Laptop();
	  laptop3.name="Asus";
	  laptop3.RAM="8GB";
	  laptop3.price=40000;
	  laptop3.hard_drive="80GB";
	  laptop3.screen_size="13.6 inch";
	  
	   laptop3.musicPlaying();
	   
	     System.out.println(laptop.name+" "+laptop.RAM+" "+laptop.price+" " +laptop.hard_drive+" "+laptop.screen_size);
		 System.out.println(laptop2.name+" "+laptop2.RAM+" "+laptop2.price+" " +laptop2.hard_drive+" "+laptop2.screen_size);
		 System.out.println(laptop3.name+" "+laptop3.RAM+" "+laptop3.price+" " +laptop3.hard_drive+" "+laptop3.screen_size);
	  
	 }
}