#include <opencv2/core/core.hpp>
#include <opencv2/highgui/highgui.hpp>
#include <opencv2/imgproc/imgproc.hpp>
#include <iostream>

using namespace std;
using namespace cv;

int main() {
	VideoCapture camera(0);

	while (true) {

		Mat frame, frame_hsv, frame_thres;

		if (!camera.read(frame)) {
			cout << "ERROR READING CAMERA" << endl;
			return -1;
		}
		flip(frame, frame, 2);

		// -- blue --
		Scalar low(105, 50, 50);
		Scalar high(130, 255, 255);

		//Scalar low(105, 0, 150);
		//Scalar high(130, 255, 255);

		cvtColor(frame, frame_hsv, COLOR_BGR2HSV);
		inRange(frame_hsv, low, high, frame_thres);
		imshow("thres", frame_thres);

		cv::vector< cv::vector<cv::Point> > contours;
		cv::vector<cv::Vec4i> heirarchy;
		cv::vector<cv::Point2i> centers;
		cv::vector<int> radiuses;

		cv::findContours( frame_thres.clone(), contours, heirarchy, CV_RETR_TREE, CV_CHAIN_APPROX_NONE);

		size_t count = contours.size();

		for( int i=0; i<count; i++)
		{
		    cv::Point2f c;
		    float r;
		    cv::minEnclosingCircle( contours[i], c, r);

		    centers.push_back(c);
		    radiuses.push_back(r);


		}

		size_t blue_obj_centers_size = centers.size();
		cv::Scalar red(0, 0, 255);

		for(int i = 0; i < blue_obj_centers_size; i++)
		{
			if (radiuses[i] > 30) {
				cv::circle(frame, centers[i], radiuses[i], red, 3);
			}

		}

		imshow("frame", frame);

		if (waitKey(1) >= 0) break;
	}

	return 0;
}
