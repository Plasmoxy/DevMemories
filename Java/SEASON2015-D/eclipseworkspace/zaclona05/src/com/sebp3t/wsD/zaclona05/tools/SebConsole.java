package com.sebp3t.wsD.zaclona05.tools;


// Console thread for java
// by Sebastian Petrik
// Because java doesn't support KeyboardInterrupt, its impossible to catch it.
// this file is open-source do what you want with it :)
// make your own commands !!!
// access exit variable through synchronized(Object monitor) {} block !

import java.util.Scanner;

public class SebConsole extends Thread {
	
	public Object monitor = new Object(); // monitor Object is necessary for Thread communication
	public Scanner sc = new Scanner(System.in); // scanner, which will scan our commands from stdin
	
	public boolean exit = false;
	public boolean consoleInitDone = false;
	
	public String help = "\n"
			+ "[SebConsole] SebConsole by Sebastian Petrik.\n"
			+ "[SebConsole] Commands ...\n"
			+ "... h - display this help\n"
			+ "... q - set exit code to true\n"
			+ "... e - System.exit(0) - force exit all threads\n"
			;
	
	public SebConsole(Object monitor) {
		this.monitor = monitor; // monitor has to be always same for all communicating threads
								// in our case, it will use monitor from constructor
	}
	
	@Override
	public void run() {
		
		System.out.println("[SebConsole] Started on Thread " + this.getName() + " .");
		
		this.consoleInitDone = true;
		
		while (true) { // infinite loop for commands
			
			String command = sc.nextLine(); // read command
			
			switch (command) { // here are command definitions
			case "h":
				System.out.print(help);
				break;
			case "q":
				synchronized (monitor) { // we are gonna read stuff from Main class so we need to synchronize
					System.out.println("[SebConsole] Changing exit code to true.");
					this.exit = true; // if command is "q", then set Main.exit variable to true
				}
				break; // and we break the switch
			case "e":
				System.out.println("[SebConsole] Calling System.exit(0), program will stop.");
				System.exit(0);
			}
			
			synchronized (monitor) {
				if (this.exit) {
					System.out.println("[SebConsole] Thread ending.");
					break; // and we break our infinite loop
				}
			}
			
			// Thread has no commands to do so it finalizes and ends
			
		}
	}

}
