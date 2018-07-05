import pygame, sys, os, time
execfile("sh_pygame.py")
resolution = (320, 240)

screen = pygame.display.set_mode(resolution)

clear()

while 1:
 debug()
 mouse_pos = pygame.mouse.get_pos()
 debug()
 mouse_pressed = pygame.mouse.get_pressed()
 debug()
 pygame.draw.rect(screen, (255, 0, 0), (270,70, 50, 50))
 update()
 for i in range(i_a = 0,i_b = 2500
#end while