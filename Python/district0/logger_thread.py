#python27

from threading import Thread
from Queue import Queue
import time

def t_f_logger(q_in):
	while 1:
		logFile = open("log0.txt", "a")
		data = q_in.get()
		logFile.write(data + "\n");
		logFile.close();
	#end while
#end def

queue1 = Queue();

t_logger = Thread(target=t_f_logger, args=(queue1,));
t_logger.start();

while 1:
	data = raw_input("@write queue1 : ");
	queue1.put(data);
#end while
