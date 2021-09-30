class PrgmLang{

static String prgmlangnames[]={"c","c++","java","java script","HTML","CSS","c#","csharp","python","ruby","perl","PHP","SQL","j2ee","swift"};


public static void main(String[] a){
System.out.println("main method started");

getPrgmlangnames(prgmlangnames);

}

public static void  getPrgmlangnames(String[] prgmlangnames){
	
	System.out.println("inside getprgmlangnames method with array parameters");
for(int i=0;i<prgmlangnames.length;i++){
System.out.println(prgmlangnames[i]);	
}
}

}