int ledPin = 3;
int potPin = A0;
int potState;
void setup()
{
  Serial.begin(9600);
  pinMode(ledPin, OUTPUT);
}

void loop()
{
  potState = analogRead(potPin);
  
  analogWrite(ledPin, potState / 4);
  
  Serial.println(potState);
  
  delay(10);
}
