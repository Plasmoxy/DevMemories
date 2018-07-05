import Queue
import threading
import time

queue = Queue.Queue();

LOCKER = threading.Lock();

class counter(threading.Thread):
	def __init__(self, queue):
		threading.Thread.__init__(self);
		self.queue = queue;
	def run(self):
		a = 1;
		while True:
			a = a * 2
			LOCKER.acquire();
			#self.queue.queue.clear();
			self.queue.put(a);
			#self.queue.task_done();
			LOCKER.release();
			print "LLL"
			time.sleep(1);
		#end while
	#end defs
#end class

class printer(threading.Thread):
	def __init__(self, queue):
		threading.Thread.__init__(self);
		self.queue = queue;
	def run(self):
		while True:
			LOCKER.acquire();
			print self.queue.get();
			#self.queue.task_done();
			LOCKER.release();
		#end while
	#end defs
#end class

c = counter(queuem);
#c.setDaemon(True);
c.start();
p = printer(queuem);
#p.setDaemon(True);
p.start();
