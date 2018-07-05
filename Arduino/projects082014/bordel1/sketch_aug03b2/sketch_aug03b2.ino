/* USING EXTERNAL EDITOR */
/* Copyright Sebohacker 2014 */
#define dw digitalWrite
#define dl delay
#define pm pinMode
#include <SoftwareSerial.h>

SoftwareSerial com1(9, 10);

void setup()
{
  com1.begin(9600);
}

void loop()
{
  com1.print("1000000;");
  dl(50);
  com1.print("0100000;");
  dl(50);
  com1.print("0010000;");
  dl(50);
  com1.print("0001000;");
  dl(50);
  com1.print("0000100;");
  dl(50);
  com1.print("0000010;");
  dl(50);
  com1.print("0000001;");
  dl(50);
  com1.print("0000010;");
  dl(50);
  com1.print("0000100;");
  dl(50);
  com1.print("0001000;");
  dl(50);
  com1.print("0010000;");
  dl(50);
  com1.print("0100000;");
  dl(50);
  com1.print("1000000;");
  dl(50);
}
