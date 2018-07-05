#python27

import time

strip = "\n-----------------------------------------------\n"

while 1:
	file = open("log0.txt", "r");
	print str(strip + file.read() + strip);
	file.close();
	time.sleep(1);
#end while