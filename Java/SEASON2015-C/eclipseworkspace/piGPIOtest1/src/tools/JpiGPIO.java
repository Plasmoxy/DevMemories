package tools;
import java.io.IOException;

public class JpiGPIO {
	
	public static int in = 0;
	public static int out = 1;
	public static int high = 1;
	public static int low = 0;
	
	public static void export(int pinNumber) throws IOException{
		String pin = String.valueOf(pinNumber);
		SebFileManipulator.writePW("/sys/class/gpio/export", pin);
	}
	
	public static void unexport(int pinNumber) throws IOException{
		String pin = String.valueOf(pinNumber);
		SebFileManipulator.writePW("/sys/class/gpio/unexport", pin);
	}
	
	public static void mode(int pinNumber, int mode) throws IOException{
		String pin = String.valueOf(pinNumber);
		if (mode == 0) SebFileManipulator.writePW("/sys/class/gpio/gpio"+pin+"/direction", "in");
		if (mode == 1) SebFileManipulator.writePW("/sys/class/gpio/gpio"+pin+"/direction", "out");
	}
	
	public static void write(int pinNumber, int stateNumber) throws IOException{
		String pin = String.valueOf(pinNumber);
		String state = String.valueOf(stateNumber);
		SebFileManipulator.writePW("/sys/class/gpio/gpio"+pin+"/value", state);
	}
	
	public static int read(int pinNumber) throws IOException {
		String pin = String.valueOf(pinNumber);
		return Integer.parseInt(SebFileManipulator.readBFR("/sys/class/gpio/gpio"+pin+"/value"));
	}

}
