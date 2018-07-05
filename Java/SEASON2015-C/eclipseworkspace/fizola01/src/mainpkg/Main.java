package mainpkg;

public class Main {
	
	private static int shared = 0;
	private final static Object monitor = new Object();
	
	private static Thread writer = new Thread(new Runnable() {
		@Override
		public void run() {
			int a = 1;
			while (true) {
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				synchronized (monitor) {
					shared = a;
				}
				a++;
			}
		}
	});
	
	private static Thread reader = new Thread(new Runnable() {
		@Override
		public void run() {
			while (true) {
				try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
				synchronized (monitor) {
					System.out.println(shared);
				}
			}
		}
	});
	
	public static void main(String[] args) throws InterruptedException {
		
		writer.start();
		reader.start();
		
	}

}
