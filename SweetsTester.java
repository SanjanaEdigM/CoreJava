class SweetsTester{
	public static void main(String a[]){
           Sweets sweet=new Sweets();
	   Sweets sweet2=new Sweets();
	   Sweets sweet3=new Sweets();
	   
	   
	   sweet.name= "Ladoo";
	   sweet.color= "Saffron";
	   sweet.shape= "oval";
	   sweet.price=100;
	   sweet.typeOfState="solid";
	   
	   sweet2.name="caju barfi";
	   sweet2.color="cream";
	   sweet2.shape="rombus";
	   sweet2.price=70;
	   sweet2.typeOfState="solid";
	   
	   sweet3.name="Kheer";
	   sweet3.color="Cream";
	   sweet3.shape="no shape";
	   sweet3.price=40;
	   sweet3.typeOfState="liquid";

           sweet3.tasting();
		 
       System.out.println(sweet.name+" "+sweet.color+" "+sweet.shape+" "+sweet.price+" "+sweet.typeOfState); 
	   System.out.println(sweet2.name+" "+sweet2.color+" "+sweet2.shape+" "+sweet2.price+" "+sweet2.typeOfState); 
	   System.out.println(sweet3.name+" "+sweet3.color+" "+sweet3.shape+" "+sweet3.price+" "+sweet3.typeOfState); 
	   
}

}