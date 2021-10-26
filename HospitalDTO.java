class Hospital{
	
   public PatientDto[] patient;
   private int index;
   
   public void Hospital(int size){
	   patient=new PatientDto[size];
   }

public boolean createPatient(PatientDto patient){
	boolean PatientAdded=false;
	System.out.println("inside  addPatientDetails method");
	
	if(patient!=null){
		
	 this.patient[index++]=patient;
	  PatientAdded=true;

	}
	else{
		System.out.println("No Patient addes");
		return PatientAdded=false;
	}
	
	return PatientAdded;
	
	PatientAdded=false;
	
}

 public void getAllDetails(){
	 for(int i=0;i<patient.length;i++){
		 System.out.println(patient[i]);
	 }
 }
   


}