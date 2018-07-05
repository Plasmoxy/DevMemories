import java.util.Scanner;

public class mainclass {
	
	public static Scanner scanner = new Scanner(System.in);
	public static long number_a = 0;
	public static long number_b = 0;
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Simple Calculator\n-----------------\n");
		System.out.print("\nEnter number a: ");
		number_a = Integer.parseInt(scanner.next());
		System.out.print("\nEnter number b: ");
		number_b = Integer.parseInt(scanner.next());
		System.out.println("\n\n" + number_a + " + " + number_b + " = " + (number_a + number_b) );
		
	}
}
