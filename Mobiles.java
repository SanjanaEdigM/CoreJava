class Mobiles{

static String mobilenames[]={"apple","xiaomi","redmi","samsung","nokia","vadophone","realme","vivo","oppo","spice","motorola","micromax","honor","oneplus","huawei"};


public static void main(String[] a){
System.out.println("main method started");

getMobilesnames(mobilenames);

}

public static void  getMobilesnames(String[] mobilenames){
	
	System.out.println("inside getmobilenames method with array parameters");
for(int i=0;i<mobilenames.length;i++){
System.out.println(mobilenames[i]);	
}
}

}