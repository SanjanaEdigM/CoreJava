class GoogleUtil{
     public static void main(String a[]){
	   Google google=new Google();
	   Google google1=new Google();
	   Google google2=new Google();
	   
	   
	    google.search="Frankie Rolls";
		google.searchType="By text";
		google.searchResult="Images";
		
		google1.search="Vada pav";
		google1.searchType="google assistance ";
		google1.searchResult="Images";
		
		google2.search="Dalgona coffee making videos";
		google2.searchType="By text";
		google2.searchResult="videos";
		
		google.searching();
		
		System.out.println(google.search+" "+google.searchType+" "+google.searchResult);
		System.out.println(google1.search+" "+google1.searchType+" "+google1.searchResult);
		System.out.println(google2.search+" "+google2.searchType+" "+google2.searchResult);
		
	 }
}