class Bank{

static String banknames[]={"ICICI bank","bank of baroda","HDFC","karnataka bank","state bank of India","axis bank","canara bank","pragati gramina bank","union bank","kotak bank",
"corporation bank","federal bank","UCO Bank","IDBI bank","bank of India"};


public static void main(String[] a){
System.out.println("main method started");

getBanknames(banknames);

}

public static void  getBanknames(String[] banknames){
	
	System.out.println("inside getcompanynames method with array parameters");
for(int i=0;i<banknames.length;i++){
System.out.println(banknames[i]);	
}
}

}