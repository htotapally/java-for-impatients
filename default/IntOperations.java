public class IntOperations {
	public static void main(String[] args) {
		System.out.println("Demonstration of operations on int");
		// variable declarations
		// Uninitialized variable
		// Can not be used until the variable is assigned a value
		// or initializzed
		// int is datatype
		// numberOfPens is variable name
		// ; represents the end of the line
		int numberOfPens;

		// Initialized variable
		// numberOfPencils is assigned a value of 10
		int numberOfPencils = 10;

		// All variables have to be initialized before they can be used
		// another variable is declared
		int numberOfInstruments; // Sum of pens, and pencils
		// The following statement would not work as numberOfPens is notinitialzed yet
		// numberOfInstruments = numberOfPens + numberOfPencils;
	
		// assign a value of 5 to numberOfPens
		numberOfPens = 5;

		// Since the variables are initialized and have assigned values
		// the two ints can be added
		// Added but the sum is not assigned to any variable
		// and is not a valid statement
		// numberOfPens + numberOfPencils;

		// the sum is assigned to the variable numberOfInstruments
		numberOfInstruments = numberOfPens + numberOfPencils;

		System.out.println(numberOfInstruments);

		// Subtraction
		// variable declaration
		// assignment using a statement
		int morePencils = numberOfPencils - numberOfPens;
		System.out.println(morePencils);

		int lessPens = numberOfPens - numberOfPencils;
		System.out.println(lessPens);

		// Multiplication
		int product = numberOfPens * numberOfPencils;
		System.out.println(product);

		// Division
		int factor = numberOfPencils / numberOfPens;
		System.out.println(factor);

		// Modulo operation symbol = %
		int x = 19;
		int y = 3;
		int moduloResult = 19 % 3;
		System.out.println(moduloResult);
		

	}
		
}
