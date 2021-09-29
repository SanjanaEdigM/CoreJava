class SocialMedia{

static String socialmedianames[]={"youtube","whatsapp","twitter","instagram","facebook","snapchat","pinterest","Linkdin","yahoo","googleplus","facebook messenger","Skype"};


public static void main(String[] a){
System.out.println("main method started");

getSocialmedianames(socialmedianames);

}

public static void  getSocialmedianames(String[] socialmedianames){
	
	System.out.println("inside getsocialmedianames method with array parameters");
for(int i=0;i<socialmedianames.length;i++){
System.out.println(socialmedianames[i]);	
}
}

}