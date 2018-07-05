int a;
void setup () {
  pinMode(13, OUTPUT);
  pinMode(10, OUTPUT);
  Serial.begin(9600);
}

void loop () {
  a = analogRead(A0);
  if (a > 1000) {
    digitalWrite(10, HIGH);
  } else {
    digitalWrite(10, LOW);
  }
  if (a < 30) {
    digitalWrite(13, HIGH);
  } else {
    digitalWrite(13, LOW);
  }
  delay(1);
}
