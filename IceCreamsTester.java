class IceCreamsTester{
     public static void main(String a[]){
	   IceCreams icecream1=new IceCreams();
	   IceCreams icecream2=new IceCreams();
	   IceCreams icecream3=new IceCreams();
	   
	   icecream1.name="Chocobar";
	   icecream1.price=10;
	   icecream1.flavour="mango";
	   
	   icecream2.name="cornito";
	   icecream2.price=20;
	   icecream2.flavour="chocolate";
	   
	   icecream3.name="GudBud";
	   icecream3.price=70;
	   icecream3.flavour="vanila";
	   
	   icecream1.eating();
	   
	   System.out.println(icecream1.name+" "+icecream1.price+" "+icecream1.flavour);
	   System.out.println(icecream2.name+" "+icecream2.price+" "+icecream2.flavour);
	   System.out.println(icecream3.name+" "+icecream3.price+" "+icecream3.flavour);
 
	 }
}