public class Average {

	public static void main(String[] args) {
		int[] numbers = {3, 4, 5, 6};

		// Average = sum of array of numbers / count of numbers

		int count = numbers.length;

		int sum = Sum3.sumOfArray(numbers);
		float average = sum / count;
	
		System.out.println(average);

		average = 1.0f * sum / count;
		System.out.println(average);

		double dAverage = 1.0 * sum / count;
		
		System.out.println(average);
	}
}
