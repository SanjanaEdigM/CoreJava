class MusicalInstUtil{

   public static void main(String a[]){
     MusicalInstruments music=new MusicalInstruments("Guitar",4000.50,"10hz","Western");
	  
	  
	  //music.name="Guitar";
	  //music.price=4000.50;
	  //music.frequency="10hz";
	  //music.type="Western";
	  
	 
      music.play(music.name);
	  music.displayInstrument();
   }

}