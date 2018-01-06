public class MinDemo1 {

	public static int minimum(int i, int j) {
		int min = i;
		if( min > j) {
			min = j;
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] numbers = {4, 5, 7, 6};

		// No human eye balling

		// Computer can determine min of two numbers easily
		// minimum of a and b
		// min = a if(a > b) else min = b

		// start with min = numbers[0]

		int min = numbers[0];

		min = minimum(min, numbers[1]);

		min = minimum(min, numbers[2]);

		min = minimum(min, numbers[3]);

		System.out.println("Minimum number in the array is: " + min);
	}
}
