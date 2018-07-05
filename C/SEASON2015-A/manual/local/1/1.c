#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

int main() {

	uint8_t a = 0b10;
	if (a & (1 << 1)) {
		printf("TRUE\n");
	} else {
		printf("FALSE\n");
	}

	return 0;
}
