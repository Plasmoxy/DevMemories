package mainPackage;

import java.util.*;
import java.io.IOException;

public class Main {
	
	public static String input = "";
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static long num_a = 0;
	public static long num_b = 0;
	public static String vysledok = "";

	public static void main(String[] args) {
		
		System.out.println("Kalkula�ka\n--------------");
		System.out.print("\n\nNap�te prv� ��slo: ");
		try {
		input = scanner.next();
		} catch(IOException error) { System.out.println("Zl� vstup !!!");}
		num_a = Long.parseLong(input);
		System.out.print("\nNap�te druh� ��slo: ");
		input = scanner.next();
		num_b = Long.parseLong(input);
		
		vysledok = (
			Long.toString(num_a)
			+" + "
			+Long.toString(num_b)
			+" = "
			+Long.toString(num_a + num_b)
		);
		
		System.out.println(vysledok);

	}

}
