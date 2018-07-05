/* USING EXTERNAL EDITOR */
/* Copyright Sebohacker 2014 */
#define dw digitalWrite
#define dl delay
#define pm pinMode

#include <SoftwareSerial.h>

SoftwareSerial com1(9, 10);
byte a = 2, b = 3, c = 4, d = 5, e = 6, f = 7, g = 8;
String values = "0000000";

void setup()
{
  pm(a, 1);
  pm(b, 1);
  pm(c, 1);
  pm(d, 1);
  pm(e, 1);
  pm(f, 1);
  pm(g, 1);
  Serial.begin(9600);
  com1.begin(9600);
  com1.listen();
}

void loop()
{
  
  while(com1.available() > 0)
  {
	values = com1.readStringUntil(';');
  }
  if (values.charAt(0) == '0') dw(a, 0); else if (values.charAt(0) == '1') dw(a, 1);
  if (values.charAt(1) == '0') dw(b, 0); else if (values.charAt(1) == '1') dw(b, 1);
  if (values.charAt(2) == '0') dw(c, 0); else if (values.charAt(2) == '1') dw(c, 1);
  if (values.charAt(3) == '0') dw(d, 0); else if (values.charAt(3) == '1') dw(d, 1);
  if (values.charAt(4) == '0') dw(e, 0); else if (values.charAt(4) == '1') dw(e, 1);
  if (values.charAt(5) == '0') dw(f, 0); else if (values.charAt(5) == '1') dw(f, 1);
  if (values.charAt(6) == '0') dw(g, 0); else if (values.charAt(6) == '1') dw(g, 1);
  delay(1);
}
