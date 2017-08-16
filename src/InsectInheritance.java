/*
 * Brendan Howell
 * CSC-151
 * 
 * Example of inheritance with Insect superclass
 * and bumblebee and grasshopper subclass
 * 
 */
public class InsectInheritance {

	public static void main(String[] args) {
		// create instance of bumblebee
		bumblebee b = new bumblebee();
		b.setInsectData(6, 3);
		b.setTimesSting(1);
		b.preferredFlower();
		// display data
		System.out.printf("Bee has %d legs and %d parts and can "
				+ "sting %d times.", b._legs, b._bodyParts, b._timesSting);
		
		// create instance of grasshopper
		grasshopper g = new grasshopper();
		g.setInsectData(6, 3);
		g.setJumpsPerMinute(10);
		
	}  //  end main

}  //  end class


class insect{
	// instance vars
	int _legs;
	int _bodyParts;
	
	public void setInsectData(int legs, int bodyParts){
		_legs = legs;
		_bodyParts = bodyParts;
	}  // end setInsectData
}  // end superclass insect


class bumblebee extends insect{
	public int _timesSting;
	
	public void setTimesSting(int timesSting){
		_timesSting = timesSting;
	}
	
	public void preferredFlower(){
		System.out.println("Rose");
	}
}  // end subclass bumblebee

class grasshopper extends insect{
	public int _jumpsPerMinute;
	
	public void setJumpsPerMinute(int jumpsPerMinute){
		_jumpsPerMinute = jumpsPerMinute;
	}
}  // end subclass grasshopper