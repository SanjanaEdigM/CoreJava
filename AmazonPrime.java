class AmazonPrime{

static String movies[]={"shershah","dia"};
static String series[]={"family man","ypung sheldon"};

static String movie="yuvaratna";

public static void main(String[] a){
System.out.println("main method started");

getMovies(movies);
String mov=getMovies(movie);
System.out.println(mov);
}

public static void getMovies(String[] movies){
	System.out.println("inside getmovies method with array parameters");
for(int i=0;i<movies.length;i++){
System.out.println(movies[i]);	
	
}

}

public static String getMovies(String movie){
return movie;

}

}