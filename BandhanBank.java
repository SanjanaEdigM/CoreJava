class BandhanBank extends BankInheritance{
  @Override
  public void provideLoans(double roi){
  System.out.println("Loan provided by bandhan bank");  //runtime polymorphism(method overriding) Parent object for creating child object is called upcasting in java
  System.out.println(roi);
  }  


}