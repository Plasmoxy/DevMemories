#uses python27
from __future__ import division


#known vars ...

fps = 30  #FPS of the camera
centimetres = 10 #centimeters object has passed
frames = 30   #how much frames did the object take to pass %centimeters% length


metres = centimetres / 100
kilometres = metres / 1000


# /// so it took 7 frames at 240FPS to pass 34 centimetres
#unknown vars ...

speed_KmPh = 0
speed_KmPs = 0
speed_mPs = 0
speed_mPh = 0
speed_cmPs = 0

#}}}
#thinking...
"""
speed ... centimeters / seconds

1 second  ... 240 frames
x seconds ... 7 frames
-----------------------
x=1*7/240
x=7/240


"""

#calculations ...

framesDurationSeconds = frames / fps
framesDurationHours = framesDurationSeconds / 60 / 60
speed_cmPs = centimetres / framesDurationSeconds   # so in my case it is 34cm per 7 frames (=7/240 seconds)
speed_mPs = metres / framesDurationSeconds
speed_KmPs = kilometres / framesDurationSeconds
speed_KmPh = kilometres / framesDurationHours

print(
	"Speed of object\n---------------"
	+"\n"+str(speed_KmPh)+" km/h"
	+"\n"+str(speed_mPs)+" m/s"
	+"\n"+str(speed_cmPs)+" cm/s"
	+"\n"+str(speed_KmPs)+" km/s")
#end of construct






#end of program








