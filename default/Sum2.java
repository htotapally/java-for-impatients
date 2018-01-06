public class Sum2 {

	public static int sumOfTwo(int i, int j) {
		int sum = i;
		sum = i + j;
		return sum;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};

		int sum = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			sum = sumOfTwo(sum, numbers[i]);
		}
		System.out.println("Sum is: " + sum);
	}
}
