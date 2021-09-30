 import java.util.Scanner;
 class Cakes{

   public static void main(String a[]){
      Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Cake flavour");
	    String flavour=sc.nextLine();
		
	  Scanner sc1=new Scanner(System.in);
	   System.out.println("Enter the Cake price");
	    int price=sc1.nextInt();
		
	  Scanner sc2=new Scanner(System.in);
	   System.out.println("Enter the type of cake ");
	    String type=sc2.nextLine();
		
		cakeBuy();
		cakeBuy(flavour,price);
		cakeBuy(type);
		
		
	   String retval=cakeBuy(type);
	   System.out.println("Cake type is "+type);
		
   }    
	 public static void cakeBuy(){
		 System.out.println("Cakes are available");
	 }
	 
	 public static void cakeBuy(String flavour,int price){
		 System.out.println("Cake flavour is "+flavour+" and price is "+price);
	 }
	 
     public static String cakeBuy(String type){
		 return type;
	 }
   
   }




