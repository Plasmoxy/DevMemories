#python


try:
	import serial;
except:
	print("UNO_Serial_Bridge ERRORNO[1] :: You dont have pyserial module installed.");
	raw_input();
#end try

class Arduino:
	def __init__(self, serialPort, baudRate):
		try:
			self.superSerialPort = serial.Serial(serialPort, baudRate);
		except:
			print("UNO_Serial_Bridge ERRORNO[2] :: Serial error.");
		#end try
	def pm(self, pin, value):
		if (pin >= 0 and pin <= 9):
			self.superSerialPort.write("PM" + "0" + str(pin) + str(value) + ";");
		if (pin >= 10 and pin <= 13):
			self.superSerialPort.write("PM" + str(pin) + str(value) + ";");
		#end ifs
	def dw(self, pin, value):
		if (pin >= 0 and pin <= 9):
			self.superSerialPort.write("DW" + "0" + str(pin) + str(value) + ";");
		if (pin >= 10 and pin <= 13):
			self.superSerialPort.write("DW" + str(pin) + str(value) + ";");
		#end ifs
	def dr(self, pin):
		if (pin >= 0 and pin <= 9):
			self.superSerialPort.write("DR" + "0" + str(pin));
			return int(self.superSerialPort.read(1));
		if (pin >= 10 and pin <= 13):
			self.superSerialPort.write("DR" + str(pin));
			return int(self.superSerialPort.read(1));
		#end ifs
	def push(self, comm):
		self.superSerialPort.write(comm);
	#end defs
#end class