public class IntFailure {

	public static void main(String[] args) {
		// We want to sum, numbers starting from 0, upto n

		// 0, 1, 2, 3, ...... n

		int n = 1000000000;

		long sum = 0;

		for(int i = 0; i <= n; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
	}
}
