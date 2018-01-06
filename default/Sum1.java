public class Sum1 {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};

		int sum = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum is: " + sum);
	}
}
