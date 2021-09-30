import java.util.Scanner;

class EvenOrOdd{

   public static void main(String[] a){
   
    Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter the number");
	int num=scanner.nextInt();
	
	evenOrOdd(num);
	System.out.println("given number is " +num);
	

}
 public static int evenOrOdd(int num){
 
 if(num%2==0){
	 
	 System.out.println("given number "+num+" is even number ");
 }
	 
else{
	
	System.out.println("given number "+num+"is odd number ");
}	 
 return num;
 
 }

}