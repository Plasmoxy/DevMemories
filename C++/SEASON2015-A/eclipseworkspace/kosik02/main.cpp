/*
 * main.cpp
 *
 *  Created on: Oct 23, 2015
 *      Author: seb
 */

#include <algorithm>
#include <iostream>
#include <iterator>
#include <string>
#include <sstream>
#include <vector>

#include "usrlib/knihovna.hpp"

using namespace std;

int main() {
	string a = "S,E,B";
	vector<string> a_split = knihovna::split(a, ',');
	for (int i = 0; i<a_split.size(); i++) {
		cout << a_split[i];
	}
	return 0;
}
