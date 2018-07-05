/*
 * main.cpp
 *
 *  Created on: 27. 7. 2016
 *      Author: Plasmoxy
 */


#include <stdlib.h>     /* malloc, free, rand */
#include <stdio.h>
#include <string.h>
#include <iostream> // basic streams
#include <iterator>
#include <string> // no use so far, garbage
#include <sstream>
#include <fstream>

using namespace std; // cout, endl etc...

void log(string txt) { // quick function for debug logging
	cout << txt << endl;
}

void clearMEM(unsigned char f_MEM[], unsigned long f_memsize) { // clears a char array mem, everything to 0x00

	for (unsigned long i = 0; i < f_memsize; i++) {
		f_MEM[i] = 0;
	}

}

void dumpMEM(unsigned char f_MEM[], unsigned long f_memsize) { // prints out the whole content of char array mem

	cout << "--- MEM DUMP ---" << endl;
	cout << "--- PATTERN : [addr(hex)]	[addr(dec)]	{dec}	{hex}	{char} ---" << endl;


	for (unsigned long i = 0; i < f_memsize; i++) {
		unsigned char MEMTOKEN_v = f_MEM[i];
		unsigned char *MEMTOKEN = &MEMTOKEN_v;

		cout << "[" << hex << uppercase << i << dec << "]	"; // print hex address
		cout << "[" << dec << i << "]	"; // print dec address

		cout << "{" << +*MEMTOKEN <<"}	"; // print dec value

		//print hex value
		cout << "{0x";
		cout << hex << uppercase << +*MEMTOKEN << dec << "}	";

		cout << "{" << *MEMTOKEN << "}";

		cout << endl;
		delete MEMTOKEN;
	}

}

int main() {

	unsigned long memsize_init = 1048576; // 1MB
	unsigned char* MEM = (unsigned char*) malloc(sizeof(unsigned char)*memsize_init); // define MEM by dynamically allocating specified size of memory (bytes, 1char=1byte) to it and getting it's start pointer, will act as normal char array
	unsigned long MEMs = memsize_init; // get a copy of memsize so it doesn't dynamically change real MEM size
	//clearMEM(MEM, MEMs); // althrough MEM is already dynamically allocated in RAM, it isn't cleared so for testing purposes we clear it

	// parser ...

	std::ifstream file_in("prog.chleb");
	std::string file_contents((std::istreambuf_iterator<char>(file_in)), std::istreambuf_iterator<char>());
	const char* pd = file_contents.c_str();
	unsigned int pd_chars = sizeof(pd) - 2;

	log("-START-");

	for ( unsigned int i = 0; i < pd_chars; i++) { // scans bytes of machine code till eof, each byte is represented within as pd[i]

		if ( pd[i] == 0x10 ) { // print function
			i++; // move to next byte -> the size of size of the string
			unsigned int ssize = (unsigned int)pd[i]; // get size
			i++; // get to start of string
			unsigned int i_at_start = i;
			stringstream ss;
			for (i; i < ( i_at_start + ssize ); i++) {

				ss << pd[i];

			}

			cout << ss.str();
			delete ss;
		}

	}

	// ... parser

	log("\n-END-");
	delete[] MEM;
	return 0;
}
