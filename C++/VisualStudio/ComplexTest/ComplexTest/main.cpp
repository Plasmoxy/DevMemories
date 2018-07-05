#include <iostream>
#include <complex>
#include "macros.h"

#include <cmath>

#define pi 3.14159265358979323846
#define deg pi/180
using namespace std;

typedef complex<double> cmpl;

cmpl i(0, 1);


cmpl rot(cmpl x, double th) {

	cmpl i(0, 1);

	return (cmpl)(
		x*( cos(th) + i*sin(th) )
	);

}

int main() {

	cmpl A(1, 1);

	wood(rot(A,45*deg));

	system("pause");
	return 0;
}