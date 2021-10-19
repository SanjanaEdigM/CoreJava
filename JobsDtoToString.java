class JobsDtoToString{
   public int jobId;
   public String jobType;
   public String jobPost;
   
   public void setJobId(int jobId){
    this.jobId=jobId;
   }
   public void setJobType(String jobType){
    this .jobType=jobType;
   }
   public void setJobPost(String jobPost){
    this.jobPost=jobPost;
   }
   
   @Override
   public String toString(){
    return "JobsDtoToString ={jobId="+this.jobId+",jobType="+this.jobType+",jobPost="+this.jobPost+"}";
   }



}