package com.matrixerrorseb.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static String bujon = null;

	public static void main(String[] args) {
		
		try {
			bujon = new Scanner(new File("src/data/bujon.txt")).useDelimiter("\\Z").next();
		} catch(FileNotFoundException e) {e.printStackTrace();}
		
		System.out.println(bujon);
		
	}

}
