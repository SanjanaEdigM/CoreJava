
import java.util.*;
class HospitalTester{

 public static void main(String a[]){
	 System.out.println("enter the size of an array");
	 Scanner sc=new Scanner(System.in);
	 int size=sc.nextInt();
  Hospital hospital=new Hospital(size);
  
  for(int i=0;i<size;i++){
	  PatientDto dto1=new PatientDto();
	System.out.println("enter patient id");
		int patientId=sc.nextInt();
	  
	System.out.println("enter patient name");
		String patientName=sc.next();
	  
	System.out.println("enter patient contact no");
	  long contactNo=sc.nextLong();
	  
	System.out.println("Enter address");
	  String address=sc.next();
	   
	System.out.println("enter blood group");
	  String bloodGroup=sc.next();
	   
	System.out.println("enter the age");
	  int age=sc.nextInt();
	   
	System.out.println("enter the gender");
	  char gender=sc.next().charAt(0);
  
  dto1.setPatientId(patientId);
  dto1.setPatientName(patientName);
  dto1.setContactNo(contactNo);
  dto1.setAddress(address);
  dto1.setBloodGroup(bloodGroup);
  dto1.setAge(age);
  dto1.setGender(gender);
  
  boolean isAdded1=  hospital.createPatient(dto1);
  System.out.println(isAdded1);
  }
  
  hospital.getPatientByName("Sanjana");
  hospital.getPatientById(45);
  hospital.getPatientByAddress("jp nagar");
  hospital.getPatientByContactNo(5678823454l);
  hospital.getPatientByGender('F');
  hospital.getPatientByAge(21);
  hospital.getPatientByBloodGroup("O+");
  
  hospital.getAllDetails();
  
  
  
 }
 
 


}

