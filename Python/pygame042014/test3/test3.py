import os, sys, pygame, time

pygame.init()

screen = pygame.display.set_mode((640,480))

execfile("sh_pygame.py")
clear()

font = pygame.font.SysFont("monospace", 15)


screen.blit(font.render("Detecting Mouse...", 1, (255, 0, 0)), (1,1))
update()


for i in range(0, 20):
 debug()
 mouse_pos = pygame.mouse.get_pos()
 print(mouse_pos)
 time.sleep(1)
#end for


time.sleep(60)