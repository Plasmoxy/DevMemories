#include <SoftwareSerial.h>

SoftwareSerial blue(2, 3);


void setup() {
  pinMode(5, OUTPUT);
  blue.begin(19200);
}

void loop() {
  
  if (blue.available() > 0) {

    byte data = blue.read();

    if (data == 0x11) {
      digitalWrite(5, 1);
    }

    if (data == 0x10) {
      digitalWrite(5, 0);
    }
    
  }
  
}
