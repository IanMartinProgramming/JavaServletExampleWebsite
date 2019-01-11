package helperClasses;

public class RandomUtilities {

	public static int randomInt(int range) {
		return (1 + ((int)(Math.random() * range)));
	}
	
	public static void main(String[] args) {
		int range = 10;
		
		// try-catch block is so that the range can be changed from outside the class.
//		try {
//			range = Integer.parseInt(args[0]);
//		} catch(Exception e) {}
		
		for(int i = 0; i < 100; i++) {
			System.out.println(randomInt(range));
		}
	}

}
