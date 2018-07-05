
int trigPin = 6;    //Trig - green Jumper
int echoPin = 7;    //Echo - yellow Jumper
long duration;

int pulseInTimeout = 1350;
int pulseInTimeoutOverflow = 326;

char DATA = 0;
 
void setup() {
  //Serial Port begin
  Serial.begin (9600);
  //Define inputs and outputs
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
}
 
void loop()
{
 
  // The sensor is triggered by a HIGH pulse of 10 or more microseconds.
  // Give a short LOW pulse beforehand to ensure a clean HIGH pulse:
  digitalWrite(trigPin, LOW);
  delayMicroseconds(5);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
 
  // Read the signal from the sensor: a HIGH pulse whose
  // duration is the time (in microseconds) from the sending
  // of the ping to the reception of its echo off of an object.
  pinMode(echoPin, INPUT);
  duration = pulseIn( echoPin, HIGH, (pulseInTimeout + pulseInTimeoutOverflow)*2)/2;
 
  //Serial.println(duration);

  
  if ( duration > 100 && duration < 300 ) {
    DATA = 0;
  }

  while (Serial.available() > 0) {
    if (Serial.readStringUntil(';') == "S") {
      Serial.println(DATA);
    }
  }
  
  
}
