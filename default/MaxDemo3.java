public class MaxDemo3 {

	public static int maximum(int i, int j) {
		int max = i;
		if(max < j) {
			max = j;
		}
		return max;
	}

	public static int maximumFromArray(int[] numbers) {
                int max = numbers[0];
                for(int i = 1; i < numbers.length; i++) {
                        max = maximum(max, numbers[i]);
                }
		return max;
	}

	public static void main(String[] args) {
		int[] numbers = {4, 5, 7, 6};

		// No human eye balling

		// Computer can determine max of two numbers easily
		// maximum of a and b
		// max = a if(a > b) else max = b

		// start with max = 0

		int max = maximumFromArray(numbers);


		System.out.println("Maxmimum number in the array is: " + max);
	}
}
