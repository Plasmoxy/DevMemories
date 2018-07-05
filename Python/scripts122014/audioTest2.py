import pygame, time, sys, os
pygame.init()
pygame.display.set_mode((200,100))
def pianoo() :
	pygame.mixer.music.load("piano.ogg")
	pygame.mixer.music.play(0)
	clock = pygame.time.Clock()
	clock.tick(1)
	while pygame.mixer.music.get_busy():
		pygame.event.poll()
		clock.tick(1)
#enddef

while 1:
	events = pygame.event.get()
	for event in events:
		if event.type == pygame.KEYDOWN:
			if event.key == pygame.K_LEFT:
				pianoo()