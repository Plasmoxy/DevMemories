#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <unistd.h>

int main() {
	FILE *gpioExport = fopen("/sys/class/gpio/export", "w");
	FILE *gpio18value = fopen("/sys/class/gpio/gpio18/value");
	FILE *gpio18direction = fopen("/sys/class/gpio/gpio18/direction");
	if (gpio18direction == NULL || gpio18value == NULL) {
		fprintf(gpioExport, "18");
	}

	fprintf(gpio18direction, "out");
	fprintf(gpio18value, "1");
	sleep(1);
	fprintf(gpio18value, "0");

	fclose(gpioExport);
	fclose(gpio18value);
	fclose(gpio18direction);
	return 0;
}

