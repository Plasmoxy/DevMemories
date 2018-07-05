/*
 * main.cpp
 *
 *  Created on: 28. 7. 2016
 *      Author: Plasmoxy
 */


#include <iostream>

using namespace std;

int main() {

	char* a = "a";

	a = a << (char)1;
	a = a + (char)0x61;

	cout << a;

	return 0;
}
