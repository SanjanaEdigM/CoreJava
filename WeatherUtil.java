class WeatherUtil{
   public static void main(String a[]){
     Weather w1=new Weather();
	 w1.weatherDegree="21 degree celsius";
	 w1.weatherCondition="Mostly cloudy";
	 
	 w1.weatherAnalysis();
	 
	System.out.println(w1.weatherCondition+" "+w1.weatherDegree);
	
	Weather w2=new Weather();
	 w2.weatherDegree="39 degree celsius";
	 w2.weatherCondition="Suuny";
	 
	 w2.weatherAnalysis();
	 
	System.out.println(w2.weatherCondition+" "+w2.weatherDegree);
   
   }

}