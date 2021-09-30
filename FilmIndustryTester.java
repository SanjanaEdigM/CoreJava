class FilmIndustryTester{
   public static void main(String a[]){
   
   FilmIndustry film1=new FilmIndustry();
   FilmIndustry film2=new FilmIndustry();
   FilmIndustry film3=new FilmIndustry();
   
   film1.industries="sandalwood";
   film1.film_production="PRK";
   film1.language="kannada";
   film1.movie_name="yuvaratna";
   
   film2.industries="bollywood";
   film2.film_production="Sri";
   film2.language="hindi";
   film1.movie_name="chennai express";
   
   film3.industries="tollywood";
   film3.film_production="balaji";
   film3.language="telugu";
   film3.movie_name="rajarani";
   
   film1.filmRelease();
   
   System.out.println(film1.industries+" "+film1.film_production+" "+film1.language+" "+film1.movie_name);
   System.out.println(film2.industries+" "+film2.film_production+" "+film2.language+" "+film2.movie_name);
   System.out.println(film3.industries+" "+film3.film_production+" "+film3.language+" "+film3.movie_name);

   }

  }