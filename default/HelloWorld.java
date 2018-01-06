public class HelloWorld {
	// main is the method, that is used to run the program
	// (String[] args) is called the method signature
	// main is the method name
	// void is the main method's return type
	// String[] args is the method parameters/arguments/params 
	public static void main(String[] args) {

		// greeting is a variable
		// and its scope is within main method
		// and is not available outside main method
		String greeting = "Hello World!";

		// Very important keyword: scope
		// Empty block
		{
		}

		// Block scoped variable
		{
			// the block is also within the main method 
			// the variable greeting is also visible within blocks
			// in the main method
			System.out.println(greeting);

			String newGreeting = "Hello to blocks";
			System.out.println(newGreeting);
		}

		System.out.println(greeting);

		{
			String newGreeting = "Hello to second block";
			System.out.println(newGreeting);
		}

		// Arrays
		// A variable which can hold multiple values, example student names in a class
		// In java Arrays are zero based
		String[] studentNames = {"Deepthi", "Leela"};
		//                          0          1
		System.out.println(studentNames[0]);
		System.out.println(studentNames[1]);

	}
}
