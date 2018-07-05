#!/usr/bin/python

print "Project lumberaxe (RPi_server.py)";

import socket;

s = socket.socket();

host = 'localhost';
port = 12100;
s.bind((host,port));

s.listen(5);

print "now listening";

while True :
	c, addr = s.accept();
	print "[server] " + str(addr) + " @ connected";
	data = c.recv(1024);
	print "[" + str(addr) + "]" + data;
	c.close();
	print "[server] " + str(addr) + " @ disconnected";
#end while