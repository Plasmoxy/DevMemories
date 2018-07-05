import pygame, sys, os
from pygame.locals import *
pygame.init()
screen = pygame.display.set_mode((320, 320))
pygame.display.set_caption('PYGAME')
player = pygame.image.load(os.path.join("labda.gif"))
player.convert()

while 1:
    screen.blit(player, (10, 10))
    pygame.display.flip()
	keys = pygame.key.get_pressed()
	print(keys)
pygame.quit()