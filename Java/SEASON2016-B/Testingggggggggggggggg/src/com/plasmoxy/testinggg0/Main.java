package com.plasmoxy.testinggg0;

public class Main {
	
	public static void print(Object x) {
		System.out.println(x.toString());
	}
	
	public static long getBigger(long a, long b) {
		return a > b ? a : b;
	}
	
	public static void main(String[] args) {
		
		print(  getBigger(2, 243)  );
		
	}

}
