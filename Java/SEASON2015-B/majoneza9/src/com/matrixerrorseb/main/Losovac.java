package com.matrixerrorseb.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Losovac {
	
	private ArrayList<Integer> cisla;
	private Random random;
	
	public Losovac(){
		random = new Random();
		cisla = new ArrayList<Integer>();
	}
	
	public int losuj(){
		Integer cislo = random.nextInt(100) + 1;
		cisla.add(cislo);
		return cislo;
	}
	
	public String vypis(){
		String s = "";
		Collections.sort(cisla);
		for (int i : cisla) s += i + " ";
		return s;
	}

}
