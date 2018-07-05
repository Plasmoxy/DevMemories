/*
 * (c) Sebohacker 2014
 * 
 * Vypisovac viet ...
 * 
 * Enjoy !
 */



import java.util.Scanner;


public class Main {

	
	public static int pismena = 0;
	public static int medzery = 0;
	public static int znaky = 0;
	public static String medzery_SVK_casovanie = "";
	public static String pismena_SVK_casovanie = "";
	public static String znaky_SVK_casovanie = "";
	public static String a;
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("\nAhoj!\n\nNapíš niejakú vetu a ja ti poviem je pocet pismen: ");
		a = scanner.nextLine();
		
		for(char i : a.toCharArray()) {
			if (i != ' ') {
				pismena += 1;
			} else {
				medzery += 1;
			}
			
		}
		
		znaky = pismena + medzery;
		
		if (medzery == 1) {
			medzery_SVK_casovanie = "medzeru";
		} else if (medzery == 2 || medzery == 3 || medzery == 4) {
			medzery_SVK_casovanie = "medzery";
		} else {
			medzery_SVK_casovanie = "medzier";
		}
		
		if (pismena == 1) {
			pismena_SVK_casovanie = "pismeno";
		} else if (pismena == 2 || pismena == 3 || pismena == 4) {
			pismena_SVK_casovanie = "pismena";
		} else {
			pismena_SVK_casovanie = "pismen";
		}
		
		if (znaky == 1) {
			znaky_SVK_casovanie = "znak";
		} else if (znaky == 2 || znaky == 3 || znaky == 4) {
			znaky_SVK_casovanie = "znaky";
		} else {
			znaky_SVK_casovanie = "znakov";
		}
		
		System.out.printf("\n\n\nVasa veta ma %d %s a %d %s dokopy %d %s.", pismena, pismena_SVK_casovanie, medzery, medzery_SVK_casovanie, znaky, znaky_SVK_casovanie);
		
		
		//make space for linux or windows terminal (@sebohacker$ and that $#!T)
		
		System.out.print("\n\n\n");
	}

}
