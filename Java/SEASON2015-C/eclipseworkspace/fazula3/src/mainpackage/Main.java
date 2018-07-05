package mainpackage;

import java.io.IOException;
import java.util.Scanner;

import tools.SVALCat;
import tools.SebFileManipulator;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		String das = SebFileManipulator.readBFR("das");
		long a = Long.parseLong(SVALCat.getValue(das, "a"));
		long b = Long.parseLong(SVALCat.getValue(das, "b"));
		String operator = SVALCat.getValue(das, "op");
		
		long out;
		switch (operator) {
		case "+":
			out = a + b;
			break;
		case "-":
			out = a - b;
			break;
		case "*":
			out = a * b;
			break;
		case "/":
			out = a / b;
			break;
		default :
			out = -1;
			break;
		}
		
		System.out.println(out);
		
	}

}
