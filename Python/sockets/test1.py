from socket import *
from time import ctime
HOST = 'localhost'
PORT = 28812
BUFSIZE = 1024
ADDR = (HOST, PORT)

tcpTimeSrvrSock = socket(AF_INET,SOCK_STREAM)
tcpTimeSrvrSock.bind(ADDR)
tcpTimeSrvrSock.listen(50)

while True:
  print 'waiting for connection...'
  tcpTimeClientSock, addr = tcpTimeSrvrSock.accept()
  print '...connected from:', addr

  while True:
    data = tcpTimeClientSock.recv(BUFSIZE)
    if not data:
      break
    tcpTimeClientSock.send('[%s] %s' % (ctime(), data))
    
  tcpTimeClientSock.close()
tcpTimeSrvrSock.close() 
