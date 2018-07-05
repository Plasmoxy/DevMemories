package mainpkg;

import java.util.Scanner;

public class Main {
	
	private final static Object monitor = new Object();
	public static boolean exit = false;
	public static boolean commandLineLooping = false;
	
	public static Thread commandLine = new Thread(new Runnable() {
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Running class Main, main() on thread main ; type q to exit ...");
			
			synchronized (monitor) {
				commandLineLooping = true;
			}
			
			//here is the commandLine loop
			while (true) {
				//System.out.print(">");
				String command = sc.nextLine();
				
				switch (command) {
				case "q":
					synchronized (monitor) {
						exit = true;
					}
					break;
				default :
					System.out.println("[ERROR] Unknown command.");
				}
				
				synchronized (monitor) {
					if (exit) {
						break;
					}
				}
				
			}
		}
	});
	
	public static void main(String[] args) throws InterruptedException {
		
		commandLine.start();
		
		while (true) {
			synchronized (monitor) {
				if (commandLineLooping) {
					break;
				}
			}
		}
		
		//here goes main code ...
		
		int a = 0;
		while (true) {
			synchronized (monitor) {
				if (exit) {
					System.out.println("System.exit(0); Bye :)");
					System.exit(0);
				}
			}
			System.out.println(a);
			a++;
			Thread.sleep(1000);
		}
		
	}

}
