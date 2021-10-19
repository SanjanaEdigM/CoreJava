class PharmacyDtoToString{
    
		 int id;
		 String name;
		 String address;
		
		public void details(){
			System.out.println(getId()+" "+getName()+" "+getAddress());
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
		
		public String getAddress(){
			return address;
		}
		public void setAddress(String address){
			this.address=address;
		}
		
		@Override
		public String toString(){
			return "PharmacyDtoToString-[id="+this.id+",name="+this.name+",address="+address+"]";
		}
 }
