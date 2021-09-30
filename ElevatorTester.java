class ElevatorTester{
    public static void main(String[] a){
	      
	 Elevator elevator=new Elevator();
	 Elevator elevator2=new Elevator();
	  
	  elevator.capacity="600 Kg";
	  elevator.height= "6 feet";
	  elevator.speed= "670.50mps";
	  elevator.type="passenger";
	  
	  elevator2.capacity="1000 Kg";
	  elevator2.height= "8 feet";
	  elevator2.speed= "250.50mps";
	  elevator2.type="Goods and products";
	  
	  System.out.println(elevator.capacity+" "+elevator.height+" "+elevator.speed+" "+elevator.type);
	  System.out.println(elevator.capacity+" "+elevator.height+" "+elevator.speed+" "+elevator.type);
	  
	  elevator.lifting(); 
	  }
}