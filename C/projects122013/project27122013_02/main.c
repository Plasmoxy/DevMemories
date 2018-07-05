#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[])
{
  printf("\n");
  #include "numbercalc.dll"
  
  calplus(6,4);
  
  system("PAUSE");	
  return 0;
}
