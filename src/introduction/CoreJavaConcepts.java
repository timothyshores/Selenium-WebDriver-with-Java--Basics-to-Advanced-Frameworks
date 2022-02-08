package introduction;

public class CoreJavaConcepts {

	public static void main(String[] args) {
		int num = 5;
		char letter = 'T';
		String name = "Tim";
		double price = 9.99;
		boolean userIsActive = true;
		
		System.out.println("num: " + num); 							// returns "num: 5"
		System.out.println("letter: " + letter); 					// returns "letter: T"
		System.out.println("name: " + name);						// returns "name: Tim"
		System.out.println("price: " + price);						// returns "price: 9.99"
		System.out.println("userIsActive: " + userIsActive); 		// returns "userIsActive: true"
		
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;

		System.out.println("arr: " + arr);							// returns "arr: [I@7ad041f3"
		System.out.println("arr[0]: " + arr[0]);					// returns "arr[0]: 1"
		System.out.println("arr[1]: " + arr[1]);					// returns "arr[1]: 2"
		System.out.println("arr[2]: " + arr[2]);					// returns "arr[2]: 3"
		System.out.println("arr[3]: " + arr[3]);					// returns "arr[3]: 4"
			
		int[] shortCutArr = {1,2,3};
		System.out.println("shortCutArr: " + shortCutArr);			// returns "shortCutArr: [I@251a69d7"
		System.out.println("shortCutArr[0]: " + shortCutArr[0]);	// returns "shortCutArr[0]: 1"
		System.out.println("shortCutArr[1]: " + shortCutArr[1]);	// returns "shortCutArr[0]: 2"
		System.out.println("shortCutArr[2]: " + shortCutArr[2]);	// returns "shortCutArr[0]: 3"
	}
}
