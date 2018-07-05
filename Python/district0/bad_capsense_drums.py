#python

from threading import Thread
import time
import serial
import pygame
import Queue

print "[info] creating serial port"

ser = serial.Serial(3);
time.sleep(3);

print "[info] initializing pygame"
pygame.mixer.pre_init(44100, -16, 2, 1024);
pygame.init();

print "[info] loading sounds"
s = pygame.mixer.Sound("crashdrum.wav");

print "[info] creating queue"

superq = Queue.Queue();
superq.put("000")

def player(q):
	while 1 :
		data = q.get();
		q.task_done();
		if (data[0] == '1') :
			print "[mixer] playing sound"
			s.play();
			time.sleep(0.2)
		#end if
	#end while
#end def

def counter(q):
	while 1 :
		print "q.get() :" + q.get()
		q.task_done();
		time.sleep(0.5);
	#end while
#end def
def serialReader(q):
	ser.write("S;");
	data = ser.read(3);
	q.put(data);
#end def

a = Thread(target=counter, args=(superq,));
a.daemon = True;
b = Thread(target=serialReader, args=(superq,));
b.daemon = True;
c = Thread(target=player, args=(superq,));
c.daemon = True;

a.start();
b.start();
c.start();