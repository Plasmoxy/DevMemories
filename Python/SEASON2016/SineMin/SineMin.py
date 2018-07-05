print "importing"

#basic stuff for audio and sine generation
import math
import numpy
import pyaudio

#multithreading, pyserial and system
from Queue import Queue
import threading
import time
import serial
import sys

print "-> done"

#set default sound rate and volume for audio stream
x_rate=44100
x_volume=0.25


# -------- THREAD CAPSULE DEFINITION FOR SERIAL READER -----------
def serialReaderCapsule(que):

	print "[Thread:serialReader] creating serial port"
	try :
		ser = serial.Serial("COM3", 9600, timeout=0.05);
	except :
		print "[error] Serial port problem. Try changing port number."
	#end try
	
	time.sleep(3);
	print "[Thread:serialReader] DONE"
	
	
	while True:
		ser.write("S;");
		while ser.inWaiting() :
			data = ser.readline()
		que.queue.clear();
		que.put(data);
	#end while
#


# -------- THE DEFINITIONS FOR SINE WAVE --------------

def genSine(frequency, length, rate):  # this returns numpy array with sine wave of specific length
    length = int(length * rate)
    factor = float(frequency) * (math.pi * 2) / rate
    return numpy.sin(numpy.arange(length) * factor)
#

def playSine(stream, frequency, length=0.1): # tells stream to play sine of freq, def_leng 0.1
    chunks = []
    chunks.append(genSine(frequency, length, x_rate))

    chunk = numpy.concatenate(chunks) * x_volume

    stream.write(chunk.astype(numpy.float32).tostring())
#


# initialize pyaudio and stream mainstream
x_pyaudio = pyaudio.PyAudio()
mainstream = x_pyaudio.open(format=pyaudio.paFloat32, channels=1, rate=44100, output=1)

#create multithread queue so we can transfer tone value between mainthread and serialReader

try :
	q = Queue();
	
	serialReaderThread = threading.Thread(target=serialReaderCapsule, args=(q,))
	serialReaderThread.daemon = True
	serialReaderThread.start()
	
	freq = 100;
	
	
	print "cccc"
	time.sleep(5)
	
	while True :
		
		try :
			freq = int( ( str(q.get_nowait()).replace("\n", "") ) )
		except :
			pass
		
		playSine(mainstream, freq, 0.01)
	#
except KeyboardInterrupt :
	serialReaderThread._exit();
	mainstream.close()
	x_pyaudio.terminate()
	sys.exit()
#