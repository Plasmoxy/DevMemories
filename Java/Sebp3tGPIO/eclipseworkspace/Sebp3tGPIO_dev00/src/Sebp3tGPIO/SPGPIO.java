// IN DEVELOPMENT

package Sebp3tGPIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SPGPIO {
	
	private static String gpio_path = "/sys/class/gpio/";
	private static String export_file_path = gpio_path.concat("export");
	private static String unexport_file_path = gpio_path.concat("unexport");
	
	public static void export(int pin) {
		
		String pin_s = String.valueOf(pin);
		
		try {
			
			if ( Files.notExists(Paths.get( gpio_path.concat("gpio").concat(pin_s) )) ) {
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File(export_file_path)));
				bw.write(pin_s);
				bw.close();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void unexport(int pin) {
		
		String pin_s = String.valueOf(pin);
		
		try {
			
			if ( Files.exists(Paths.get( gpio_path.concat("gpio").concat(pin_s) )) ) {
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File(unexport_file_path)));
				bw.write(pin_s);
				bw.close();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void mode(int pin, boolean mod) {
		
		String pin_s = String.valueOf(pin);
		
		try {
			
			if ( Files.exists(Paths.get( gpio_path.concat("gpio").concat(pin_s) )) ) {

				BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
						gpio_path.concat("gpio").concat(pin_s).concat("/direction")
						)));
				
				if ( mod ) 
					bw.write("out");
				else
					bw.write("in");
				
				bw.close();
				
			} else {
				throw new PinNotExportedException();
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PinNotExportedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void write(int pin, boolean val) {
		
		String pin_s = String.valueOf(pin);
		
		try {
		
			if ( Files.exists(Paths.get( gpio_path.concat("gpio").concat(pin_s) )) ) {
				
				BufferedReader modeReader = new BufferedReader(new FileReader(new File(
						gpio_path.concat("gpio").concat(pin_s).concat("/direction")
						)));
				
				String cmode = modeReader.readLine();
				
				modeReader.close();
				
				if (cmode.equals("out")) {
					
					BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
							gpio_path.concat("gpio").concat(pin_s).concat("/value")
							)));
					
					if ( val ) {
						bw.write("1");
					} else {
						bw.write("0");
					}
					
					bw.close();
					
				} else {
					throw new BadPinModeException();
				}
				
			} else {
				throw new PinNotExportedException();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PinNotExportedException e) {
			e.printStackTrace();
		} catch (BadPinModeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
