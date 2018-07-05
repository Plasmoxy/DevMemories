#include <iostream>
#include <stdlib.h>
#include <string>
#include <stdint.h>
using namespace std;

int main(void) {
	int a[] = {5, 4, 3};
	for (int i : a) {
		cout << i << endl;
	}
	return 0;
}
