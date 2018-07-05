package mainpkg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Main {
	
	public static final Object monitor = new Object();
	
	public static boolean commandThreadLooping = false;
	public static boolean exit = false;
	
	public static Thread commandThread = new Thread(new Runnable() {
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			synchronized (monitor) {
				commandThreadLooping = true;
			}
			while (true) {
				String command = sc.nextLine();
				switch (command) {
				case "q":
					synchronized (monitor) {
						exit = true;
						System.out.println("[info] Caught exit code, exiting ...");
						System.exit(0);
					}
					break;
				default :
					System.out.println("[ERROR] Unknown command.");
					break;
				}
				
				synchronized (monitor) {
					if (exit) {
						break;
					}
				}
				
			}
			
		}
	});
	
	public static Thread serverThread = new Thread(new Runnable() {
		@Override
		public void run() {
			try {
				
				ServerSocket serverSocket = new ServerSocket(6066);
				System.out.println("Server running on port [" + serverSocket.getLocalPort() + "]");
				
				while (true) {
					
					Socket socket = serverSocket.accept();
					DataInputStream in = new DataInputStream(socket.getInputStream());
					System.out.println("[" + socket.getRemoteSocketAddress() + "] " + in.readUTF());
					socket.close();
					
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	});
	
	public static Thread clientThread = new Thread(new Runnable() {
		@Override
		public void run() {
			
			String serverName = "localhost";
		    int port = 6066;//Integer.parseInt(args[1]);
		    try {
		    	System.out.println("Connecting to " + serverName
		                           + " on port " + port);
		        Socket client = new Socket(serverName, port);
		        System.out.println("Connected.");
		        
		        OutputStream outToServer = client.getOutputStream();
		        DataOutputStream out = new DataOutputStream(outToServer);
		        
		        System.out.println("Writing UTF.");
		        out.writeUTF("cs");
		        
		        client.close();
		    } catch(IOException e) {
		       e.printStackTrace();
		    }
			
		}
	});
	
	public static void main(String[] args) throws InterruptedException {
		
		commandThread.start();
		
		while (true) {
			synchronized (monitor) {
				if (commandThreadLooping) {
					break;
				}
			}
		}
		
		serverThread.start();
		
		Thread.sleep(5000);
		
		clientThread.start();
	}

}
