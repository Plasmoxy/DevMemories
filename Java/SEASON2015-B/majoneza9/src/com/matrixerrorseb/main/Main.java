package com.matrixerrorseb.main;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in, "Windows-1250");
	private static Losovac losovac = new Losovac();
	private static String volba = "0";
	
	public static void main(String[] args) {
		
		System.out.print(
				  "VITAJCE !\n"
				+ "VOLBY:\n"
				+ "1 - Losovat dalsie cislo\n"
				+ "2 - Vypisat cisla\n"
				+ "3 - Koniec\n"
		);
		
		while (!(volba.equals("3"))) {
			
			System.out.print("VOLBA : ");
			volba = sc.nextLine();
			switch (volba){
			case "1":
				System.out.printf("Padlo cislo : %s\n", losovac.losuj());
				break;
			case "2":
				System.out.printf("Padli cisla: %s\n", losovac.vypis());
				break;
			case "3":
				System.out.print("Dakujem za pouzitie programu\n");
				break;
			default:
				System.out.print("Neplatna volba, zadajte znovu\n");
			}
			
		}
		
		
		
	}

}
