#include "pitches.h"
int speaker = 12;

void xtone(int tonePin,int toneNote,int toneDuration) {
  tone(tonePin, toneNote);
  delay(toneDuration);
  noTone(tonePin);
}

void setup() {
  xtone(speaker, NOTE_C4, 500);
  xtone(speaker, NOTE_D4, 500);
  xtone(speaker, NOTE_E4, 500);
  delay(500);
  xtone(speaker, NOTE_F4, 500);
  delay(500);
  xtone(speaker, NOTE_F4, 250);
  delay(250);
  xtone(speaker, NOTE_F4, 250);
  delay(250);
  xtone(speaker, NOTE_F4, 500);
  xtone(speaker, NOTE_E4, 500);
  xtone(speaker, NOTE_D4, 500);
  delay(500);
  xtone(speaker, NOTE_E4, 500);
  delay(500);
  xtone(speaker, NOTE_E4, 250);
  delay(250);
  xtone(speaker, NOTE_E4, 250);
  delay(250);
  xtone(speaker, NOTE_E4, 500);
  xtone(speaker, NOTE_D4, 500);
  xtone(speaker, NOTE_C4, 500);
  delay(500);
  xtone(speaker, NOTE_D4, 500);
  delay(500);
  xtone(speaker, NOTE_D4, 250);
  delay(250);
  xtone(speaker, NOTE_D4, 250);
  delay(250);
  xtone(speaker, NOTE_D4, 500);
  xtone(speaker, NOTE_E4, 500);
  xtone(speaker, NOTE_D4, 500);
  delay(500);
  xtone(speaker, NOTE_C4, 500);
  delay(500);
  xtone(speaker, NOTE_C4, 250);
  delay(250);
  xtone(speaker, NOTE_C4, 250);
  delay(250);
}

void loop() {
  
}


