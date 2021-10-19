class RouterDtoToStringTester{
    public static void main(String a[]){
	  RouterDtoToString dto1=new RouterDtoToString();
	   dto1.setRouterId(567);
	   dto1.setName("Airtel");
	   dto1.setColor("Black");
	   dto1.setPrice(1456);
	   
	  RouterDtoToString dto2=new RouterDtoToString();
	   dto2.setRouterId(456);
	   dto2.setName("Jio");
	   dto2.setColor("white");
	   dto2.setPrice(6789);
	   
	  
	  RouterDtoToString dto3=new RouterDtoToString();
	   dto3.setRouterId(489);
	   dto3.setName("Hathway");
	   dto3.setColor("black");
	   dto3.setPrice(1234);
	   
	   System.out.println("To String method used "+dto1.toString()); // Explicit call of toString method
	   System.out.println("To String method used "+dto2.toString());
	   System.out.println("To String method used "+dto3.toString());
	   
	   System.out.println(dto1); //impicit call of toString method
	   System.out.println(dto2);
	   System.out.println(dto3);
	
	}
}