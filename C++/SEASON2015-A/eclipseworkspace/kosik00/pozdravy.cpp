/*
 * pozdravy.cpp
 *
 *  Created on: Oct 21, 2015
 *      Author: seb
 */
#include <iostream>
#include "pozdravy.hpp"

namespace pozdravy {

	std::string cus_msg = "Čuuuuus.";

	void cus() {
		std::cout << cus_msg << std::endl;
	}

	std::string cus_s() {
		return cus_msg;
	}

}

