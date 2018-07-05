/*
 * main.cpp
 *
 *  Created on: Oct 12, 2015
 *      Author: seb
 */

#include <cstring>
#include <iostream>
#include <string>

using namespace std;

long riesic(string priklad) {

	char* cs = priklad.c_str();
	string firstNumber, numberOperator, secondNumber = "";

	int cs_len = strlen(cs);

	int i = 0;

	while (cs[i] != ' ') {
		firstNumber += (string) cs[i];
		i++;
	}

	i++;
	numberOperator = cs[i];

	i++;
	while (cs[i] != cs_len) {
		secondNumber += (string) cs[i];
		i++;
	}

	if (numberOperator == "+") {
		return = atoi(firstNumber.c_str()) + atoi(secondNumber.c_str());
	}

	return -42;

	return 0;

}

int main() {

	cout << "KALKULATOR v C++" << endl;

	riesic("2 + 1");

	return 0;
}
