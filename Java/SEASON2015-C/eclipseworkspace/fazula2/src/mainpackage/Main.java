package mainpackage;

import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		try {
			StringBuilder s = new StringBuilder();
			FileOutputStream fin = new FileOutputStream("a");
			FileInputStream fout = new FileInputStream("a");
			
			int data;
			while (  (data = fin.) != -1    ) {
				System.out.println(data);
			}
			
			fout.close();
			fin.close();
		} catch(IOException e) {e.printStackTrace();}
	}
	
}
