class ProjectDTO{
       public ProjectDTO(){
	    System.out.println("ProjectDTO object is Created");
	   }
	   
	   private String projectName;
	   private int projectMembers;
	   private String projectGuide;
	   private boolean isProjectStatus;
	   
	   public String getProjectName(){
	    return projectName;
	   }
	   
	   public void setProjectName(String projectName){
	   this.projectName=projectName;
	   }
	   
	   public int getProjectMembers(){
	    return projectMembers;
	   }
	   
	   public void setProjectMembers(int projectMembers){
	   this.projectMembers=projectMembers;
	   }
	   
	   public String getProjectGuide(){
	    return projectGuide;
	   }
	   
	   public void setProjectGuide(String projectGuide){
	   this.projectGuide=projectGuide;
	   }
	   
	   public boolean getIsProjectStatus(){
	    return isProjectStatus;
	   }
	   
	   public void setIsProjectStatus(boolean isProjectStatus){
	   this.isProjectStatus=isProjectStatus;
	   }
	   
	  
}