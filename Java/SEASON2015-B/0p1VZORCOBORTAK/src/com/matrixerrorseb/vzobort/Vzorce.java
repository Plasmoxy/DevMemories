package com.matrixerrorseb.vzobort;

import java.util.Scanner;

public class Vzorce {
	
	public static double pi = 3.14;
	public static Scanner sc = new Scanner(System.in);
	public static double a, b, c, d, v_a, v, r = 0;
	
	public static void stvorec(String volba){
		switch (volba){
		case "S":
			a = 0;
			System.out.print("S = a^2\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.printf("S = %f^2\n", a);
			System.out.printf("S = %f\n", Math.pow(a, 2));
			break;
		case "o":
			a = 0;
			System.out.print("o = 4a\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.printf("o = 4 * %f\n", a);
			System.out.printf("o = %f\n", 4*a);
			break;
		default:
			System.out.print("[Chyba] NESPRAVNA VOLBA\n");
		}
	}
	
	public static void obdlznik(String volba){
		switch (volba){
		case "S":
			a = 0;
			b = 0;
			System.out.print("S = a * b\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.print("b = ");
			b = sc.nextDouble();
			System.out.printf("S = %f * %f\n", a, b);
			System.out.printf("S = %f\n", a*b);
			break;
		case "o":
			a = 0;
			b = 0;
			System.out.print("o = 2 ( a + b )\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.print("b = ");
			b = sc.nextDouble();
			System.out.printf("o = 2 ( %f + %f )\n", a, b);
			System.out.printf("o = %f", 2*(a + b));
			break;
		default:
			System.out.print("\n[Chyba] NESPRAVNA VOLBA\n");
		}
	}
	
	public static void rovnobeznik(String volba){
		switch (volba){
		case "S":
			a = 0;
			v_a = 0;
			System.out.print("S = a * v{a}\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.print("v{a} = ");
			v_a = sc.nextDouble();
			System.out.printf("S = %f * %f\n", a, v_a);
			System.out.printf("S = %f\n", a*v_a);
			break;
		case "o":
			a = 0;
			b = 0;
			System.out.print("o = 2 ( a + b )\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.print("b = ");
			b = sc.nextDouble();
			System.out.printf("o = 2 ( %f + %f )\n", a, b);
			System.out.printf("o = %f", 2*(a + b));
			break;
		default:
			System.out.print("\n[Chyba] NESPRAVNA VOLBA\n");
		}
	}
	
	public static void kosostvorec(String volba){
		switch (volba){
		case "S":
			a = 0;
			v_a = 0;
			System.out.print("S = a * v{a}\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.print("v{a} = ");
			v_a = sc.nextDouble();
			System.out.printf("S = %f * %f\n", a, v_a);
			System.out.printf("S = %f\n", a*v_a);
			break;
		case "o":
			a = 0;
			System.out.print("o = 4a\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.printf("o = 4 * %f\n", a);
			System.out.printf("o = %f\n", 4*a);
			break;
		default:
			System.out.print("\n[Chyba] NESPRAVNA VOLBA\n");
		}
	}
	
	public static void kosodlznik(String volba){
		System.out.println("! kosodlznik => rovnobeznik !");
	}
	
	public static void trojuholnik(String volba){
		switch (volba){
		case "S":
			a = 0;
			v_a = 0;
			System.out.print("S = ( a * v{a} ) / 2\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.print("v{a} = ");
			v_a = sc.nextDouble();
			System.out.printf("S = %f * %f\n", a, v_a);
			System.out.printf("S = %f\n", a*v_a);
			break;
		case "o":
			a = 0;
			b = 0;
			c = 0;
			System.out.print("o = a + b + c\n");
			System.out.print("a = ");
			a = sc.nextDouble();
			System.out.print("b = ");
			b = sc.nextDouble();
			System.out.print("c = ");
			b = sc.nextDouble();
			System.out.printf("o = %f + %f + %f\n", a, b, c);
			System.out.printf("o = %f", a+b+c);
			break;
		default:
			System.out.print("\n[Chyba] NESPRAVNA VOLBA\n");
		}
	}
	

}
