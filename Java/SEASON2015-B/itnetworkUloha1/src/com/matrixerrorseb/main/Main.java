package com.matrixerrorseb.main;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	public static double r = 0F, pi = 3.14F, o = 0F, S = 0F;
	
	public static void main(String[] args) {
		
		System.out.print("r(cm): ");r = Float.parseFloat(sc.next());System.out.print("\n");
		
		S = pi*Math.pow(r, 2);
		o = 2*pi*r;
		
		System.out.printf("S: %fcm^2\no: %fcm\n", S, o);
		
	}

}
