#include <Arduino.h>
#include "furik.h"

#define APIN 3

void setup() {
  Serial.begin(9600);
  pm(APIN, 1);
  aw(APIN, 255);
}

void loop() {
  String s = "";
  while (Serial.available() > 0) {
    s += Serial.readStringUntil(';');
  }
  aw(APIN, s.toInt());
}
