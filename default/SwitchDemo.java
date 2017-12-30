public class SwitchDemo {

	public static void main(String[] args) {

		/*
		switch (variable) {
  case c1:
        statements // they are executed if variable == c1
        break;
  case c2: 
        statements // they are executed if variable == c2
        break;
  case c3:
  case c4:        
        statements // they are executed if variable ==  any of the above c's
        break;
  . . .
  default:
        statements // they are executed if none of the above case is satisfied
        break;
}
		*/
		int x = 3;
		switch (x) {
			case 1:
				System.out.println("x is 1");
				break;
			case 2:
				System.out.println("x is 2");
				break;
			case 3:
				System.out.println("x is 3");
				break;
			case 4:
				System.out.println("x is 4");
				break;
			default:
				System.out.println("This is default case");
				break;
		}
	}
}
