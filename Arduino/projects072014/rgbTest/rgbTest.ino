void setup()
{
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);
}

void rgbled(int redLedPin, int greenLedPin, int blueLedPin, byte red, byte green, byte blue)
{
  analogWrite(redLedPin, red);
  analogWrite(greenLedPin, green);
  analogWrite(blueLedPin, blue);
}

void loop()
{
  delay(1000);
  rgbled(11, 9, 10, 255, 0, 0);
  delay(1000);
  rgbled(11, 9, 10, 0, 255, 0);
  delay(1000);
  rgbled(11, 9, 10, 0, 0, 255);
  delay(1000);
  rgbled(11, 9, 10, 255, 0, 255);
}
