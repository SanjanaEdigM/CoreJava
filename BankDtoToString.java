class BankDtoToString{
     
	 int id;
	 String name;
	 String ifsc;
	 
	 public void details(){
	  System.out.println(getId()+" "+getName()+" "+getIfsc());
	 }
	 
	 public int getId(){
	  return id;
	 }
	 public void setId(int id){
	  this.id=id;
	 }
	 
	 public String getName(){
	  return name;
	 }
	 public void setName(String name){
	  this.name=name;
	 }
	 
	 public String getIfsc(){
	  return ifsc;
	 }
	 public void setIfsc(String ifsc){
	  this.ifsc=ifsc;
	 }
	 
	 @Override
	 public String toString(){
	  return "BankDtoToString -[id="+ this.id +",name="+ this.name+",ifsc="+ this.ifsc+"]";
	 }

}