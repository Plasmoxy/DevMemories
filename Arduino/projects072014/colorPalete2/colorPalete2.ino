int color = 1;

int buttonColorUpState = 0;
int buttonColorDownState = 0;
int buttonBrightUpState = 0;
int buttonBrightDownState = 0;

void setup()
{
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(2, INPUT);
  pinMode(4, INPUT);
  pinMode(6, INPUT);
  pinMode(5, INPUT);
}
void loop()
{
  buttonColorUpState = digitalRead(4);
  buttonColorDownState = digitalRead(2);
  buttonBrightUpState = digitalRead(5);
  buttonBrightDownState = digitalRead(6);
  
  if (color < 1) color = 1;
  if (color > 3) color = 3;
  
  if (buttonColorUpState == 1)
  {
    color = color + 1;
    while (buttonColorUpState != 0)
    {
      buttonColorUpState = digitalRead(4);
    }
  }
  if (buttonColorDownState == 1)
  {
    color = color - 1;
    while (buttonColorDownState != 0)
    {
      buttonColorDownState = digitalRead(2);
    }
  }
  
  if (color == 1)
  {
    digitalWrite(7, HIGH);
    digitalWrite(8, LOW);
    digitalWrite(12, LOW);
    
    if (buttonBrightState
}
