public class Hospital {
	public PatientDto[] patient;
	
	   private int index;
	   
	   
	   public Hospital(int size){
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
			
	}

	   public PatientDto getPatientByName(String patientName){
		   PatientDto dto1=null;
		   System.out.println("Inside getPatientName");
		    if(patientName!=null){
				for(int i=0;i<patient.length;i++)
				{
					if (patient[i].getPatientName().equals(patientName)){
						System.out.println("Patient found by name"+patientName);
						dto1=patient[i];
					}
					else
						System.out.println("name not found");
					
				}				
			}
			return dto1;
	   }
	   
	   public PatientDto getPatientById(int patientId){
		   PatientDto dto1=null;
		   System.out.println("Inside getPatientName");
		    if(patientId!=0){
				for(int i=0;i<patient.length;i++)
				{
					if (patient[i].getPatientId()==patientId){
						System.out.println("Patient found by name"+patientId);
						dto1=patient[i];
					}
					else{
						System.out.println("id not found");
					}
				}			
				
			}
			return dto1;
	   }
	   
	   
	   
	   public PatientDto getPatientByContactNo(long patientContactNo){
		   PatientDto dto1=null;
		   System.out.println("Inside getPatientName");
		    if(patientContactNo!=0){
				for(int i=0;i<patient.length;i++)
				{
					if (patient[i].getContactNo()==patientContactNo){
						System.out.println("Patient found by name"+patientContactNo);
						dto1=patient[i];
					}
					else{
						System.out.println("Contact not found");
					}
				}			
				
			}
			return dto1;
	   }

	    public PatientDto getPatientByGender(char patientGender){
		   PatientDto dto1=null;
		   System.out.println("Inside getPatientName");
		    if(patientGender!='\0'){
				for(int i=0;i<patient.length;i++)
				{
					if (patient[i].getGender()==patientGender){
						System.out.println("Patient found by name"+patientGender);
						dto1=patient[i];
					}
					else{
						System.out.println("Gender not found");
					}
				}			
				
			}
			return dto1;
	   }
	   
	   public PatientDto getPatientByAge(int patientAge){
		   PatientDto dto1=null;
		   System.out.println("Inside getPatientName");
		    if(patientAge!=0){
				for(int i=0;i<patient.length;i++)
				{
					if (patient[i].getAge()==patientAge){
						System.out.println("Patient found by name"+patientAge);
						dto1=patient[i];
					}
					else{
						System.out.println("age not found");
					}
				}			
				
			}
			return dto1;
	   }
	   
	   public PatientDto getPatientByBloodGroup(String patientBloodGroup){
		   PatientDto dto1=null;
		   System.out.println("Inside getPatientName");
		    if(patientBloodGroup!=null){
				for(int i=0;i<patient.length;i++)
				{
					if (patient[i].getBloodGroup().equals(patientBloodGroup)){
						System.out.println("Patient found by name"+patientBloodGroup);
						dto1=patient[i];
					}
					else{
						System.out.println("BloodGroup not found");
					}
				}			
				
			}
			return dto1;
	   }
	   
	   public PatientDto getPatientByAddressId(int addressId){
		   PatientDto patient1=null;
		   System.out.println("Inside getPatientByAddressId");
		    if(addressId!=0){
				for(int i=0;i<patient.length;i++)
				{
					PatientDto patient2=patient[i];
					AddressDTO address=patient2.getAddress();
					
					if (address.getAddressId()==addressId){
						System.out.println("Patient found by name"+addressId);
						patient1=patient[i];
					}
					
				}			
				
			}
		    else{
				System.out.println("Adress not found");
			}
			return patient1;
	   }
	   
	   
	   public PatientDto getPatientByStreetName(String streetName){
		   PatientDto patient1=null;
		   System.out.println("Inside getPatientByStreetName");
		    if(streetName!=null){
				for(int i=0;i<patient.length;i++)
				{
					System.out.println(patient[i]);
					
					if (patient[i].getAddress().getCountry().getState().getDistrict().getArea().getStreet().getStreetName().equals(streetName)){
						System.out.println("Patient found by Street name "+streetName);
						patient1=patient[i];
					}
					else{
						System.out.println("StreetName not found");
					}
				}			
				
			}
			return patient1;
	   }
	   
	   public PatientDto getPatientByStreetNo(int streetNo){
		   PatientDto patient1=null;
		   System.out.println("Inside getPatientByStreetNo");
		    if(streetNo!=0){
				for(int i=0;i<patient.length;i++)
				{
					System.out.println(patient[i]);
					
					if (patient[i].getAddress().getCountry().getState().getDistrict().getArea().getStreet().getStreetNo()==(streetNo)){
						System.out.println("Patient found by Street name "+streetNo);
						patient1=patient[i];
					}
					else{
						System.out.println("StreetNo not found");
					}
				}			
				
			}
			return patient1;
	   }
	   
	   
	   public PatientDto getPatientByStateName(String stateName) {
		   PatientDto patient1=null;
		   System.out.println("Inside getPatientByStateName");
		   if(stateName!=null) {
			   for(int i=0;i<patient.length;i++) {
				   System.out.println(patient[i]);
				   
				   if(patient[i].getAddress().getCountry().getState().getStateName().equals(stateName)) {
					   System.out.println("Patient found by StateId "+stateName ); 
					   patient1=patient[i];
				   }
				   else {
					   System.out.println("StateName not found");
				   }
			   }
		   }
		   return patient1;
		   }
	   
	   public PatientDto getPatientByStateId(int stateId) {
		   PatientDto patient1=null;
		   System.out.println("Inside getPatientByStateId");
		   if(stateId!=0) {
			   for(int i=0;i<patient.length;i++) {
				   System.out.println(patient[i]);
				   
				   if(patient[i].getAddress().getCountry().getState().getStateId()==stateId) {
					   System.out.println("Patient found by StateId "+stateId ); 
					   patient1=patient[i];
				   }
				   else {
					   System.out.println("StateId not found");
				   }
			   }
		   }
		   return patient1;
		   }
	   
	   
	     public PatientDto getPatientByAreaName(String areaName) {
		   PatientDto patient1=null;
		   System.out.println("Inside getPatientByAreaName");
		   if(areaName!=null) {
			   for(int i=0;i<patient.length;i++) {
				   System.out.println(patient[i]);
				   
				   if(patient[i].getAddress().getCountry().getState().getDistrict().getArea().getAreaName().equals(areaName)) {
					   System.out.println("Patient found by StateId "+areaName ); 
					   patient1=patient[i];
				   }
				   else {
					   System.out.println("AreaName not found");
				   }
			   }
		   }
		   return patient1;
		   }
	   
	   
	   
	   
	   
	 public void getAllDetails(){
		 for(int i=0;i<patient.length;i++){
			 System.out.println(patient[i]);
		 }
	 
	   
}
}
