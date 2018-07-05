from msvcrt import getch
import time, os, sys
while 1:
    pressed_key = getch()
    log_file = open("G:\\WD\\LOG\\testLOG2.txt", "r")
    log_file_before = log_file.read()
    log_file_now = log_file_before + pressed_key
    log_file.close()
    log_file = open("G:\\WD\\LOG\\testLOG2.txt", "w")
    log_file.write(log_file_now)
    if pressed_key == 'x' :
        sys.exit()
    #end if
    log_file.close()
    time.sleep(0.001)
#end while
