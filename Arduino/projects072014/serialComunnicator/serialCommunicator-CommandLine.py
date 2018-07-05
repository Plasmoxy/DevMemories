import os, sys;

try :
	import serial;
except :
	print "You have not installed the pyserial module !!!"
#endtry

print "serialCommunicator - Command Line\n";

ser = serial.Serial("/dev/ttyACM0");

while 1 :
	
	command="";
	
	sys.stdout.write("\nserial_write>");
	command=raw_input();
	
	if command=="exit" :
		exit();

	ser.write(command);

#endwhile
	