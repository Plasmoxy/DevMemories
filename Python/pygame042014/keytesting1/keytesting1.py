import pygame, sys, os, time

pygame.init()

resolution = 320, 240

screen = pygame.display.set_mode(resolution)

while 1:
        for event in pygame.event.get():
                                        if event.type == pygame.KEYDOWN:
                                                                        if event.key == pygame.K_r:
                                                                                                    print("TRUE")
			                                                            else:
			                                                                                        print("FALSE")
				 
	  
        time.sleep(10)

