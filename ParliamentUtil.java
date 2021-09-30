class ParliamentUtil{
        
	public static void main(String a[]){
		
		 Parliament p1=new Parliament();
		  p1.houses="Rajya Sabha";
		  p1.seats="245 members of Rajya Sabha";
		  p1.politicalGroups="Governmaent";
		  
		  p1.assemblyMeeting();
		  
		  System.out.println(p1.houses+" "+p1.seats+" "+"with political groups "+p1.politicalGroups);
		  
		 Parliament p2=new Parliament();
		  p2.houses="Lok Sabha";
		  p2.seats="543 members of Lok Sabha";
		  p2.politicalGroups="Opposition";
		  
		  p2.assemblyMeeting();
		  
		  System.out.println(p2.houses+" "+p2.seats+" "+"with political groups "+p2.politicalGroups);
		
		
		}

}