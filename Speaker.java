class Speaker{
    static String name="Boat";
	static int minVolume=0;
	static int maxVolume=15;
	static boolean isConnected=false;
	static int currentVolume;
	
	
	
	
	public static boolean onOrOff(){
	  if(isConnected==false){
	     isConnected=true;
		 System.out.println("Speaker is turned on");
	     return isConnected;
	}
	  else if(isConnected==true){
		 isConnected=false;
		 System.out.println("Speaker is turned off");
	     return isConnected;
	}

	return false;
	
	
	}
    public static void increaseVolume(){
		System.out.println("inside increasevolume()");
		    if (isConnected){
				if( currentVolume<maxVolume){
					currentVolume=currentVolume+1;
					System.out.println("The current volume is:" +currentVolume);
				}
                else{
					System.out.println("max Volume reached.........");
				}	
            }				
			else{
				System.out.println("switch on the speaker");
			}  
		
		System.out.println("end increasevolume()");
		
	}
    public static void decreaseVolume(){ 
		System.out.println("inside decreaseVolume()");
		if (isConnected){
			if(currentVolume>=minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The current volume is:" +currentVolume);		
			}
			else{
				
				System.out.println("end of decreasevolume()");
			} 
		}

		else{
			  System.out.println("switch on the speaker");
		}	
		
		
	}
}