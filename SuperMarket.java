class SuperMarket{

static String vegetables[]={"onion","beetroot","tomato","brinjal","drumstick","cucumber","carrot","radish","potato","chilly"};
static String fruits[]={"apple","pineapple","pappaya","gauva","grapes","orange","banana","chikku","leechy","pomogranate"};
static String biscuits[]={"goodday","moms magic","sunfeast","marigold","dark fantasy","treat","parlege","hide and seek","borboun"};
static String choclates[]={"diary milk","fivestar","milkybar","kinderjou]y","james","marbels","eclairs","kaccha mango","london diary","kopicho","alphanlibe"};
static String juice[]={"maaza","slice","jeera","fruity","tropicana","reall","natural","minute maid","paper boat","maa"};
static String snacks[]={"lays","kurkure","bingo","bingi triangles","puffcorn","doritos","piknic","mad angles","pringles"};


public static void main(String[] a){
System.out.println("main method started");

System.out.println(choclates.length);
System.out.println(vegetables.length);
System.out.println(snacks.length);

System.out.println(vegetables[0] + " "+ vegetables[1] +" " +vegetables[2]);
System.out.println(juice[0] + " "+ juice[1] +" " +juice[8]);

 vegetables[1]="capsicum";


getVegetables(vegetables);
getFruits(fruits);
getBiscuits(biscuits);
getChoclates(choclates);
getJuice(juice);
getSnacks(snacks);

} 
public static void  getVegetables(String[] vegetables){
	
	System.out.println("inside getVegetables method with array parameters");
for(int i=0;i<vegetables.length;i++){
System.out.println(vegetables[i]);	
}
}

public static void  getFruits(String[] fruits){
System.out.println("inside getfruits method with array parameters");
for(int i=0;i<fruits.length;i++){
System.out.println(fruits[i]);	
}
}

public static void  getBiscuits(String[] biscuits){
System.out.println("inside getbiscuits method with array parameters");
for(int i=0;i<biscuits.length;i++){
System.out.println(biscuits[i]);
}	
}

public static void  getChoclates(String[] choclates){
System.out.println("inside getchoclates method with array parameters");
for(int i=0;i<choclates.length;i++){
System.out.println(choclates[i]);	
}
}

public static void  getJuice(String[] juice){
System.out.println("inside getjuice method with array parameters");
for(int i=0;i<juice.length;i++){
System.out.println(juice[i]);	
}
}

public static void  getSnacks(String[] snacks){
System.out.println("inside getsnacks method with array parameters");
for(int i=0;i<snacks.length;i++){
System.out.println(snacks[i]);	
}



}
}