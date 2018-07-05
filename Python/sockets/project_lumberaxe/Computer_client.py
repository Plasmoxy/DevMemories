#!/usr/bin/python

import socket

host = 'localhost'

port = 12100

s = socket.socket()
s.connect((host, port))
s.send('0')
s.close()
