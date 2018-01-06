public class MinDemo3 {

	public static int minimum(int i, int j) {
		int min = i;
		if( min > j) {
			min = j;
		}
		return min;
	}

	public static int minimumOfArray(int[] numbers) {
               int min = numbers[0];
                
                for(int i = 1; i < numbers.length; i++) {
                        min = minimum(min, numbers[i]);
                }
		return min;	
	}
	
	public static void main(String[] args) {
		int[] numbers = {4, 5, 7, 6};

		int min = minimumOfArray(numbers);

		System.out.println("Minimum number in the array is: " + min);
	}
}
