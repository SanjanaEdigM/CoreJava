class ChatCentreUtil{
      
	 public static void main(String p[]){
	 
	   ChatCentre centre=new ChatCentre();
	     centre.items[0]="Pani Puri";
		 centre.items[1]="kachori";
		 centre.items[2]="Samosa";
		 centre.items[3]="French Fries";
		 centre.items[4]="Sandwich";
		 centre.items[5]="Gobi";
		 
	   ChatCentre centre1=new ChatCentre("Sai Chats","near KLE Ground",centre.items);
	   centre1.displayChatCentre();
	   centre.getItems();
	   
	   ChatCentre centre2=new ChatCentre(450,"Ranganna",true);
	   centre2.displayChatCentre();
	 
	 }
	 
}