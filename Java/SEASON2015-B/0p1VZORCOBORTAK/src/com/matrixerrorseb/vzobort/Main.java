package com.matrixerrorseb.vzobort;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	public static String utvar = "";
	public static String volba = "";
	
	public static void main(String[] args){
		
		System.out.print(
			  "VZORCOBORTAK\nby Sebastian Petrik\nin pure Java\n"
			+ "-------------\n"
			+ "! piste utvary s malymi pismenami !\n"
			+ "! napiste utvar \"konec\" pre ukoncenie programu !\n"
			+ "-------------"
		);

		while (true){
			
			System.out.print("\nUTVAR : ");
			utvar = sc.next();
			
			if (!(utvar.equals("konec"))){
				System.out.print("Chcete vypocitat S, o, V alebo vypisat vzorce (S, o, V alebo vz) ? : ");
				volba = sc.next();
			}
			
			switch (utvar){
			case "stvorec":
				Vzorce.stvorec(volba);
				break;
			case "obdlznik":
				Vzorce.obdlznik(volba);
				break;
			case "rovnobeznik":
				Vzorce.rovnobeznik(volba);
				break;
			case "kosostvorec":
				Vzorce.kosostvorec(volba);
				break;
			case "kosodlznik":
				Vzorce.kosodlznik(volba);
				break;
			case "trojuholnik":
				Vzorce.trojuholnik(volba);
				break;
			case "konec":
				System.out.println("Dakujem za pouzitie programu. Dovidenia.");
				System.exit(0);
				break;
			default:
				System.out.println("[Chyba] NESPRAVNY UTVAR");
				break;
			}
			
		}
	}

}
