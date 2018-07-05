#define dPadUp 7
#define dPadDown 6
#define dPadRight 8
#define dPadLeft 5


int dPadUpState = 0;
int dPadDownState = 0;
int dPadRightState = 0;
int dPadLeftState = 0;
void setup()
{
  Serial.begin(9600);
  pinMode(dPadUp, INPUT);
  pinMode(dPadDown, INPUT);
  pinMode(dPadRight, INPUT);
  pinMode(dPadLeft, INPUT);
  
}

void loop()
{
  dPadUpState = digitalRead(dPadUp);
  dPadDownState = digitalRead(dPadDown);
  dPadRightState = digitalRead(dPadRight);
  dPadLeftState = digitalRead(dPadLeft);
  
  Serial.println((String)dPadUpState + (String)dPadDownState + (String)dPadRightState + (String)dPadLeftState);
  
  delay(100);
}
