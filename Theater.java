import java.util.Scanner;

class Theater{

    public static void main(String[] a){
	Scanner scanner=new Scanner(System.in);
	
    System.out.println("enter the movie name");	
	String name=scanner.nextLine();
	
	System.out.println("enter the no of ticket");
	byte noOfTicket=scanner.nextByte();
	
	System.out.println("enter the language");
	String language=scanner.next();
	
		
    bookTicket();
	bookTicket(name,noOfTicket);
	bookTicket(name,language);
	
}
  static void bookTicket(){
  System.out.println("your ticket is booked");
  
  }
   
   static void bookTicket(String name,byte noOfTicket){
   
   System.out.println("your no of ticket "+noOfTicket+" is booked for the movies "+name);
   
   }
   static void bookTicket(String name,String language){
   
   System.out.println("your ticket is booked for the movie "+name+" in the language "+language);
   
   }

}