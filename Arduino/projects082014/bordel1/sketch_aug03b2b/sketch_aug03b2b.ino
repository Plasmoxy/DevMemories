/* USING EXTERNAL EDITOR */
/* Copyright Sebohacker 2014 */
#define dw digitalWrite
#define dl delay
#define pm pinMode
#include <SoftwareSerial.h>

SoftwareSerial com1(9, 10);
int a = 0;

void setup()
{
  Serial.begin(9600);
  com1.begin(9600);
}

void loop()
{
  a = analogRead(A0);
  Serial.println(a);
  if (a > -1 && a < 146) com1.print("1000000;");
  if (a > 146 && a < 292) com1.print("0100000;");
  if (a > 292 && a < 438) com1.print("0010000;");
  if (a > 438 && a < 584) com1.print("0001000;");
  if (a > 584 && a < 730) com1.print("0000100;");
  if (a > 730 && a < 876) com1.print("0000010;");
  if (a > 876 && a < 1025) com1.print("0000001;");
  delay(1);
}
