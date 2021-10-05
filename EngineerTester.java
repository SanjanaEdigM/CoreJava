class EcEngineerTester{
   public static void main(String a[]){
	   
    EcEngineer ec=new EcEngineer();
	
	EeEngineer ee=new EeEngineer();
	
		ec.engineerBranchName="Electronics and Communication Engineer";
		
		ee.engineerBranchName="Electrical and Electronics Engineer";
		
		
		ec.problemSolving();
		ec.displayDetails();
		
		
		
		ee.problemSolving();
		ee.displayDetails();
	
   }

}