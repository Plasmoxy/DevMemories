import serial;
import win32com.client

ser = serial.Serial(2);
shell = win32com.client.Dispatch("WScript.Shell")
while 1:

    padkeys = ser.read(4);

    if padkeys[0] == '1' :
        shell.SendKeys("w");
    #endif

#endwhile
