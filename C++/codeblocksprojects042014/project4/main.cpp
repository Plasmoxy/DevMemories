#include <SDL/SDL.h>
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){

  if( SDL_Init(SDL_INIT_VIDEO) < 0 ){
    printf("Inicializace SDL se nezdaøila: %s\n", SDL_GetError());
    exit(1);
  }

  atexit(SDL_Quit);

  SDL_Surface *screen;
  screen = SDL_SetVideoMode(800, 600, 32, SDL_HWSURFACE|SDL_DOUBLEBUF);

  if ( screen == NULL ){
    printf("Vytvoøení okna se nezdaøilo: %s\n", SDL_GetError());
    exit(1);
  }

  bool done=false;

  while(done == false){
  }

}
