class DogBarking {
	
	//BICT makes Dog bark randomly! Or not bark.
	
	public static void main (String args[]) {
	//Start
		//Intro
		System.out.println("This is Owner speaking!");
		System.out.println("Lets see if the Dog barks!");
		//Intro ends
		//Body
		double bark = Math.random();
		
		if (bark >= 0.5) {
			System.out.println("Bark-Bark!");
		}
		else {
			System.out.println("Not barking,good boy!");
		}
		//Body end
	//End
	}
}
