class Variables{
    int a;             //instance variables
	int b;
	
	static int n;      //static variables
	
	public static void main(String arr[]){
	  int r=1;                       //local variable
	  Variables2 v2=new Variables2();
	  Variables2 v3=new Variables2();
	    v2.a=4;                      //initialising instance variable using  object or reference
		v2.b=5;
		v2.n=5;                      //initialising static variables using className
		Variables2.n=6;
		
		
		System.out.println(v2.a+" "+v2.b+" "+Variables2.n);
		System.out.println(v2.a+" "+v2.b+" "+v2.n+" "+r);
	
	
	
	}

}