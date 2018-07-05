#include <CapacitiveSensor.h>

// sebohacker@gmail.com

CapacitiveSensor cs1 = CapacitiveSensor(12, 11);
CapacitiveSensor cs2 = CapacitiveSensor(12, 10);
CapacitiveSensor cs3 = CapacitiveSensor(12, 9);

void setup()
{
  Serial.begin(115200);
}

void loop()
{
  long cs1read = cs1.capacitiveSensor(30);
  long cs2read = cs2.capacitiveSensor(30);
  long cs3read = cs3.capacitiveSensor(30);
  String serOut = "000";
  
  if (cs1read > 100) {
    serOut.setCharAt(0, '1');
  } else {
    serOut.setCharAt(0, '0');
  }
  
  if (cs2read > 100) {
    serOut.setCharAt(1, '1');
  } else {
    serOut.setCharAt(1, '0');
  }
  
  if (cs3read > 100) {
    serOut.setCharAt(2, '1');
  } else {
    serOut.setCharAt(2, '0');
  }
  
  while (Serial.available() > 0) {
    if (Serial.readStringUntil(';') == "S") {
      Serial.print(serOut);
    }
  }
  
}
