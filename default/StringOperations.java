public class StringOperations {
	public static void main(String[] args) {
		// Datatype String
		// Declare variables for firstName, and lastName
		String firstName;
		String lastName;
		String fullName;

		// Assign values to variables
		firstName = "Deepthi";
		lastName = "Varanasi";

		fullName = firstName + lastName;
		System.out.println(fullName);

		firstName = "Leela";
		lastName = "Totapally";
		fullName = firstName + lastName;
		System.out.println(fullName);

		// While printing full name comma is missing
		// For better readability we can add comma between
		// firstName and last Name
		// i.e. add firstName, comma, and lastName
		// define a variable for comma
		String comma = ",";

		fullName = firstName + comma + lastName;
		System.out.println(fullName);

		// or without declaring a name for comma, comma can directly 
		// be used
		fullName = firstName + "," + lastName;
		System.out.println(fullName);
	
	}
}
