#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
  printf("\n");
  
  int input_a = 0;
  int input_b = 0;
  
  printf("Kalkulacka");
  printf("\n----------");
  printf("\n\n");
  printf("\nZadajte hodnotu /a/ (cele cislo) : ");
  scanf("%d", &input_a);
  printf("\nZadajte hodnotu /b/ (cele cislo) : ");
  scanf("%d", &input_b);
  printf("\n\n\n");
  printf("\nVysledky :");
  printf("\n\n %d + %d = %d", input_a, input_b, input_a + input_b);
  printf("\n\n %d - %d = %d", input_a, input_b, input_a - input_b);
  printf("\n\n %d * %d = %d", input_a, input_b, input_a * input_b);
  printf("\n\n %d / %d = %d", input_a, input_b, input_a / input_b);
  printf("\n\n\n");
  
    
  system("PAUSE");
  return 0;
}
