/*
 * main.cpp
 *
 *  Created on: Oct 28, 2015
 *      Author: seb
 */
#include <opencv2/core/core.hpp>
#include <opencv2/highgui/highgui.hpp>
#include <opencv2/imgproc/imgproc.hpp>
#include <iostream>

using namespace std;
using namespace cv;

int main() {

	VideoCapture camera(0);
	Mat frame;

	if (!camera.read(frame)) {
		cout << "ERROR READING CAMERA" << endl;
		return -1;
	}

	namedWindow("CS");

	imshow("CS", frame);

	while (true) {
		if (waitKey(10) > 0) break;
	}


	return 0;
}
