public class MinDemo {

	public static void main(String[] args) {
		int[] numbers = {4, 5, 7, 6};

		// No human eye balling

		// Computer can determine min of two numbers easily
		// minimum of a and b
		// min = a if(a > b) else min = b

		// start with min = 0

		int min = numbers[0];

		if(min > numbers[1]) {
			min = numbers[1];
		}

		if(min > numbers[2]) {
			min = numbers[2];
		}

		if(min > numbers[3]) {
			min = numbers[3];
		}

		System.out.println("Minimum number in the array is: " + min);
	}
}
