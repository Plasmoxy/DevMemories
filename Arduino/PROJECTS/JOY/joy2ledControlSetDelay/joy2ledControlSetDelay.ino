int a;
void setup () {
  pinMode(13, OUTPUT);
  pinMode(10, OUTPUT);
  Serial.begin(9600);
}

void loop () {
  a = analogRead(A0);
  digitalWrite(10, LOW);
  digitalWrite(13, HIGH);
  delay(a);
  digitalWrite(13, LOW);
  digitalWrite(10, HIGH);
  delay(a);
}
