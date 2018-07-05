#include <EEPROM.h>
int a;int b;int c;int d;int e;
float joy = 0;
int neutral = 0;
void setup () {
  Serial.begin(9600);
}
void loop () {
  while (Serial.available() > 0) {
    a = Serial.read();
    b = Serial.read();
    c = Serial.read();
    d = Serial.read();
    e = Serial.read();
  }
  ///sebo
  if (a == 115) {
    if (b == 101) {
      if (c == 98) {
        if (d == 111) {
          if (e == -1) {
          Serial.println();
          Serial.println("heslo je potvrede =) sebo");
          Serial.println();
          a = 0;b = 0;c = 0;d = 0;e = 0;
        }}}}}
  ///prntj
  if (a == 112) {
    if (b == 114) {
      if (c == 110) {
        if (d == 116) {
          if (e == 106) {
            joy = analogRead(A0);
            Serial.println("joy is: ");
            Serial.print(joy);
            Serial.println();
            joy = 0;
            a = 0;b = 0;c = 0;d = 0;e = 0;
          }}}}}
  ///savej
  if (a == 115) {
    if (b == 97) {
      if (c == 118) {
        if (d == 101) {
          if (e == 106) {
            joy = analogRead(A0);
            ///!joy address == 0
            EEPROM.write(0, joy / 10);
            joy = 0;
            a = 0;b = 0;c = 0;d = 0;e = 0;
          }}}}}
  ///readj
  if (a == 114) {
    if (b == 101) {
      if (c == 97) {
        if (d == 100) {
          if (e == 106) {
            Serial.println("saved joy state is:");
            Serial.println(EEPROM.read(0) * 10);
            EEPROM.write(0, neutral);
            a = 0;b = 0;c = 0;d = 0;e = 0;
          }}}}}
  delay(1000);
}
