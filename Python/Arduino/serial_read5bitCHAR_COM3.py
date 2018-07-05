import serial, os, sys, time

arduino_com3_serial = serial.Serial(2)



def decode5bit():
 if arduino_com3_serial_output[1] == 0 :
  if arduino_com3_serial_output[2] == 0 :
    if arduino_com3_serial_output[3] == 0 :
      if arduino_com3_serial_output[4] == 0 :
       arduino_5bitDec = 0
   	   arduino_5bitHex = '0'
      if arduino_com3_serial_output[4] == 1 :
       arduino_5bitDec = 1
	   arduino_5bitHex = '1'
    if arduino_com3_serial_output[3] == 1 :
      if arduino_com3_serial_output[4] == 0 :
       arduino_5bitDec = 2
	arduino_5bitHex = '2'
      if arduino_com3_serial_output[4] == 1 :
       arduino_5bitDec = 3
	   arduino_5bitHex = '3'
  if arduino_com3_serial_output[2] == 1 :
	if arduino_com3_serial_output[3] == 0 :
      if arduino_com3_serial_output[4] == 0 :
       arduino_5bitDec = 4
	   arduino_5bitHex = '4'
      if arduino_com3_serial_output[4] == 1 :
       arduino_5bitDec = 5
	   arduino_5bitHex = '5'
    if arduino_com3_serial_output[3] == 1 :
      if arduino_com3_serial_output[4] == 0 :
       arduino_5bitDec = 6
	   arduino_5bitHex = '6'
    if arduino_com3_serial_output[4] == 1 :
       arduino_5bitDec = 7
	   arduino_5bitHex = '7'
 if arduino_com3_serial_output[1] == 1 :
  if arduino_com3_serial_output[2] == 0 :
    if arduino_com3_serial_output[3] == 0 :
      if arduino_com3_serial_output[4] == 0 :
       arduino_5bitDec = 8
	   arduino_5bitHex = '8'
      if arduino_com3_serial_output[4] == 1 :
       arduino_5bitDec = 9
	   arduino_5bitHex = '9'
    if arduino_com3_serial_output[3] == 1 :
      if arduino_com3_serial_output[4] == 0 :
       arduino_5bitDec = 10
	   arduino_5bitHex = 'A'
      if arduino_com3_serial_output[4] == 1 :
       arduino_5bitDec = 11
	   arduino_5bitHex = 'B'
  if arduino_com3_serial_output[2] == 1 :
	if arduino_com3_serial_output[3] == 0 :
      if arduino_com3_serial_output[4] == 0 :
       arduino_5bitDec = 12
	   arduino_5bitHex = 'C'
      if arduino_com3_serial_output[4] == 1 :
       arduino_5bitDec = 13
	   arduino_5bitHex = 'D'
    if arduino_com3_serial_output[3] == 1 :
      if arduino_com3_serial_output[4] == 0 :
       arduino_5bitDec = 14
	   arduino_5bitHex = 'E'
    if arduino_com3_serial_output[4] == 1 :
       arduino_5bitDec = 15
	   arduino_5bitHex = 'F'

	 #end of all ifs
#end def

while 1:
 arduino_com3_serial_output = arduino_com3_serial.read(5)
 decode5bit()
 print("From Binary To Decimal Number Decoded from Arduino: ", arduino_5bitDec)
 print("?CLOSE COM3")
 os.system("pause")
 arduino_com3_serial.close()
 print("?OPEN COM3")
 os.system("pause")
 arduino_com3_serial.open()
 time.sleep(1)
	 