package com.matrixerrorseb.fkal.main;

import java.util.Scanner;

public class Main {
	// definitions
	
	public static Scanner sc = new Scanner(System.in);
	public static double number_a = 0;
	public static double number_b = 0;
	public static String operator = "";
	public static double result = 0;
	public static double modulo = 0;
	public static boolean moduloShow;
	public static com.matrixerrorseb.fkal.data0.Operators ops;
	public static boolean found;
	
	// main loop
	
	public static void main(String[] args) {
		
		System.out.print(com.matrixerrorseb.fkal.data0.Text.welcome); // title text
		
		System.out.print("Enter first number. ... a = ");
		number_a = sc.nextLong();
		
		System.out.print("Enter operator ... ");
		operator = sc.next();
		
		System.out.print("Enter first number. ... b = ");
		number_b = sc.nextLong();
		
		// determine operator and preform the calculation
		moduloShow = false;
		
		for (String i : ops.plus) {
			found = false;
			if (found = false) {
				if (operator == i) {
					found = true;
					operator = "+";
					result = number_a + number_b;
				}
			}
		}
		for (String i : ops.minus) {
			found = false;
			if (found = false) {
				if (operator == i) {
					found = true;
					operator = "-";
					result = number_a - number_b;
				}
			}
		}
		for (String i : ops.multiply) {
			found = false;
			if (found = false) {
				if (operator == i) {
					found = true;
					operator = "*";
					result = number_a * number_b;
				}
			}
		}
		for (String i : ops.divide) {
			found = false;
			if (found = false) {
				if (operator == i) {
					found = true;
					operator = "/";
					result = number_a / number_b;
				}
			}
		}
		for (String i : ops.moduloDivide) {
			found = false;
			if (found = false) {
				if (operator == i) {
					found = true;
					result = number_a / number_b;
					modulo = number_a % number_b;
					moduloShow = true;
				}
			}
		}
		
		if (moduloShow == false) {
			System.out.printf(
					"\n%f %s %f = %f",
					number_a, operator, number_b, result
					
			);
		}
		
	}

}