package Assignment_4;

public class TestFish {

	public static void main(String[] args) {
		
		
		Fish f1 = new Shark();
//		I live in water always
//		I like to bite		
		f1.greeting();
//		I like to hunt
		// f1.length(); - not accessed as length method is specific to only shark class
		// f1.colour(); - not accessed as colour method is specific to only shark class
		System.out.println("-----------------------");
		System.out.println("-----------------------");		
		Shark f2 = new Shark();
//		I live in water always
//		I like to bite	
		System.out.println("-----------------------");		
		f2.greeting();
		f2.length();
		f2.colour();
//		I like to hunt
//		My average length is 3.3 meters
//		I am having slate or blue in colour	
		System.out.println("-----------------------");
		System.out.println("-----------------------");		
		Fish f3 = new GoldFish();
//		I live in water always
//		I can become easily your pet
		f3.greeting();
		System.out.println("-----------------------");		
		GoldFish f4 = new GoldFish();
		f4.greeting();
		f4.length();
		f4.colour();

	}

}
