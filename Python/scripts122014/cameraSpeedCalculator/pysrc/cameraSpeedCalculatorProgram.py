#uses python27
#comments and documentation are in the second file (source file)
from __future__ import division
from sys import stdout

stdout.write("""
	\n\n(c) Sebastian Petrik 2014
	\nCamera Speed Calculator
	\n--------------------------
	""")
stdout.write("\n\nVariable declaration...\nFPS=");fps = int(raw_input()); #raw_input() creates new line by itself so no need for \n
stdout.write("centimetres=");centimetres = int(raw_input());
stdout.write("frames=");frames = int(raw_input());   

metres = centimetres / 100
kilometres = metres / 1000
speed_KmPh = 0
speed_KmPs = 0
speed_mPs = 0
speed_mPh = 0
speed_cmPs = 0
framesDurationSeconds = frames / fps
framesDurationHours = framesDurationSeconds / 60 / 60
speed_cmPs = centimetres / framesDurationSeconds   # so in my case it is 34cm per 7 frames (=7/240 seconds)
speed_mPs = metres / framesDurationSeconds
speed_KmPs = kilometres / framesDurationSeconds
speed_KmPh = kilometres / framesDurationHours

stdout.write(
	"\n\nSpeed of object\n---------------"
	+"\n"+str(speed_KmPh)+" km/h"
	+"\n"+str(speed_mPs)+" m/s"
	+"\n"+str(speed_cmPs)+" cm/s"
	+"\n"+str(speed_KmPs)+" km/s"
	+"\n\n\n");
#end of construct

#end of program








