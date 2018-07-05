String serialInput;

int a = 12;
int b = 8;
int c = 11;
int d = 7;
int e = 6;
int f = 9;
int g = 5;
int dp = 10;

void setup() {
  pinMode(a, OUTPUT);
  pinMode(b, OUTPUT);
  pinMode(c, OUTPUT);
  pinMode(d, OUTPUT);
  pinMode(e, OUTPUT);
  pinMode(f, OUTPUT);
  pinMode(g, OUTPUT);
  pinMode(dp, OUTPUT);
  Serial.begin(9600);
}
void loop() {
  if (Serial.available() > 0) {
    serialInput = Serial.readStringUntil('\n');
    if (serialInput.charAt(0) == '1') {
      digitalWrite(a, HIGH);
    } else if (serialInput.charAt(0) == '0') {
      digitalWrite(a, LOW);
    }
    if (serialInput.charAt(1) == '1') {
      digitalWrite(b, HIGH);
    } else if (serialInput.charAt(1) == '0') {
      digitalWrite(b, LOW);
    }
    if (serialInput.charAt(2) == '1') {
      digitalWrite(c, HIGH);
    } else if (serialInput.charAt(2) == '0') {
      digitalWrite(c, LOW);
    }
    if (serialInput.charAt(3) == '1') {
      digitalWrite(d, HIGH);
    } else if (serialInput.charAt(3) == '0') {
      digitalWrite(d, LOW);
    }
    if (serialInput.charAt(4) == '1') {
      digitalWrite(e, HIGH);
    } else if (serialInput.charAt(4) == '0') {
      digitalWrite(e, LOW);
    }
    if (serialInput.charAt(5) == '1') {
      digitalWrite(f, HIGH);
    } else if (serialInput.charAt(5) == '0') {
      digitalWrite(f, LOW);
    }
    if (serialInput.charAt(6) == '1') {
      digitalWrite(g, HIGH);
    } else if (serialInput.charAt(6) == '0') {
      digitalWrite(g, LOW);
    }
    if (serialInput.charAt(7) == '1') {
      digitalWrite(dp, HIGH);
    } else if (serialInput.charAt(7) == '0') {
      digitalWrite(dp, LOW);
    }
  }
  delay(1);
}
