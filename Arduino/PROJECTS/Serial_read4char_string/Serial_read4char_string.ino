#include <EEPROM.h>
int a;int b;int c;int d;int e;
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
  Serial.print(a);Serial.print(" ");
  Serial.print(b);Serial.print(" ");
  Serial.print(c);Serial.print(" ");
  Serial.print(d);Serial.print(" ");
  Serial.print(e);Serial.print(" ");
  Serial.println();
  if (a == 115) {
    if (b == 101) {
      if (c == 98) {
        if (d == 111) {
          Serial.println();
          Serial.println("heslo je potvrede =) sebo");
          Serial.println();
        }}}}
  delay(1000);
}
