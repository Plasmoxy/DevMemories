#include <SoftwareSerial.h>

SoftwareSerial serialportA(2, 3);

byte buttonUp = 6, buttonDown = 7, buttonLeft = 8, buttonRight = 5;
byte buttonUpState, buttonDownState, buttonLeftState, buttonRightState = 0;

void setup()
{
  pinMode(buttonUp, 0);
  pinMode(buttonDown, 0);
  pinMode(buttonLeft, 0);
  pinMode(buttonRight, 0);
  serialportA.begin(9600);
}

void loop()
{
  buttonUpState = digitalRead(buttonUp);
  buttonDownState = digitalRead(buttonDown);
  buttonLeftState = digitalRead(buttonLeft);
  buttonRightState = digitalRead(buttonRight);
  
  serialportA.println((String)buttonUpState + (String)buttonDownState + (String)buttonLeftState + (String)buttonRightState + ";");
  
  delay(5);
}
