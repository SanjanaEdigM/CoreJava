
import java.util.Scanner;

class Average{
	   
	   public static float averageNum(float numbers[]){
			float sum=0;
			for(int i=0;i<numbers.length;i++){
				sum=sum+numbers[i];
			}
			float avg=sum/numbers.length;
			return avg;
	   }

	   public static void main(String []a){
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter number of numbers you want");
		   int size = scanner.nextInt();
		   float []numbers = new float[size];
		   
		   System.out.println("Enter your numbers");
		   for (int i =0;i<size;i++){
			   numbers[i]=scanner.nextFloat();  
		   }
		   
		   float res = averageNum(numbers);
		   
				System.out.println(res);  
		
	   }
}
