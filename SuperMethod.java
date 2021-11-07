class A{
 A(){
 System.out.println("Hi"); //Constructor A is called by Constructor B by super() method which is default one and called automatiaclly
 
 }  
}

 class B extends A{
 B(){
	 
  System.out.println("Constructor");   
  
 }
public static void main(String ar[]){
 A a=new B();
 }
 
}

 




