public class BooleanOperations {
	public static void main(String[] args) {
		System.out.println("Boolean Operations Demo");

		// Variable Declaration
		boolean isGreen;
		isGreen = true;

		System.out.println("isGreen: " + isGreen);

		isGreen = false;
		System.out.println("isGreen: " + isGreen);
	
		// Demonstration of if statement
		// if(<boolean expression>) {
		// 	your code statement 1
		//	your code statement 2
		// }

		if(isGreen) {
			System.out.println("This is green");
		}

		// Demonstration of if else statements
		// Syntax
		/*
			if (<boolean expression>) {
				your statements

			} else if(<boolean expression>) {
				your statements

			} else if(<boolean expression>) {
				your statements
`
			} else if(<boolean expression>) {
				your statements

			} else {
				any of the above boolean expressions not matched
			}
			
		*/	

	}
}
