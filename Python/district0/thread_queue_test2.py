# WORKIIIIIIIING :D YES YES YEEEEEES JP :3

from Queue import Queue
from threading import Thread
import time

# A thread that produces data
def producer(out_q):
	data = 2
	while True:
		data = data * 2
		out_q.put("@producer: " + str(data))
		time.sleep(1)

def producer2(out_q):
	data = 3
	while True:
		data = data * 3
		out_q.put("@producer2: " + str(data))
		time.sleep(5)


# A thread that consumes data
def consumer(in_q):
    while True:
        # Get some data
        data = in_q.get()
        # Process the data
        print "Consumer : " + data

# Create the shared queue and launch both threads
q = Queue()
t1 = Thread(target=consumer, args=(q,))
t2 = Thread(target=producer, args=(q,))
t3 = Thread(target=producer2, args=(q,))
t1.start()
t2.start()
t3.start()