#define s_enable 5
#define s_load 2
#define s_clock 3
#define s_data 4

#define dw digitalWrite

byte inReg();

void setup() {
  pinMode(s_enable, OUTPUT);
  pinMode(s_load, OUTPUT);
  pinMode(s_clock, OUTPUT);
  pinMode(s_data, INPUT);

  dw(s_load, HIGH);
  dw(s_enable, HIGH);

  Serial.begin(9600);
}

void loop() {

  bool a = (  inReg() & 0b10000000  ) > 0;

  Serial.println(a);
  
}

byte inReg() {

  dw(s_load, LOW);
  delayMicroseconds(5);
  dw(s_load, HIGH);
  delayMicroseconds(5);

  dw(s_clock, HIGH);
  dw(s_enable, LOW);
  byte data = shiftIn(s_data, s_clock, MSBFIRST);
  dw(s_enable, HIGH);

  return data;
  
}

