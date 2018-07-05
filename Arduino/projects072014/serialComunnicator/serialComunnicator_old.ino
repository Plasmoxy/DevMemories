String serialInput();

void setup()
{
  Serial.begin(9600);
  
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(2, OUTPUT);
  pinMode(1, OUTPUT);
  pinMode(0, OUTPUT);
  
}

void loop()
{
  serialInput = "";
  
  while (Serial.available() > 0)
  {
    serialInput = Serial.readString();
  }
  
  
  if (serialInput.charAt(0) == '1')
  {
    digitalWrite(0, HIGH);
  } else if (serialInput.charAt(0) == '0')
  {
    digitalWrite(0, LOW);
  }
  if (serialInput[1] == '1')
  {
    digitalWrite(1, HIGH);
  } else if (serialInput.charAt(0) == '0')
  {
    digitalWrite(1, LOW);
  }
  if (serialInput[2] == '1')
  {
    digitalWrite(2, HIGH);
  } else if (serialInput[2] == '0')
  {
    digitalWrite(2, LOW);
  }
  if (serialInput[3] == '1')
  {
    digitalWrite(3, HIGH);
  } else if (serialInput[3] == '0')
  {
    digitalWrite(3, LOW);
  }
  if (serialInput[4] == '1')
  {
    digitalWrite(4, HIGH);
  } else if (serialInput[4] == '0')
  {
    digitalWrite(4, LOW);
  }
  if (serialInput[5] == '1')
  {
    digitalWrite(5, HIGH);
  } else if (serialInput[5] == '0')
  {
    digitalWrite(5, LOW);
  }
  if (serialInput[6] == '1')
  {
    digitalWrite(6, HIGH);
  } else if (serialInput[6] == '0')
  {
    digitalWrite(6, LOW);
  }
  if (serialInput[7] == '1')
  {
    digitalWrite(7, HIGH);
  } else if (serialInput[7] == '0')
  {
    digitalWrite(7, LOW);
  }
  if (serialInput[8] == '1')
  {
    digitalWrite(8, HIGH);
  } else if (serialInput[8] == '0')
  {
    digitalWrite(8, LOW);
  }
  if (serialInput[9] == '1')
  {
    digitalWrite(9, HIGH);
  } else if (serialInput[9] == '0')
  {
    digitalWrite(9, LOW);
  }
  if (serialInput[10] == '1')
  {
    digitalWrite(10, HIGH);
  } else if (serialInput[10] == '0')
  {
    digitalWrite(10, LOW);
  }
  if (serialInput[11] == '1')
  {
    digitalWrite(11, HIGH);
  } else if (serialInput[11] == '0')
  {
    digitalWrite(11, LOW);
  }
  if (serialInput[12] == '1')
  {
    digitalWrite(12, HIGH);
  } else if (serialInput[12] == '0')
  {
    digitalWrite(12, LOW);
  }
  if (serialInput[13] == '1')
  {
    digitalWrite(13, HIGH);
  } else if (serialInput[13] == '0')
  {
    digitalWrite(13, LOW);
  }
  
}
    
