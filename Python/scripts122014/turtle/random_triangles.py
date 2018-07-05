import time, random
from turtle import *


def main():
	cReset()
	
#end def

def cReset():
	reset()
	speed(0xFFFFFFFFFFFFFFFF)
	while 1:
		random_triangles(2)
	#end while
#end def

def triangle():
	for i in range(0, 3):
		forward(50)
		left(120)
	#end for
#end def

def triangle_circle():
	for i in range(1, 120):
		triangle()
		left(3)
	#end for
#end def

def random_triangle_circles():
	for i in range(1, 30):
		up()
		goto(random.randint(-350, 350), random.randint(-350, 350))
		down()
		color(random_hex_color())
		triangle_circle()
	#end for
#end def
def random_hex_color():
	return '#' + ''.join([random.choice('0123456789ABCDEF') for x in range(6)]) #/?
#end def

def random_triangles(_f_trianglesCount):
	for i in xrange(1, _f_trianglesCount):
		up()
		goto(random.randint(-350, 350), random.randint(-350, 350))
		down()
		left(random.randint(1, 180))
		color(random_hex_color())
		triangle()
	#end for
#end def

main()
	