import ctypes
import time
import serial

#ctypes.windll.user32.keybd_event(0x, 0, 0, 0)
#ctypes.windll.user32.keybd_event(0x, 0, 0x2, 0)

ser = serial.Serial(6);

while 1:
	data = ser.read(4);
	print data
	if (data[0] == '1'):
		ctypes.windll.user32.keybd_event(0x25, 0, 0, 0)
	if (data[0] == '0'):
		ctypes.windll.user32.keybd_event(0x25, 0, 0x2, 0)
	#end ifs
#end while