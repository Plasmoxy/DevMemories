
long readSensor();

void setup() {
  // put your setup code here, to run once:
  pinMode(5, OUTPUT);
  pinMode(6, INPUT);

  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:

  if (readSensor(5, 6, 1000) > 3) {
    Serial.println("1");
  } else {
    Serial.println("0");
  }
  
}

long readSensor(int sendPin, int receivePin, long sendTime) {
  long cas = 0;
  digitalWrite(sendPin, 1);
  delayMicroseconds(sendTime);
  digitalWrite(sendPin, 0);
  while (digitalRead(receivePin) != 0) {
    cas++;
  }
  return cas;
}

