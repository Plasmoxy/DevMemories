#python27

print "----- CAPSENSE DRUMS -----"
print "by Sebastian Petrik"
print "sebohacker@gmail.com"
print "\n"

print "[info] importing libraries"

from Queue import  Queue
import threading
import pygame
import time
import serial
import sys

print "[info] initializing pygame"
pygame.mixer.pre_init(44100, -16, 2, 1024);
pygame.init();

def serialReader(q_out):
	print "[Thread:serialReader] creating serial port"
	try :
		ser = serial.Serial(3, 115200);
	except :
		print "[error] Serial port problem. Try changing port number."
	#end try
	time.sleep(3);
	print "[Thread:serialReader] DONE"
	while True:
		ser.write("S;");
		data = ser.read(3);
		q_out.queue.clear();
		q_out.put(data);
	#end while
def kick(q_in):
	print "[Thread:kick] started"
	sound = pygame.mixer.Sound("kick.wav");
	isOn = False;
	while True:
		data = q_in.get();
		if (data[0] == '1' and isOn == False):
			sound.play();
			isOn = True;
		if (data[0] == '0' and isOn == True):
			isOn = False;
		#end ifs
	#end while
def hihat(q_in):
	print "[Thread:hihat] started"
	sound = pygame.mixer.Sound("hihat.wav");
	isOn = False;
	while True:
		data = q_in.get();
		if (data[1] == '1' and isOn == False):
			sound.play();
			isOn = True;
		if (data[1] == '0' and isOn == True):
			isOn = False;
		#end ifs
	#end while
def snare(q_in):
	print "[Thread:snare] started"
	sound = pygame.mixer.Sound("snare.wav");
	isOn = False;
	while True:
		data = q_in.get();
		if (data[2] == '1' and isOn == False):
			sound.play();
			isOn = True;
		if (data[2] == '0' and isOn == True):
			isOn = False;
		#end ifs
	#end while
#end defs

q = Queue();

sR = threading.Thread(target=serialReader, args=(q,));
d0 = threading.Thread(target=kick, args=(q,));
d1 = threading.Thread(target=hihat, args=(q,));
d2 = threading.Thread(target=snare, args=(q,));

d0.start();
d1.start();
d2.start();
sR.start();

time.sleep(4);
print "[info] Exiting Main Thread"
print "--- NOW YOU CAN PLAY ---"

raw_input();
sys.exit();
