#include <iostream>
#include <stdlib.h>
#include <string>
using namespace std;

int main(void) {
	int a = 4;
	int *a_pointer = &a;
	cout << *a_pointer << endl;
	return 0;
}
