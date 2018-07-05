#include <string>
#include <sstream>
#include <vector>

#include "knihovna.hpp"

namespace knihovna {

const std::string __author__ = "Sebastian Petrik - Sebp3t";
const std::vector<std::string> __credits__ = {
		"Evan Teran"
};

std::vector<std::string> &split(const std::string &s, char delim, std::vector<std::string> &elems) {
    std::stringstream ss(s);
    std::string item;
    while (std::getline(ss, item, delim)) {
        elems.push_back(item);
    }
    return elems;
}


std::vector<std::string> split(const std::string &s, char delim) {
    std::vector<std::string> elems;
    split(s, delim, elems);
    return elems;
}

}
