/*
 * main.cpp
 *
 *  Created on: 31. 7. 2016
 *      Author: Plasmoxy
 */


#include <iostream>
#include <fstream>
#include <stdint.h>

using namespace std;

int main() {

	std::ifstream file_in("bread.txt");
	std::string file_contents((std::istreambuf_iterator<char>(file_in)), std::istreambuf_iterator<char>());
	char* f = (char*)file_contents.c_str();

	uint64_t hash = 2;
	uint64_t hashMax = 2^16;


	for (uint64_t i = 2; i <= sizeof(file_contents); i++) {

		if ( hash < hashMax ) {
			hash = hash * 3 * (uint64_t)f[i];
		} else {
			hash = hash / f[i];
		}

	}

	cout << hash << endl;

	return 0;
}
