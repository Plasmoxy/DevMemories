/* USING EXTERNAL EDITOR */
/* Copyright Sebohacker 2014 */
#define dw digitalWrite
#define dl delay
#define pm pinMode
#include <EEPROM.h>
byte values[256];
String command;
byte address, value, readAddress;
void setup()
{
  Serial.begin(9600);
  for (int i = 0; i != 255; i++)
  {
	values[i] = 0;
  }
}

void loop()
{
  value, address, readAddress = 0;
  
  while (Serial.available() > 0)
  {
    command = Serial.readStringUntil(':');
	if (command == "r")
	{
		readAddress = Serial.readStringUntil(';').toByte;
		Serial.println((String)readAddress + ":" + values[readAddress]);
	}
	if (command == "w")
	{
		address = (byte)Serial.readStringUntil(':');
		value = (byte)Serial.readStringUntil(';');
		values[address] = value;
	}
  }
  
  delay(1);
  
}
