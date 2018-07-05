package fibbonaci;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Fibbonaci {
	
	private static Scanner sc;
	private static BigDecimal a;
	private static BigDecimal b;
	
	private static BigDecimal blast;
	
	private static int phiDecimalPlaces;
	private static String phiDecimalPlaces_str;
	
	public static void main(String[] args) {
		
		System.out.println("- FIBBONACI NUMBER SEQUENCE AND GOLDEN RATIO FROM-THAT-APPROXIMATOR xD -");
		System.out.println("By Sebastián Petrík");
		
		while(true) {
			
		System.out.println("----------------------------------");
		
		sc = new Scanner(System.in);
		
		
		
		
		System.out.print("(n) -> "); 
		a = new BigDecimal(sc.next());
		
		System.out.print("(n+1) -> ");
		b = new BigDecimal(sc.next());
		
		System.out.print("HOW MUCH NUMBERS ? -> ");
		long ammount = sc.nextLong();
		
		
		
		System.out.println(a);
		System.out.println(b);
		for (long i = 0; i < ammount-2; i++) {
			blast = b;
			b = a.add(b);
			a = blast;
			System.out.println(b);
		}
		
		
		System.out.print("GOLDEN RATIO FROM LAST CALCULATION, HOW MANY DECIMAL PLACES ?(press enter for 20) = ");
		
		
		
		sc.nextLine(); // get rid of empty newline from prompt
		phiDecimalPlaces_str = sc.nextLine();
		
		
		if (phiDecimalPlaces_str.equals("")) {
			phiDecimalPlaces = 20;
		} else {
			phiDecimalPlaces = Integer.valueOf(phiDecimalPlaces_str);
		}
		
		for ( int i = 0; i < 10; i++) {System.out.println("||");}
		
		System.out.println(
				
				b.divide(a, phiDecimalPlaces, RoundingMode.HALF_UP)
				
		);
	
		
	}}

}