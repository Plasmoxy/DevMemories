#include "pitches.h"

#define dPadUp 7
#define dPadDown 6
#define dPadRight 8
#define dPadLeft 5
#define sp 9


int dPadUpState = 0;
int dPadDownState = 0;
int dPadRightState = 0;
int dPadLeftState = 0;
void setup()
{
  Serial.begin(9600);
  pinMode(dPadUp, INPUT);
  pinMode(dPadDown, INPUT);
  pinMode(dPadRight, INPUT);
  pinMode(dPadLeft, INPUT);
  
}

void loop()
{
  dPadUpState = digitalRead(dPadUp);
  dPadDownState = digitalRead(dPadDown);
  dPadRightState = digitalRead(dPadRight);
  dPadLeftState = digitalRead(dPadLeft);
  
  Serial.println((String)dPadUpState + (String)dPadDownState + (String)dPadRightState + (String)dPadLeftState);
  
  if (dPadUpState == 1)
  {
    tone(sp, NOTE_C4);
    while (dPadUpState != 0)
    {
      dPadUpState = digitalRead(dPadUp);
    }
    noTone(sp);
  }
  
  if (dPadDownState == 1)
  {
    tone(sp, NOTE_E4);
    while (dPadDownState != 0)
    {
      dPadDownState = digitalRead(dPadDown);
    }
    noTone(sp);
  }
  
  if (dPadRightState == 1)
  {
    tone(sp, NOTE_D4);
    while (dPadRightState != 0)
    {
      dPadRightState = digitalRead(dPadRight);
    }
    noTone(sp);
  }
  
  if (dPadLeftState == 1)
  {
    tone(sp, NOTE_F4);
    while (dPadLeftState != 0)
    {
      dPadLeftState = digitalRead(dPadLeft);
    }
    noTone(sp);
  }
  
  delay(1);
}
