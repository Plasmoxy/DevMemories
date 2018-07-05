#ifndef USRLIB_KNIHOVNA_HPP_
#define USRLIB_KNIHOVNA_HPP_

namespace knihovna {

std::vector<std::string> &split(const std::string &s, char delim, std::vector<std::string> &elems);
std::vector<std::string> split(const std::string &s, char delim);

}
#endif /* USRLIB_KNIHOVNA_HPP_ */
