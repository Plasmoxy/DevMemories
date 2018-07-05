/*
 * lib0.cpp
 *
 *  Created on: Oct 22, 2015
 *      Author: seb
 */

#include <iostream>
#include "lib0.hpp"

namespace a {
	namespace b1 {
		int val = 8;
	}
	namespace b2 {
		int val = 69;
	}
}

namespace pozdrav {

	std::string cus_msg = "Čuuuus !!!";

	std::string cus() {
		return cus_msg;
	}

}
