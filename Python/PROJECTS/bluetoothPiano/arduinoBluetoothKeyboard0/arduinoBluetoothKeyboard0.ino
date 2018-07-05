//#include <SoftwareSerial.h>
#define btn0 4
#define btn1 5
#define btn2 6
#define btn3 7

//SoftwareSerial blue(2, 3);
byte buttons[] = {0xFF, 0xFF, 0xFF, 0xFF};

void setup() {
  pinMode(btn0, 0);
  pinMode(btn1, 0);
  pinMode(btn2, 0);
  pinMode(btn3, 0);
  Serial.begin(9600);
}

void loop() {
  if (Serial.available()) {
    if (Serial.read() == 0x99) {
      if (digitalRead(btn0) == 1) buttons[0] = 0x0A;
      if (digitalRead(btn0) == 0) buttons[0] = 0x0B;
      if (digitalRead(btn1) == 1) buttons[1] = 0x0A;
      if (digitalRead(btn1) == 0) buttons[1] = 0x0B;
      if (digitalRead(btn2) == 1) buttons[2] = 0x0A;
      if (digitalRead(btn2) == 0) buttons[2] = 0x0B;
      if (digitalRead(btn3) == 1) buttons[3] = 0x0A;
      if (digitalRead(btn3) == 0) buttons[3] = 0x0B;
      Serial.write(buttons, sizeof(buttons));
    }
  }
  

}
