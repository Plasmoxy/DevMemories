
String serialInput = "";
int DRreading;

int _pinmode = 0;


void setup()
{
  Serial.begin(57600);
}
void loop()
{
  serialInput = "";
  
  while (Serial.available() > 0)
  {
    serialInput = Serial.readStringUntil(';');
  }
  
  if (serialInput.charAt(0) == 'P' && serialInput.charAt(1) == 'M') // command ------------------------------------------ PINMODE
  {
    //pattern : "PM<number (2 chars) of pin //~like 00 or 01 ...//><pin mode (1 or 0 for OUTPUT or INPUT)>"
    //sample : if (serialInput.charAt(2) == '' && serialInput.charAt(3) == '') { pinMode(, ); }
    if (serialInput.charAt(4) == '1') // if pinmode is OUTPUT
    {
      _pinmode = 1;
    }
    if (serialInput.charAt(4) == '0')
    {
      _pinmode = 0;
    }
  } // end of pinmode
  
  
  if (serialInput.charAt(0) == 'D' && serialInput.charAt(1) == 'W') // command ---------------------------------------------------- DIGITALWRITE
  {
    //pattern :
    //sample : if (serialInput.charAt(2) == '' && serialInput.charAt(3) == '') { digitalWrite(, 1); }  
    if (serialInput.charAt(4) == '1') // if digitalWrite is HIGH
    {
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '0') { digitalWrite(0, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '1') { digitalWrite(1, 1); }  // 0, 1
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '2') { digitalWrite(2, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '3') { digitalWrite(3, 1); }  // 2, 3
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '4') { digitalWrite(4, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '5') { digitalWrite(5, 1); }  // 4, 5
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '6') { digitalWrite(6, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '7') { digitalWrite(7, 1); }  // 6, 7
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '8') { digitalWrite(8, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '9') { digitalWrite(9, 1); }  // 8, 9
      if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '0') { digitalWrite(10, 1); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '1') { digitalWrite(11, 1); } // 10, 11
      if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '2') { digitalWrite(12, 1); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '3') { digitalWrite(13, 1); } // 12, 13
    }
    if (serialInput.charAt(4) == '0') // if digitalWrite is LOW
    {
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '0') { digitalWrite(0, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '1') { digitalWrite(1, 0); }  // 0, 1
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '2') { digitalWrite(2, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '3') { digitalWrite(3, 0); }  // 2, 3
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '4') { digitalWrite(4, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '5') { digitalWrite(5, 0); }  // 4, 5
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '6') { digitalWrite(6, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '7') { digitalWrite(7, 0); }  // 6, 7
      if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '8') { digitalWrite(8, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '9') { digitalWrite(9, 0); }  // 8, 9
      if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '0') { digitalWrite(10, 0); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '1') { digitalWrite(11, 0); } // 10, 11
      if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '2') { digitalWrite(12, 0); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '3') { digitalWrite(13, 0); } // 12, 13
    }
  }
  if (serialInput.charAt(0) == 'D' && serialInput.charAt(1) == 'R')
  {
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '0') { delayMicroseconds(1);Serial.print(digitalRead(0)); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '1') { delayMicroseconds(1);Serial.print(digitalRead(1)); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '2') { delayMicroseconds(1);Serial.print(digitalRead(2)); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '3') { delayMicroseconds(1);Serial.print(digitalRead(3)); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '4') { delayMicroseconds(1);Serial.print(digitalRead(4)); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '5') { delayMicroseconds(1);Serial.print(digitalRead(5)); }  
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '6') { delayMicroseconds(1);Serial.print(digitalRead(6)); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '7') { delayMicroseconds(1);Serial.print(digitalRead(7)); }  
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '8') { delayMicroseconds(1);Serial.print(digitalRead(8)); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '9') { delayMicroseconds(1);Serial.print(digitalRead(9)); }  
    if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '0') { delayMicroseconds(1);Serial.print(digitalRead(10)); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '1') { delayMicroseconds(1);Serial.print(digitalRead(11)); }  
    if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '2') { delayMicroseconds(1);Serial.print(digitalRead(12)); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '3') { delayMicroseconds(1);Serial.print(digitalRead(13)); }  
  }
  
  
  
  // ----------------------------------------- SUP --------------------------------------
  
  
  if (_pinmode == 1) {
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '0') { pinMode(0, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '1') { pinMode(1, 1); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '2') { pinMode(2, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '3') { pinMode(3, 1); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '4') { pinMode(4, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '5') { pinMode(5, 1); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '6') { pinMode(6, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '7') { pinMode(7, 1); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '8') { pinMode(8, 1); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '9') { pinMode(9, 1); }
    if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '0') { pinMode(10, 1); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '1') { pinMode(11, 1); }
    if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '2') { pinMode(12, 1); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '3') { pinMode(13, 1); }
  }
  
  if (_pinmode == 0) {
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '0') { pinMode(0, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '1') { pinMode(1, 0); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '2') { pinMode(2, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '3') { pinMode(3, 0); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '4') { pinMode(4, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '5') { pinMode(5, 0); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '6') { pinMode(6, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '7') { pinMode(7, 0); }
    if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '8') { pinMode(8, 0); }  if (serialInput.charAt(2) == '0' && serialInput.charAt(3) == '9') { pinMode(9, 0); }
    if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '0') { pinMode(10, 0); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '1') { pinMode(11, 0); }
    if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '2') { pinMode(12, 0); }  if (serialInput.charAt(2) == '1' && serialInput.charAt(3) == '3') { pinMode(13, 0); }
  }
}

