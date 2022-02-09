package introduction;

public class JavaConditionals {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		
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
	}

}
