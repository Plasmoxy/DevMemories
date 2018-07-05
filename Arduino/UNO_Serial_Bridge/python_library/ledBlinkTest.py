import UNOSerialBridge.bridge as UNOSB;
import time;

board = UNOSB.Arduino(6, 57600);

board.push("PM071;");

while 1:
	board.push("DW071;");
	time.sleep(1);
	board.push("DW070;");
	time.sleep(1);
#end while