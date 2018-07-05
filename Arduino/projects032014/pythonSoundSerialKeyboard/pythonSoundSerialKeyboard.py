import serial, msvcrt, time

arduino_com = serial.Serial(2)

print arduino_com.name

while 1:
    key = msvcrt.getch()
    arduino_com.write(key)
    arduino_com.write('x')
    time.sleep(0.001)
#end while
