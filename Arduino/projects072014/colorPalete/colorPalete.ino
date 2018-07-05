// nechce fungovat / not working


int redLedPin = 11;
int greenLedPin = 9;
int blueLedPin = 10;
int modeLedPin = 3;

int color1LedPin = 7;
int color2LedPin = 8;
int color3LedPin = 12;

int redLedValue = 0;
int greenLedValue = 0;
int blueLedValue = 0;

int buttonUpPin = 5;
int buttonDownPin = 6;
int buttonMode1Pin = 2;
int buttonMode2Pin = 4;

int buttonUpState = 0;
int buttonDownState = 0;
int buttonMode1State = 0;
int buttonMode2State = 0;

String mode = "color";
int color = 1;

void rgbled(int redLedPin, int greenLedPin, int blueLedPin, byte red, byte green, byte blue)
{
  analogWrite(redLedPin, red);
  analogWrite(greenLedPin, green);
  analogWrite(blueLedPin, blue);
}

void setup()
{
  pinMode(redLedPin, OUTPUT);
  pinMode(greenLedPin, OUTPUT);
  pinMode(blueLedPin, OUTPUT);
  
  pinMode(buttonUpPin, INPUT);
  pinMode(buttonDownPin, INPUT);
  pinMode(buttonMode1Pin, INPUT);
  pinMode(buttonMode2Pin, INPUT);
  
}

void loop()
{
  buttonMode1State = digitalRead(buttonMode1Pin);
  buttonMode2State = digitalRead(buttonMode2Pin);
  buttonUpState = digitalRead(buttonUpPin);
  buttonDownState = digitalRead(buttonDownPin);
  
  if (buttonMode1State == 1)
  {
    mode = "color";
    while (buttonMode1State != 0)
    {
      buttonMode1State = digitalRead(buttonMode1Pin);
    }
  }
  if (buttonMode2State == 1)
  {
    mode = "bright";
    while (buttonMode2State != 0)
    {
      buttonMode2State = digitalRead(buttonMode2Pin);
    }
  }
  
  if (mode == "color")
  {
    digitalWrite(modeLedPin, LOW);
    if (buttonUpState == 1)
    {
      color = color + 1;
      while (buttonUpState != 0)
      {
        buttonUpState = digitalRead(buttonUpPin);
      }
    }
    if (buttonDownState == 1)
    {
      color = color - 1;
      while (buttonDownState != 0)
      {
        buttonDownState = digitalRead(buttonDownPin);
      }
    }
    
    if (color < 1) color = 1;
    if (color > 3) color = 3;
    
    if (color == 1)
    {
      digitalWrite(color1LedPin, HIGH);
      digitalWrite(color2LedPin, LOW);
      digitalWrite(color3LedPin, LOW);
    }
    if (color == 2)
    {
      digitalWrite(color1LedPin, LOW);
      digitalWrite(color2LedPin, HIGH);
      digitalWrite(color3LedPin, LOW);
    }
    if (color == 3)
    {
      digitalWrite(color1LedPin, LOW);
      digitalWrite(color2LedPin, LOW);
      digitalWrite(color3LedPin, HIGH);
    }
  } // end mode color
  
  if (mode == "bright")
  {
    digitalWrite(modeLedPin, HIGH);
    
    if (color == 1)
    {
      if (buttonUpState == 1)
      {
        redLedValue = redLedValue + 51;
        while (buttonUpState != 0)
        {
          buttonUpState = digitalRead(buttonUpPin);
        }
      }
      if (buttonDownState == 1)
      {
        redLedValue = redLedValue - 51;
        while (buttonDownState != 0)
        {
          buttonDownState = digitalRead(buttonDownPin);
        }
      }
    }
    if (color == 2)
    {
      if (buttonUpState == 1)
      {
        greenLedValue = greenLedValue + 51;
        while (buttonUpState != 0)
        {
          buttonUpState = digitalRead(buttonUpPin);
        }
      }
      if (buttonDownState == 1)
      {
        greenLedValue = greenLedValue - 51;
        while (buttonDownState != 0)
        {
          buttonDownState = digitalRead(buttonDownPin);
        }
      }
    }
    if (color == 3)
    {
      if (buttonUpState == 1)
      {
        blueLedValue = blueLedValue + 51;
        while (buttonUpState != 0)
        {
          buttonUpState = digitalRead(buttonUpPin);
        }
      }
      if (buttonDownState == 1)
      {
        blueLedValue = blueLedValue - 51;
        while (buttonDownState != 0)
        {
          buttonDownState = digitalRead(buttonDownPin);
        }
      }
    }
  }
  
  
  rgbled(redLedPin, greenLedPin, blueLedPin, redLedValue, greenLedValue, blueLedValue);
    
}
