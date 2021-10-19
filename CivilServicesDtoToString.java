class CivilServicesDtoToString{

   public int examId;
   public String examStage;
   public String examMedium;
   public int numberOfServices;
   public String servicePost;
   
   public void setExamId(int examId){
    this.examId=examId;
   }
   public void setExamStage(String examStage){
    this.examStage=examStage;
   }
   public void setExamMedium(String examMedium){
    this.examMedium=examMedium;
   }
   public void setNumberOfServices(int numberOfServices ){
    this.numberOfServices=numberOfServices;
   }
   public void setServicePost(String servicePost){
    this.servicePost=servicePost;
   }
   
   @Override
   public String toString(){
    return "Civil Service details CivilServicesDtoToString -[examId="+this.examId+",examStage="+this.examStage+",examMedium="+this.examMedium+",numberOfServices="+this.numberOfServices+",servicePost="+this.servicePost+"]";
	
   }
   

}