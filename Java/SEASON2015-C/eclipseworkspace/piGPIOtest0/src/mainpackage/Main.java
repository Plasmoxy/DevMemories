package mainpackage;

import java.io.IOException;

import tools.SebFileManipulator;

public class Main {
	public static void main(String[] args) throws IOException {
		
		System.out.println("[flag] start");
		
		System.out.println("Writing direction : out");
		SebFileManipulator.writePW("/sys/class/gpio/gpio18/direction", "out");
		
		System.out.println("[flag] loop1");
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Writing value : 1");
			SebFileManipulator.writePW("/sys/class/gpio/gpio18/value", "1");
			
			System.out.println("Thread.sleep(100)");
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {e.printStackTrace();}
			
			System.out.println("Writing value : 0");
			SebFileManipulator.writePW("/sys/class/gpio/gpio18/value", "0");
			
			System.out.println("Thread.sleep(100)");
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {e.printStackTrace();}
			
		}
		
	}
}
