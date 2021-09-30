class Exam{
        	  
   public static String universityName="VTU";
   public static int fees=1345;

	  
	  public static void allow(String[] hallTicket){

			System.out.println("start of allow with hallTicket");


		if(hallTicket!=null){
			
				gethallTicketDetails(hallTicket);
	}
		else{
				System.out.println("no hallticket found");
	
	}
				System.out.println("end of the allow method with the hallticket");

	}


	public static void allow(int fees){
			System.out.println("start of allow with fees");
	
		if (fees>1000){
			System.out.println(fees);
		
	}
		else{
	
			System.out.println("please pay the fees");

	}
			System.out.println("end of the allow method with the fees");
	
	}

	public static void gethallTicketDetails(String[] hallTicket){
	
		for(int i=0;i<hallTicket.length;i++)
			
			System.out.println(hallTicket[i]);

	}
}