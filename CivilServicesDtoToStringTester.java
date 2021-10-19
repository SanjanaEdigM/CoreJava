class CivilServicesDtoToStringTester{
  public static void main(String a[]){
   CivilServicesDtoToString dto1=new CivilServicesDtoToString();
   
   dto1.setExamId(45612);
   dto1.setExamStage("Prelims");
   dto1.setExamMedium("English");
   dto1.setNumberOfServices(24);
   dto1.setServicePost("IPS");
   
   System.out.println(dto1);
 
  }

}