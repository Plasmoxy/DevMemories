import pygame, os

pygame.mixer.pre_init(44100, -16, 2, 2048)
pygame.init()

zvuk = pygame.mixer.Sound(os.path.join('piano.mp3'))

zvuk.play(-1)