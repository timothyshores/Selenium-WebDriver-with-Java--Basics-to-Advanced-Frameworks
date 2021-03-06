package JavaIntro;

public class JavaConditionals {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println("Multiply each number in the nums array and return each element multiplied by 2");
		System.out.println("E.g. {1, 2, 3, 4} -> {2, 4, 6, 8}");
		
		for (int num: nums) {
			System.out.println(num * 2);
		}
		
		System.out.println("\nPrint all odd nums in the nums array. E.g {1, 2, 3} -> {1, 3}");
		
		for (int num: nums) {
			if (num % 2 == 1) {
				System.out.println(num);
			}
		}
		
		System.out.println("\nPrint whether a number is even or odd in the nums array");
		System.out.println("E.g {1, 2, 3} -> 1 is odd, 2 is  even, 3 is odd, etc.");
		
		for (int num: nums) {
			if (num % 2 == 1) {
				System.out.println(num + " is odd");
			}
			else {
				System.out.println(num + " is even");
			}
		}
		
		System.out.println("\nPrint the first even number that is divisable by 2 and 4");
		System.out.println("E.g {1, 2, 3, 4, 5, 6, 7, 8} -> 4");
		
		for (int num: nums) {
			if (num % 2 == 0 && num % 4 == 0) {
				System.out.println(num + " is divisible by both 2 and 4");
				break;
			}
		}
	}

}
