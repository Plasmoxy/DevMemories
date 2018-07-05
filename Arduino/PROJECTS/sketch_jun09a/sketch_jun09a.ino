void setup () {
  Serial.begin(9600);
  pinMode(0, OUTPUT);
  pinMode(2, OUTPUT);
}
void loop () {
  digitalWrite(2, HIGH);
  delay(1000);
  digitalWrite(2, LOW);
  digitalWrite(0, HIGH);
  delay(1000);
  digitalWrite(0, LOW);
}
