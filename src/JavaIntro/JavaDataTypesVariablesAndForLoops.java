package JavaIntro;

import java.util.ArrayList;

public class JavaDataTypesVariablesAndForLoops {

	public static void main(String[] args) {
		int num = 5;
		char letter = 'T';
		double price = 9.99;
		boolean userIsActive = true;
		
		System.out.println("num: " + num); 							// returns "num: 5"
		System.out.println("letter: " + letter); 					// returns "letter: T"
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
		
		char[] letters = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < letters.length; i++) {
			System.out.println("letters[" + i + "]: " + letters[i]);
		}
		
		String[] names = {"Tim", "Alice", "Bob", "Candice"};
		
		for (String name: names) {
			System.out.println(name);
		}
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Tim");
		al.add("Alice");
		al.add("Bob");
		al.add("Candice");
		
		System.out.println(al); 			// returns [Tim, Alice, Bob, Candice]
		
		al.remove(3);
		al.remove(2);
		
		System.out.println(al); 			// returns [Tim, Alice]
		System.out.println(al.get(0));		// returns Tim
	}
}
