public class MaxDemo {

	public static void main(String[] args) {
		int[] numbers = {4, 5, 7, 6};

		// No human eye balling

		// Computer can determine max of two numbers easily
		// maximum of a and b
		// max = a if(a > b) else max = b

		// start with max = 0

		int max = numbers[0];

		if(max < numbers[1]) {
			max = numbers[1];
		}

		if(max < numbers[2]) {
			max = numbers[2];
		}

		if(max < numbers[3]) {
			max = numbers[3];
		}

		System.out.println("Maxmimum number in the array is: " + max);
	}
}
