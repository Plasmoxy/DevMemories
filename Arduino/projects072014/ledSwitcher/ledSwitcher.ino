int button1State = 0;
int button2State = 0;

void setup() {
  pinMode(13, OUTPUT);
  pinMode(2, INPUT);
  pinMode(3, OUTPUT);
  pinMode(4, INPUT);
}

void loop() {
  button1State = digitalRead(2);
  button2State = digitalRead(4);
  
  if (button1State == 1) {
    digitalWrite(3, HIGH);
  }
  if (button2State == 1) {
    digitalWrite(3, LOW);
  }
  
  delay(10);
}
