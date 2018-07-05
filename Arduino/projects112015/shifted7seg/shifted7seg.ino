#include "_7seg.h"

#define reg_clear 6 // NEGATIVE !
#define reg_clock 7
#define reg_latch 8
#define reg_data 9

byte numbers[] = {_7seg_0, _7seg_1, _7seg_2, _7seg_3, _7seg_4, _7seg_5, _7seg_6, _7seg_7, _7seg_8, _7seg_9};

byte digits[4] = {2, 3, 4, 5};

int delay0 = 7000;

void r_data(int value) {
  digitalWrite(reg_data, value);
}

void r_latch() {
  digitalWrite(reg_latch, 1);
  digitalWrite(reg_latch, 0);
}

void r_clock(int times) {
  for (int i = 1; i <= times; i++) {
    digitalWrite(reg_clock, 1);
    digitalWrite(reg_clock, 0);
  }
}

void r_clear() {
  digitalWrite(reg_clear, 0);
  digitalWrite(reg_clear, 1);
}

void r_update(byte what) {
  shiftOut(reg_data, reg_clock, LSBFIRST, what);
  r_latch();
}

void clearOut() {
  for (int i=0; i<4; i++) {
    digitalWrite(digits[i], LOW);
    r_update(0);
    delayMicroseconds(delay0);
    digitalWrite(digits[i], HIGH);
  }
}

void setup() {
  pinMode(reg_clear, OUTPUT);
  pinMode(reg_clock, OUTPUT);
  pinMode(reg_latch, OUTPUT);
  pinMode(reg_data, OUTPUT);
  digitalWrite(reg_clear, 1); // cause reg_clear is negative

  for (int i = 0; i<4; i++) {
    pinMode(digits[i], OUTPUT);
    digitalWrite(digits[i], HIGH);
  }
  ///// DONE INIT
}

void loop() {

  digitalWrite(digits[0], LOW);
  r_update(numbers[1]);
  delayMicroseconds(delay0);
  digitalWrite(digits[0], HIGH);

  //
  digitalWrite(digits[1], LOW);
  r_update(numbers[2]);
  delayMicroseconds(delay0);
  digitalWrite(digits[1], HIGH);

  //
  digitalWrite(digits[2], LOW);
  r_update(numbers[3]);
  delayMicroseconds(delay0);
  digitalWrite(digits[2], HIGH);

  //
  digitalWrite(digits[3], LOW);
  r_update(numbers[4]);
  delayMicroseconds(delay0);
  digitalWrite(digits[3], HIGH);
  
}
