import time, pygame
execfile("sh_pygameV1.1.py");

pygame.init();
screen = pygame.display.set_mode((320,320));

while 1:
    debug();mouse_buttons_pressed = pygame.mouse.get_pressed();
    mouse_keys = pygame.mouse.get_pressed();
    if mouse_keys[0] :
        debug();mouse_pos_before = pygame.mouse.get_pos();
        time.sleep(0.01);
        debug();mouse_pos_current = pygame.mouse.get_pos();
        debug();pygame.draw.line(screen, (255,0,0), mouse_pos_before, mouse_pos_current);
    #end if
#end while
