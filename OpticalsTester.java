class OpticalsTester{
     public static void main(String a[]){
	 
	 Opticals specs1=new Opticals();
	 Opticals specs2=new Opticals();
	 Opticals specs3=new Opticals();
	 
	 specs1.price=1000;
	 specs1.power=1.4;
	 
	 specs2.price=1200;
	 specs2.power=1.5;
	 
	 specs3.price=1100;
	 specs3.power=1.2;
	 
	 specs1.buying();
	 
	 System.out.println(specs1.price+" "+specs1.power);
	 System.out.println(specs2.price+" "+specs2.power);
	 System.out.println(specs3.price+" "+specs3.power);
	 
	 
	 
	 
	 
	 }




}