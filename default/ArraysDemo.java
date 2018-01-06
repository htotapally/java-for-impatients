public class ArraysDemo {
	public static void main(String[] args) {
		System.out.println(args);
		// System.out.println(args.length);

		int nArguments = args.length;
		System.out.println(nArguments);

		for(int i = 0; i < nArguments; i++) {
			System.out.println("Hello " + args[i]);
		}
	}
}
