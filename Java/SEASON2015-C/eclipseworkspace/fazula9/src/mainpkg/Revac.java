package mainpkg;

public class Revac extends Thread{
	
	public Revac(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		while (true) {
			System.out.println("UAAAAAA !!!!");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
		
	}

}
