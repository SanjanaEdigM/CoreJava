class CameraTester{
   public static void main(String a[]){
   
    Camera cam1=new Camera();
    Camera cam2=new Camera();
    Camera cam3=new Camera();
   
     cam1.name="Cannon";
	 cam1.price=14000;
	 
	 
     cam2.name="nikon";
	 cam2.price=19000;
	 
	 
     cam3.name="DSLR";
	 cam3.price=34000;
	 
	 cam1.capturingPicture();
	 
	 System.out.println(cam1.name+" "+cam1.price);
	 System.out.println(cam2.name+" "+cam2.price);
	 System.out.println(cam3.name+" "+cam3.price);
   
   }

}