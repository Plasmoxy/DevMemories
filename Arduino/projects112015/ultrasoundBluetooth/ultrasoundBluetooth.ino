#include <SoftwareSerial.h>

SoftwareSerial blue(5, 6);

#define trigPin 8
#define echoPin 9
#define led 5

bool ledState = 0;

void setup() {
  blue.begin(19200);
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  pinMode(led, OUTPUT);
}

void loop() {
  long duration, distance;
  digitalWrite(trigPin, LOW);  // Added this line
  delayMicroseconds(2); // Added this line
  digitalWrite(trigPin, HIGH);
//  delayMicroseconds(1000); - Removed this line
  delayMicroseconds(10); // Added this line
  digitalWrite(trigPin, LOW);
  duration = pulseIn(echoPin, HIGH);
  distance = (duration/2) / 29.1;

  

  if ( distance < 20 && distance > 2) {

    if ( !ledState ) {
      ledState = 1;
      blue.write(61);
      delay(500);
    } else {
      ledState = 0;
      blue.write(60);
      delay(500);
    }
    
  }
  
  delay(1);
} 
