/*
 * main.cpp
 *
 *  Created on: Oct 23, 2015
 *      Author: seb
 */

#include <string>
#include <vector>
#include <iostream>

#include "usrlib/knihovna.hpp"

using namespace std;
using namespace knihovna;

int main() {
	string a = "c a";
	vector<string> sp = split(a, ' ');
	for (int i = 0; i<sp.size(); i++) {
		cout << sp[i] << endl;
	}
	return 0;
}
