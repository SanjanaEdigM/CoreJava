class BankTester{
     public static void main(String a[]){
	  BankInheritance bank1=new BandhanBank();
	  BankInheritance bank2=new ApnaBank();
	  BankInheritance bank3=new UnionBank();
	  BankInheritance bank4=new KotakBank();
	  BankInheritance bank5=new GraminaBank();
	
       bank1.provideLoans(7.5);
	   bank2.provideLoans(8.8);
	   bank3.provideLoans(5.5);
	   bank4.provideLoans(6.7); 
	   bank5.provideLoans(9.8); 
	   
	 }

}