class HardiskTester{
  public static void main(String a[]){
    HardiskDto hardisk=new HardiskDto();
	
	 hardisk.setId(456);
	 hardisk.setName("dell");
	 hardisk.setPrice(1234);
	 
	 Data data1=new Data();
	 
	 data1.type="text files";
	 
	 hardisk.setData(data1);
	 
	 System.out.println(hardisk.toString());
	
	 
  }


}