import java.util.Scanner;
class RealityShow{

     public static void main(String a[]){
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of string array");
	    int size=sc.nextInt();
	     String arr[]=new String[size];
		 
	 for(int i=0;i<size;i++){
	   System.out.println("Enter the String element");
        arr[i]=sc.next();
           		
	 }
      
	 for(int j=0;j<size;j++){
	   System.out.println("array elements are "+arr[j]);
	 }

  }
}

    String arr[]={"Comedy kiladigalu","sa re ga ma pa","Super minute"};

      System.out.println(arr[2]);*/
      System.out.println(arr[2]);*/

   for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
    }

  }
}
