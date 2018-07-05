#include <iostream>
#include <stdlib.h>
#include <string>

using namespace std;

long a;
string in;

int main(void) {
	cout << "A : ";
	cin >> in;
	a = atol(in.c_str());
	cout << "A * 2 = " << (a * 2) << endl;
	return 0;
}
