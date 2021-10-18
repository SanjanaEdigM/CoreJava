class Gun{
	
  public Gun(){
   System.out.println("Constructor is called");
   System.out.println(this.getClass().getSimpleName()+"Object is created");
  }
  
   static{
    System.out.println("Static block is executed"); 
	{
	 System.out.println("init inside static block");	
	}
   }
   
    {
       System.out.println("init block is executed");
	   {
		 System.out.println("init block is executed");  
	   }
		 
		 {
			System.out.println("block inside block"); 
		 }
    }
  


}