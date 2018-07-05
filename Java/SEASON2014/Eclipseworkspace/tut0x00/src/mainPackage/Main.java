package mainPackage;
import java.util.*;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Napíšte 1. èíslo: ");
		String a_input = scanner.next();
		long a = Integer.parseInt(a_input);
		System.out.print("\n\nNapíšte druhé èíslo: ");
		String b_input = scanner.next();
		long b = Integer.parseInt(b_input);
		
		String priklad = (
				"\n"
				+ Long.toString(a) + " + "
				+ Long.toString(b) + " = "
				+ Long.toString(a + b)
				+ "\n"
		);
		
		System.out.print(priklad);

	}

}
