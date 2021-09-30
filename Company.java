class Company{

static String companynames[]={"microsoft","apple","LTI","deloitte","TCS","accenture","IBM","Capgemini","subex","seimens","robosoft","crimson logic","tata elxsi","infosys",
"wipro","legato","iget","jpmorgan","katar","society general","CGI","google"};


public static void main(String[] a){
System.out.println("main method started");

getCompanynames(companynames);

}

public static void  getCompanynames(String[] companynames){
	
	System.out.println("inside getcompanynames method with array parameters");
for(int i=0;i<companynames.length;i++){
System.out.println(companynames[i]);	
}
}

}