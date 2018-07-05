#python27

import serial, time

s = serial.Serial("/dev/ttyACM0");

try :
	while (1) :
		s.write(chr(0x99));a = s.read(3);
		out = list("000")
		if a[0] == chr(0x0A) :
			out[0] = '1';
		if a[0] == chr(0x0B) :
			out[0] = '0';
		if a[1] == chr(0x0A) :
			out[1] = '1';
		if a[1] == chr(0x0B) :
			out[1] = '0';
		if a[2] == chr(0x0A) :
			out[2] = '1';
		if a[2] == chr(0x0B) :
			out[2] = '0';
		print "".join(out)
		#end ifs
		time.sleep(0.1);
	#end while
except (KeyboardInterrupt) :
	print "KeyboardInterrupt catched"
	s.close();
	exit();
#end try
