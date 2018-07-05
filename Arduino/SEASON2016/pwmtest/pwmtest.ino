#include "furik.h"

#define APIN 3

int pwmVal = 0;

void setup() {
  Serial.begin(9600);
  pm(APIN, 1);
  aw(APIN, 255);
}

void loop() {
  String s = "";
  if (Serial.available() > 0) {
    s += Serial.readStringUntil(';');
    pwmVal = s.toInt();
  }
  aw(APIN, pwmVal);
}
