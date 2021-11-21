class Array{
	static Object obj[]=new Object[3] ;    //**************Object array to add heterogeneous element into an array
    public static void main(String a[]){
	  
	  obj[0]="cr";
	  obj[1]=5;
	  obj[2]=4.5;
	  System.out.println(obj[0]);
	  for(int i=0;i<obj.length;i++){
		  System.out.println(obj[i]);
	  }
	
	}	
	
}