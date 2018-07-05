#include "pitches.h"
int sp = 7;
int incomingByte;

void setup() {
  Serial.begin(9600);
  pinMode(sp, OUTPUT);
}

void loop() {
  incomingByte = Serial.read();
  //if (incomingByte != 'a' && incomingByte != 's' && incomingByte != 'd' && incomingByte != 'f' && incomingByte != 'g' && incomingByte != 'h' && incomingByte != 'j' && incomingByte != 'k') {
   // noTone(sp);
  //}
  if (incomingByte == 'a') {
    tone(sp, NOTE_C3);
  }
  if (incomingByte == 's') {
    tone(sp, NOTE_D3);
  }
  if (incomingByte == 'd') {
    tone(sp, NOTE_E3);
  }
  if (incomingByte == 'f') {
    tone(sp, NOTE_F3);
  }
  if (incomingByte == 'g') {
    tone(sp, NOTE_G3);
  }
  if (incomingByte == 'h') {
    tone(sp, NOTE_A3);
  }
  if (incomingByte == 'j') {
    tone(sp, NOTE_B3);
  }
  if (incomingByte == 'k') {
    tone(sp, NOTE_C4);
  }
  if (incomingByte == ' ') {
    noTone(sp);
  }
}
