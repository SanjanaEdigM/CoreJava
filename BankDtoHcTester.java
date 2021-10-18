class BankDtoHcTester{
  public static void main (String a[]){
     BankDtoHc dto1=new BankDtoHc();
	 
	 dto1.setId(456);
	 dto1.setName("Bank of Baroda");
	 dto1.setIfsc("BAB056");
	 
	 dto1.details();
	 System.out.println("default value of hashcode "+dto1.hashCode());
  
  } 



}