#include <EEPROM.h>
void setup () {Serial.begin(9600);
  delay(1000);
  int aqvalue = analogRead(0) / 4;
  Serial.println(aqvalue * 4, DEC);
  EEPROM.write(0, aqvalue);
}
void loop () {}
  
