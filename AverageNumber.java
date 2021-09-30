import java.util.Scanner;
class AverageNumber{

    public static void main (String[] a){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		float n1=scanner.nextFloat();
		float n2=scanner.nextFloat();
		
		float res=averageOfTwoNum(n1,n2);
		
		System.out.println("average of two number is"+res);
	}
	
	public static float averageOfTwoNum(float n1,float n2){
		float sum=n1+n2;
		float avg=sum/2;
		return avg;	
	}
        
}