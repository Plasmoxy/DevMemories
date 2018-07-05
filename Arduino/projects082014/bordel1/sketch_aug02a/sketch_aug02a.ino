/* USING EXTERNAL EDITOR */
/* Copyright Sebohacker 2014 */
#define dw digitalWrite
#define dl delay
#define pm pinMode

int a = 0;
void setup()
{
  Serial.begin(9600);
  pm(13, 1);
}

void loop()
{
  a = analogRead(A0);
  if (a > 1012 && a < 1015)
  {
	dw(13, 1);
  }
  if (a > 510 && a < 515)
  {
	dw(13, 0);
  }
}
