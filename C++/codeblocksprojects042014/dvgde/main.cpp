#include <iostream>
#include "SDL/SDL.h"
using namespace std;

int main()
{
        //Start SDL
    SDL_Init( SDL_INIT_EVERYTHING );

    //Set up screen
    screen = SDL_SetVideoMode( 640, 480, 32, SDL_SWSURFACE );
}
