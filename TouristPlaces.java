class TouristPlaces{

    static String touristplacesnames[]={"jog falls","kalatigiri","mulayngiri","mysore palace","golgumbaz","madikeri","oty","goa","kuppali","chamundi betta","taj mahal","red fort"};


     public static void main(String[] a){
       System.out.println("main method started");

    getTouristplacesnames(touristplacesnames);

 }

     public static void  getTouristplacesnames(String[] companynames){
	
	System.out.println("inside gettouristplacesnames method with array parameters");
       for(int i=0;i<touristplacesnames.length;i++){
         System.out.println(touristplacesnames[i]);	
   }
 }

}