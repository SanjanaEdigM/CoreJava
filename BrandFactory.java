class BrandFactory{

static String womenswear[]={"kurta","sarees","lehenga","dupatas","palazzo","chudidars","jeanstops","jeans","gowns"};
static String menswear[]={"shirt","tshirt","jeans","formals","jackets"};
static String kidsswear[]={"frock","shorts","midi","tops"};



public static void main(String[] a){
System.out.println("main method started");

getWomenswear(womenswear);
getMenswear(menswear);
getKidsswear(kidsswear);

}

public static void  getWomenswear(String[] womenswear){
	
	System.out.println("inside womenswear method with array parameters");
for(int i=0;i<womenswear.length;i++){
System.out.println(womenswear[i]);	
}
}


public static void  getMenswear(String[] menswear){
	
	System.out.println("inside menswear method with array parameters");
for(int i=0;i<menswear.length;i++){
System.out.println(menswear[i]);	
}
}

public static void  getKidsswear(String[] kidsswear){
	
	System.out.println("inside kidswear method with array parameters");
for(int i=0;i<kidsswear.length;i++){
System.out.println(kidsswear[i]);	
}
}
}