import java.util.Scanner;

class ControlStatment{
	
	  String s[]={"Paneer Manchurian","Papad Masala","Panner Pepper dry","BabyCorn Manchurian"};
	  String f[]={"Roti curry","NorthIndian meal","SouthIndian meal","VegBiriyani","Noodles"};
	  String ic[]={"Brownie with icecream","butterscotch","GudBud","BlackForest"};
	  String j[]={"pineapple juice","mango juice","watermelon juice","Apple juice"};
	  
    public static void main(String arr[]){
		
		
	  String c; 
	  Scanner sc=new Scanner(System.in);
	  ControlStatment sw=new ControlStatment();
	 
       do{
	   System.out.println("enter your input 1 if your choice for starters");
	   System.out.println("enter your input 2 if your choice for food");
	   System.out.println("enter your input 3 if your choice for icecream");
	   System.out.println("enter your input 4 if your choice for juice");
	   
	   System.out.println("enter your choice");
	     int choice=sc.nextInt();
		 
		switch(choice){
			
	    case 1:sw.starters();
		break;

        case 2:sw.food();
		break;

        case 3:sw.iceCreams();
		break;

        case 4:sw.juices();  
        break;

        default:System.out.println(" Sorry service not available ");
	   }
	   System.out.println("enter if want to continue y/n");
	    c=sc.next();
	   
	   
	   }while (c.equals("y"));
	   System.out.println("Thanks for using application:)");
	   
	 
	}
	
	public void starters(){
		   System.out.println("Starters available are \n");
		   for(int i=0;i<s.length;i++){
			   System.out.println(s[i]);
		   }
	   }
	   
	   public void food(){
		   System.out.println("foods available are \n");
		   for(int i=0;i<f.length;i++){
			   System.out.println(f[i]);
		   }
	   }
	   
	   public void iceCreams(){
		   System.out.println("icecream available are \n");
		   for(int i=0;i<ic.length;i++){
			   System.out.println(ic[i]);
		   }
	   }
	   
	   public void juices(){
		   System.out.println("juices available are \n");
		   for(int i=0;i<j.length;i++){
			   System.out.println(j[i]);
		   }
	   }

}