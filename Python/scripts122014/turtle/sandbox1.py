import time, random
from turtle import *

reset()
speed(1000000)
down()

def cube(xsize, ysize, zsize):
	for i in range(1, 2):
		forward(xsize)
		left(90)
		forward(ysize)
		left(90)
	#end for
	
	forward(xsize);
	left(135);forward(zsize/2);backward(zsize/2);right(135)
	left(90);forward(ysize);right(90);
	left(135);forward(zsize/2);backward(zsize/2);right(135)
	left(180);forward(xsize);right(180);
	left(135);forward(zsize/2);backward(zsize/2);right(135)
	right(90);forward(ysize);left(90);
	left(135);forward(zsize/2);
	
	for i in range(1, 2):
		forward(xsize)
		left(90)
		forward(ysize)
		left(90)
	#end for
	
	right(45)
	forward(zsize/2)
	left(45)
#end def

cube(50, 50, 50)

raw_input()