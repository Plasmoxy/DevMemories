import java.io.IOException;
import java.util.*;
import sh.*;
public class mainclass {

	/**
	 * @param args
	 */
	public static long number_a = 0;
	public static long number_b = 0;
	public static String operator = "";
	public static long result = 0;
	
	
	public static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		
		while (true) {
		System.out.print("Calculator (sebohacker)\n\n");
		System.out.print("\nEnter first number : ");
		number_a = scanner.nextLong();
		System.out.print("\nEnter second number : ");
		number_b = scanner.nextLong();
		System.out.print("\n\nEnter operator : ");
		operator = scanner.next();
		
		System.out.print("\n\n\n");
		
		if ("+".equals(operator)) {
			result = number_a + number_b;
			operator = "+";
		} else if ("-".equals(operator)) {
			result = number_a - number_b;
			operator = "-";
		} else if ("*".equals(operator)) {
			result = number_a * number_b;
			operator = "*";
		} else if ("/".equals(operator)) {
			result = number_a / number_b;
			operator = "/";
		}
		//end if
		
		System.out.println(number_a+" "+operator+" "+number_b+" = "+result);
		
		System.out.println("\n\n\nPress Enter to restart...");
		scanner.nextLine();
		
		console.clear();
		} // end infinity while loop

	}

}
