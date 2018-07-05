import pygame, time
execfile("sh_pygameV1.1.py");

pygame.init();
screen = pygame.display.set_mode((320,320));

debug();

image = pygame.image.load("gula.png");
cursorPixel = pygame.image.load("pixelblackdot.gif");

imageRect = image.get_rect()
cursorPixelRect = cursorPixel.get_rect();

while 1:
    clear();
    debug();
    imageRect.top = 20
    imageRect.left = 20
    screen.blit(image, imageRect);
    mouse_pos = pygame.mouse.get_pos();
    cursorPixelRect.top = mouse_pos[1]
    cursorPixelRect.left = mouse_pos[0]
    screen.blit(cursorPixel, cursorPixelRect);
    debug();
    if cursorPixelRect.colliderect(imageRect) == True :
        print("TRUE");
    else :
        print("FALSE");
    #end if
    time.sleep(1);
#end while
