import sys, os, pygame, time

pygame.init()

screen = pygame.display.set_mode((800, 600))

execfile("sh_pygame.py")

labda_sprite = pygame.image.load("labda.gif")
LabdaMoving_icon = pygame.image.load("labda.gif")

pygame.display.set_icon(LabdaMoving_icon)
pygame.display.set_caption("LabdaMoving")



labda_rect = labda_sprite.get_rect()

labda_current_pos_x = 1
labda_current_pos_y = 1

while 1:  #nekonecna slucka
 
 debug()
 keys_pressed = pygame.key.get_pressed()
 
 
 if keys_pressed[pygame.K_ESCAPE] == 1:
  pygame.QUIT()
  sys.exit()
 #end if
 
 
 if keys_pressed[pygame.K_UP] == 1 :
  clear()
  labda_current_pos_y = labda_current_pos_y - 10
 #end if
 if keys_pressed[pygame.K_DOWN] == 1 :
  clear()
  labda_current_pos_y = labda_current_pos_y + 10
 #end if
 if keys_pressed[pygame.K_LEFT] == 1 :
  clear()
  labda_current_pos_x = labda_current_pos_x - 10
 #end if
 if keys_pressed[pygame.K_RIGHT] == 1 :
  clear()
  labda_current_pos_x = labda_current_pos_x + 10
 #end if
 
 
 
 labda_rect.top = labda_current_pos_y
 labda_rect.left = labda_current_pos_x
 screen.blit(labda_sprite, labda_rect)
 update()
 time.sleep(0.001)
  
#end while
 