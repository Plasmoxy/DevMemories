int button1pin = 2;
int button2pin = 4;
int led1pin = 3;

int button1State = 0;
int button2State = 0;

int ledBrightness = 0;


void setup()
{
  pinMode(button1pin, INPUT);
  pinMode(button2pin, INPUT);
  pinMode(led1pin, OUTPUT);
}
void loop()
{
  button1State = digitalRead(button1pin);
  button2State = digitalRead(button2pin);
  
  if (ledBrightness < 0) ledBrightness = 0;
  if (ledBrightness > 255) ledBrightness = 255;
  
  if (button2State == 1)
  {
    ledBrightness += 51;
    while (button2State != 0)
    {
      button2State = digitalRead(button2pin);
    }
  }
  if (button1State == 1)
  {
    ledBrightness -= 51;
    while (button1State != 0)
    {
      button1State = digitalRead(button1pin);
    }
  }
  
  analogWrite(led1pin, ledBrightness);
  
  delay(1);
}
