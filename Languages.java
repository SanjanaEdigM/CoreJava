class Languages{

static String languagenames[]={"english","hindi","kannada","tamil","telugu","marati","odissa","gujrati","manipuri","malyali","bengali","urdu","punjabi"};


public static void main(String[] a){
System.out.println("main method started");

getLanguagenames(languagenames);

}

public static void  getLanguagenames(String[] languagenames){
	
	System.out.println("inside getlanguagenames method with array parameters");
for(int i=0;i<languagenames.length;i++){
System.out.println(languagenames[i]);	
}
}

}