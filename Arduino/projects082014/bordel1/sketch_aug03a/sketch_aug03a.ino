/* USING EXTERNAL EDITOR */
/* Copyright Sebohacker 2014 */
#define dw digitalWrite
#define dr digitalRead
#define aw analogWrite
#define ar analogRead
#define dl delay
#define pm pinMode

int a = 0b10;

void setup()
{
	pm(13, 1);
	Serial.begin(9600);
	
}

void loop()
{
	a << 40;
	Serial.println(a);
}
