class LaptopTester{
  public static void main(String a[]){
    Laptop laptop=new Laptop();
	
	laptop.setId(456);
	laptop.setName("Hp");
	
	Hardisk hardisk=new Hardisk();
	
	hardisk.storage="1TB";

    laptop.setHardisk(hardisk);

    System.out.println(laptop);	
  
  
  
  }



}