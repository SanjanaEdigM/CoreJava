class ICCTeamsTester{
   public static void main(String[] a){
      ICCTeams team1=new ICCTeams();
	  ICCTeams team2=new ICCTeams();
	  ICCTeams team3=new ICCTeams();
	  
	  team1.name="India";
	  team1.points=9398;
	  team1.matches=35;
	  
	  team2.name="SouthAfrica";
	  team2.points=5398;
	  team2.matches=33;
	  
	  team3.name="WestIndies";
	  team3.points=6398;
	  team3.matches=34;
	  
	  team1.playingCricket();
	  
	  System.out.println(team1.name+" "+team1.points+" "+team1.matches);
	  System.out.println(team2.name+" "+team2.points+" "+team2.matches);
	  System.out.println(team3.name+" "+team3.points+" "+team3.matches);
   }

}		