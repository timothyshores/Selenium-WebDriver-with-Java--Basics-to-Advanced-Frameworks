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

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
			
		int[] shortCutArr = {1,2,3};
		
		for (int i = 0; i < shortCutArr.length; i++) {
			System.out.println("shortCutArr[" + i + "]: " + shortCutArr[i]);
		}
	}
}
