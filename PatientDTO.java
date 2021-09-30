class PatientDTO{
     public PatientDTO(){
       System.out.println("patientDTO object is created");
   }
   
	  private long patientId;
	  private String patientName;
	  private int age;
	  private String address;
	  private String bloodGroup;
	  private String gender;
	   
	   public long getPatientId(){
		   return patientId;
	   }
	   
	   public void setPatientId(long patientId){ //setter method
		   this.patientId=patientId;
	   }
	   
   
   
	   public String getPatientName(){        //getter method
		   return patientName;
	   }
	   
	   public void setPatientName(String patientName){
		   this.patientName=patientName;
	   }
   
   
   
	   public int getAge(){
		   return age;
	   }
	   
	   public void setAge(int age){
		   this.age=age;
	   }
	   
   
   
	   public String getAddress(){
		   return address;
	   }
	   
	   public void setAddress(String address){
		   this.address=address;
	   }
   
   
   
	   public String getBloodGroup(){
		   return bloodGroup;
	   }
	   
	   public void setBloodGroup(String bloodGroup){
		   this.bloodGroup=bloodGroup;
	   }
   
   
   
	   public String getGender(){
		   return gender;
	   }
	   
	   public void setGender(String gender){
		   this.gender=gender;
	   }



}