/**
 * Blink
 * Turns on an LED on for one second,
 * then off for one second, repeatedly.
 */
#include "Arduino.h"
#include "avr/io.h"
#include "furik.h"

void setup()
{
  Serial.begin(9600);

  sb(db, 5);

  long start = 0, end = 0;
  start = micros();

  digitalWrite(13, 1);
  delay(1);
  digitalWrite(13, 0);
  delay(1);
  digitalWrite(13, 1);
  delay(1);
  digitalWrite(13, 0);
  delay(1);
  digitalWrite(13, 1);
  delay(1);
  digitalWrite(13, 0);
  delay(1);
  digitalWrite(13, 1);
  delay(1);
  digitalWrite(13, 0);
  delay(1);
  digitalWrite(13, 1);
  delay(1);
  digitalWrite(13, 0);
  delay(1);

  end = micros();

  Serial.println("time : " + (String)(end - start));

}

void loop()
{
}
