class DrivingLicenceDTO{

     public DrivingLicenceDTO(){
	  System.out.println("object is created for DrivingLicenseDTO");
	 }
	 
	 private String dlNo;
	 private String dlHolderName;
	 private String address;
	 private int pin;
	 
	 
	 public String getDlNo(){
		 return dlNo;
	 }
	 public void setDlNo(String dlNo){
		 this.dlNo=dlNo;
	 }
	 
	 public String getDlHolderName(){
		 return dlHolderName;
	 }
	 public void setDlHolderName(String dlHolderName){
		 this.dlHolderName=dlHolderName;
	 }


     public String getAddress(){
		 return address;
	 }
	 public void setAddress(String address){
		 this.address=address;
	 }
	 
	 
	 public int getPin(){
		 return pin;
	 }
	 public void setPin(int pin){
		 this.pin=pin;
	 }




}