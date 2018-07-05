package Sebp3tGPIO;

public class PinNotExportedException extends Exception {
	
	public PinNotExportedException() {
		super("Pin has not been exported");
	}

}
