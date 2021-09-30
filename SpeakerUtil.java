class SpeakerUtil{
     public static void main(String[] a){
	    String Name=Speaker.name;
		System.out.println("the speaker name is " +Name);
	    boolean isConnected=Speaker.onOrOff();
		
		
		System.out.println("the speaker is connected " +isConnected);
		
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		
		
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		
		
		boolean Connected=Speaker.onOrOff();
		System.out.println("the speaker is not connected " +Connected);
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		
	 }

}