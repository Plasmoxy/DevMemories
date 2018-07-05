print "importing"
import math
import numpy
import pyaudio
print "-> done"

x_rate=44100
x_volume=0.25

def genSine(frequency, length, rate):
    length = int(length * rate)
    factor = float(frequency) * (math.pi * 2) / rate
    return numpy.sin(numpy.arange(length) * factor)
#

def playSine(stream, frequency, length=0.1):
    chunks = []
    chunks.append(genSine(frequency, length, x_rate))

    chunk = numpy.concatenate(chunks) * x_volume

    stream.write(chunk.astype(numpy.float32).tostring())
#



p = pyaudio.PyAudio()
s = p.open(format=pyaudio.paFloat32, channels=1, rate=44100, output=1)


try :
	while True :
		playSine(s, 500);
		playSine(s, 560);
	#
except KeyboardInterrupt :
	stream.close()
	p.terminate()
	sys.exit()
#