package mainpkg;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		//greeter.greet();
		HelloWorldGreeting hwg = new HelloWorldGreeting();
		greeter.greet(hwg);
		
	}

}
