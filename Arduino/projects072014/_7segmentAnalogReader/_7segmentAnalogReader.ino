int ledPin = 3;
int potPin = A0;
int potState;

int d1_a = 12;
int d1_b = 5;
int d1_c = 11;
int d1_d = 6;
int d1_e = 8;
int d1_f = 9;
int d1_g = 7;
int d1_dp = 10;



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

void clear_d1() {
  digitalWrite(d1_a, LOW);
  digitalWrite(d1_b, LOW);
  digitalWrite(d1_c, LOW);
  digitalWrite(d1_d, LOW);
  digitalWrite(d1_e, LOW);
  digitalWrite(d1_f, LOW);
  digitalWrite(d1_g, LOW);
  digitalWrite(d1_dp, LOW);
}

void loop()
{
  clear_d1();
  potState = analogRead(potPin);
  
  Serial.println(potState);
  
  if (-1 < potState && potState <= 102)
  {
    // write 0
    digitalWrite(d1_a, HIGH);
    digitalWrite(d1_b, HIGH);
    digitalWrite(d1_c, HIGH);
    digitalWrite(d1_e, HIGH);
    digitalWrite(d1_f, HIGH);
    digitalWrite(d1_g, HIGH);
  }
  if (102 < potState && potState <= 204)
  {
    //write 1
    digitalWrite(d1_c, HIGH);
    digitalWrite(d1_f, HIGH);
  }
  if (204 < potState && potState <= 306)
  {
    //write 2
    digitalWrite(d1_a, HIGH);
    digitalWrite(d1_c, HIGH);
    digitalWrite(d1_d, HIGH);
    digitalWrite(d1_e, HIGH);
    digitalWrite(d1_g, HIGH);
  }
  if (306 < potState && potState <= 408)
  {
    //write 3
    digitalWrite(d1_a, HIGH);
    digitalWrite(d1_c, HIGH);
    digitalWrite(d1_d, HIGH);
    digitalWrite(d1_f, HIGH);
    digitalWrite(d1_g, HIGH);
  }
  if (408 < potState && potState <= 510)
  {
    //write 4
    digitalWrite(d1_b, HIGH);
    digitalWrite(d1_c, HIGH);
    digitalWrite(d1_d, HIGH);
    digitalWrite(d1_f, HIGH);
  }
  if (510 < potState && potState <= 612)
  {
    //write 5
    digitalWrite(d1_a, HIGH);
    digitalWrite(d1_b, HIGH);
    digitalWrite(d1_d, HIGH);
    digitalWrite(d1_f, HIGH);
    digitalWrite(d1_g, HIGH);
  }
  if (612 < potState && potState <= 714)
  {
    //write 6
    digitalWrite(d1_a, HIGH);
    digitalWrite(d1_b, HIGH);
    digitalWrite(d1_d, HIGH);
    digitalWrite(d1_e, HIGH);
    digitalWrite(d1_f, HIGH);
    digitalWrite(d1_g, HIGH);
  }
  if (714 < potState && potState <= 816)
  {
    //write 7
    digitalWrite(d1_a, HIGH);
    digitalWrite(d1_b, HIGH);
    digitalWrite(d1_c, HIGH);
    digitalWrite(d1_f, HIGH);
  }
  if (816 < potState && potState <= 918)
  {
    //write 8
    digitalWrite(d1_a, HIGH);
    digitalWrite(d1_b, HIGH);
    digitalWrite(d1_c, HIGH);
    digitalWrite(d1_d, HIGH);
    digitalWrite(d1_e, HIGH);
    digitalWrite(d1_f, HIGH);
    digitalWrite(d1_g, HIGH);
  }
  if (918 < potState && potState <= 1024) // (1020)
  {
    //write 9
    digitalWrite(d1_a, HIGH);
    digitalWrite(d1_b, HIGH);
    digitalWrite(d1_c, HIGH);
    digitalWrite(d1_d, HIGH);
    digitalWrite(d1_f, HIGH);
  }
  
  delay(1);
    
}
