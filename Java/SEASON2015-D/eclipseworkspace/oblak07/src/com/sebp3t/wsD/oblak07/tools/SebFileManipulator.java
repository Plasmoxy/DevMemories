// (c) Sebastian Petrik
package com.sebp3t.wsD.oblak07.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SebFileManipulator {
	
	// read String from file using BufferedReader
	// this is best for reading ...
	public static String readBFR(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		StringBuilder stringBuilder = new StringBuilder();
		int data = 0;
		
		while ( (data = reader.read()) != -1) {
			stringBuilder.append(Character.toChars(data));
		}
		
		reader.close();
		
		return stringBuilder.toString();
	}
	
	// write String to file using BuferedWriter
	// best for writing
	public static void writeBFR(String filename, String data) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		writer.write(data);
		writer.flush();
		writer.close();
	}
	
	public static void addBFR(String filename, String data) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
		writer.write(data);
		writer.flush();
		writer.close();
	}
	
	//write String to file using PrintWriter
	//another writer
	public static void writePW(String filename, String data) throws IOException {
		PrintWriter writer = new PrintWriter(filename, "UTF-8");
		writer.print(data);
		writer.close();
	}

}