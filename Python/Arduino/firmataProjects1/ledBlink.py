#python

import pyfirmata, time;

board = pyfirmata.Arduino(6);

try:
	while 1:
		board.digital[8].write(1);
		time.sleep(1);
		board.digital[8].write(0);
		time.sleep(1);
	#end while
except (KeyboardInterrupt):
	for i in range(2, 13):
		board.digital[i].write(0);
	#end for
#end try