package PiGenerator;

import java.math.BigInteger;
import java.util.Scanner;
public class PiGenerator {
	
	private static Scanner sc;
	private static BigInteger no;
	
	public static void main(String[] args) {while(true) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter number of terms (10^x): ");
		no = BigInteger.valueOf(1);
		
		int odd=1;
		double pi = 0.0;
		
		for (BigInteger i = BigInteger.valueOf(0); i.compareTo(no) == -1; i.add(BigInteger.valueOf(1))) {
			
			double currentTerm = 0.0;
			
			if (i.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
				currentTerm = (double)-4/odd;
			} else {
				currentTerm = (double)4/odd;
			}
			
			odd=odd+2;
			pi += currentTerm;
			
			System.out.println("xd");
			
		}
		
		System.out.println(pi);
		
		
	}}

}
