class ProjectDTOUtil{
      public static void main(String a[]){
	  
	   ProjectDTO dto1=new ProjectDTO();
		dto1.setProjectName("Auto Attendance System");
        dto1.setProjectMembers(4);
        dto1.setProjectGuide("Shwetha HR");
        dto1.setIsProjectStatus(true);
		
	   ProjectDTO dto2=new ProjectDTO();
		dto2.setProjectName("Credit card fraud detection");
        dto2.setProjectMembers(4);
        dto2.setProjectGuide("Shwetha HR");
        dto2.setIsProjectStatus(true);
		
	   System.out.println(dto1.getProjectName()+" "+dto1.getProjectMembers()+" "+dto1.getProjectGuide()+" "+dto1.getIsProjectStatus());
	   System.out.println(dto2.getProjectName()+" "+dto2.getProjectMembers()+" "+dto2.getProjectGuide()+" "+dto2.getIsProjectStatus());
	   
	  
	  }

}