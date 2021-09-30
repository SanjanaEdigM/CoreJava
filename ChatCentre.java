class ChatCentre{
      
	  String centreName;
	  int centreId;
	  String location;
	  String ownerName;
	  boolean isOpen;
	  String items[]=new String[6];
	  
	 public ChatCentre(){
		 
		 System.out.println("chatcenter object is created");
          		 
	  }
	 
	 public ChatCentre(String centreName,String loc,String items[]){   //constructor overloading
		 this.centreName=centreName;   //this keyword used to know the name conflict between instance and local variable
         location=loc;    // without using this keyword
         this.items=items;
		 
	 }
     
     public ChatCentre(int centreId,String ownerName,boolean isOpen){
		 this.centreId=centreId;
		 this.ownerName=ownerName;
		 this.isOpen=isOpen; 
		 
	 }	

     public void displayChatCentre(){
		 System.out.println(""+centreId+" "+centreName+" "+location+" "+isOpen);	 
		 
	 }	 
	  
     public void getItems(){
		for(int i=0;i<items.length;i++)
		 System.out.println(items[i]);
	 }

}