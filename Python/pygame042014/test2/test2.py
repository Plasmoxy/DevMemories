import os, sys, pygame, time

pygame.init()
time.sleep(1)

resolution = (640, 480)

screen = pygame.display.set_mode(resolution)
blue = (0, 0, 255)
red = (255, 0, 0)

execfile("sh_pygame.py") #exec sebohacker pygame library like debug(), clear(), update() ...

def anim_loading():
 #frame1
 clear()
 pygame.draw.rect(screen, blue, (0,0, 78,20)) #loading rect1
 update()
 time.sleep(1)
 #frame2
 clear()
 pygame.draw.rect(screen, blue, (80,0, 78,20)) #loading rect2
 update()
 time.sleep(1)
 #frame3
 clear()
 pygame.draw.rect(screen, blue, (190,0, 78,20)) #loading rect3
 update()
 time.sleep(1)
 #frame4
 clear()
 pygame.draw.rect(screen, blue, (270,0, 78,20)) #loading rect4
 update()
 time.sleep(1)
#end def

while 1:
 anim_loading()
 time.sleep(0.001)
#end while