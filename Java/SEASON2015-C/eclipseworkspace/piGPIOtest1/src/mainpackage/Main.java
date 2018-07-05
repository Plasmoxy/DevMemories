package mainpackage;
import java.io.IOException;
import java.util.Scanner;

import tools.JpiGPIO;
import tools.SebFileManipulator;

public class Main {
	
	private static int out = JpiGPIO.out;
	private static int in = JpiGPIO.in;
	
	private static int button = 23;
	private static int led = 18;
	
	public static Thread programInterruptListener = new Thread(){
		public void run() {
			Scanner sc = new Scanner(System.in);
			while (sc.next() == "q") {
				try {
					SebFileManipulator.writePW("src/mainpackage/interrupt.bin", "1");
					/*JpiGPIO.write(led, 0);
					JpiGPIO.unexport(led);
					JpiGPIO.unexport(button);*/
					System.out.println("exit");
					System.exit(-1);
				} catch(IOException e) {e.printStackTrace();}
				
			}
		}
	};
	
	public static void main(String[] args) throws IOException, InterruptedException {
		programInterruptListener.start();
		/*
		JpiGPIO.export(led);
		JpiGPIO.export(button);
		
		JpiGPIO.mode(button, in);
		JpiGPIO.mode(led, out);
		
		while (true) {
			JpiGPIO.write(led, 1);
			while (JpiGPIO.read(button) == 1) {
				JpiGPIO.write(led, 0);
			}
		}
		*/
		
		while (true) {}
		
	}

}
