#include "Arduino.h"

int spaces = 0;
int voltage = 0;
int timer = 0;
int aread = 0;

void setup() {
  Serial.begin(230400);
}

void loop() {
  aread = analogRead(A0);
  voltage = map(aread, 0, 1024, 0, 500);
  Serial.print(String( (voltage/100.0f)  ) +" V | " );
  spaces = map(aread, 0, 1024, 0, 1024);
  for ( int i = 0; i<=spaces; i++) {
    Serial.print(" ");
  }
  Serial.print("O\n");
  delay(100);
}
