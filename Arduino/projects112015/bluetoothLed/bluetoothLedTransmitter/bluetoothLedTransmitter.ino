#include <SoftwareSerial.h>

SoftwareSerial blue(2, 3);

bool lightState = 0;

void setup() {
  pinMode(5, INPUT);
  blue.begin(19200);
}

void loop() {

  if ( digitalRead(5) && lightState) {
    blue.write(0x10);
    lightState = 0;
    delay(500);
  }

  if ( digitalRead(5) && !lightState) {
    blue.write(0x11);
    lightState = 1;
    delay(500);
  }
  
}
