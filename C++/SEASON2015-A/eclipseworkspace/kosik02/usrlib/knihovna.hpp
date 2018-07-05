#ifndef USRLIB_KNIHOVNA_HPP_
#define USRLIB_KNIHOVNA_HPP_

namespace knihovna {

extern const std::string __author__;
extern const std::vector<std::string> __credits__;

std::vector<std::string> &split(const std::string &s, char delim, std::vector<std::string> &elems);
std::vector<std::string> split(const std::string &s, char delim);

}
#endif /* USRLIB_KNIHOVNA_HPP_ */
