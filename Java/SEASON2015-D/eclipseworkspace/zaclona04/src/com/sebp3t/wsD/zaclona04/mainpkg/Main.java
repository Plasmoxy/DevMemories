package com.sebp3t.wsD.zaclona04.mainpkg;

import jssc.*;

public class Main {
	
	public static void main(String[] args) throws SerialPortException {
		
		SerialPort sp = new SerialPort("/dev/ttyACM1");
		
		sp.openPort();
		sp.setParams(9600, 8, 1, 0);
		f
		while (true) {
			byte in = sp.readBytes(1)[0];
			if (in == Byte.parseByte("\n")) break;
			System.out.println(in);
		}
		
		sp.closePort();
		
	}

}
