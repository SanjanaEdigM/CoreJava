class BankDtoToStringTester{
  public static void main (String a[]){
     BankDtoToString dto1=new BankDtoToString();
	 
	 dto1.setId(456);
	 dto1.setName("Bank of Baroda");
	 dto1.setIfsc("BAB056");
	 
	 dto1.details();
	 System.out.println("To String method used "+dto1.toString());
  
  } 



}