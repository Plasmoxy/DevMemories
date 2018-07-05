#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
    int i;
    for (i = 0;i != 100;i++){
            printf("%d", i);
            if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 ||
                i == 60 || i == 70 || i == 80 || i == 90) {
                    printf("\n");
            }
    }
    system("PAUSE>nul");
    return 0;
}
