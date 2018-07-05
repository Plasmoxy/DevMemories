// (c) Sebastian Petrik
package tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
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
	
	// read String from file file using FileInputStream
	public static String readFIN(String filename) throws IOException {
		FileInputStream fin = new FileInputStream(filename);
		StringBuilder stringBuilder = new StringBuilder();
		int data = 0;
		
		while ( (data = fin.read()) != -1) {
			stringBuilder.append(Character.toChars(data));
		}
		fin.close();
		
		return stringBuilder.toString();
	}
	
	//write String to file using PrintWriter
	//this is best for writing ...
	public static void writePW(String filename, String data) throws IOException {
		PrintWriter writer = new PrintWriter(filename, "UTF-8");
		writer.print(data);
		writer.close();
	}
	
	//write String to file using FileOutputStream
	public static void writeFOUT(String filename, String data) throws IOException {
		FileOutputStream fout = new FileOutputStream(filename);
		char[] datach = data.toCharArray();
		for (char character : datach) {
			fout.write(character);
		}
		fout.close();
	}
	
	// appends String to the end of the file by using FIN and FOUT
	public static void addFINFOUT(String filename, String data) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append(readFIN(filename));
		sb.append(data);
		writeFOUT(filename, sb.toString());
	}
	
	// appends String to the end of the file by using BFR and PW
	public static void addBFRPW(String filename, String data) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append(readBFR(filename));
		sb.append(data);
		writePW(filename, sb.toString());
	}

}