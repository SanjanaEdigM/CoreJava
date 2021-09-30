class Engineer{

static String branches[]={"computer science enginering","electronics and electronics engineering","electrical and electronics engineering","information science engineering","mechanical engineering","civil engineering","Aeronatical engineering",
"chemical engineering","biotechnology engineering"};

public static void main(String[] a){
System.out.println("main method started");

getBranches(branches);

}

public static void  getBranches(String[] branches){
	System.out.println("inside getVegetables method with array parameters");
     for(int i=0;i<branches.length;i++){
      System.out.println(branches[i]);	
   }
 }
}