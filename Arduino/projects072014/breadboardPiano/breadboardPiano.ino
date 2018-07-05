#include "pitches.h"

#define stupnica_cdur NOTE_C4, NOTE_D4, NOTE_E4, NOTE_F4, NOTE_G4, NOTE_A4, NOTE_B4, NOTE_C5
#define stupnica_amol NOTE_A4, NOTE_B4, NOTE_C5, NOTE_D5, NOTE_E5, NOTE_F5, NOTE_GS5, NOTE_A5

int sp = 9;
int c=10, d=2, e=4, f=3, g=5, a=6, h=8, c2=7;

int cButton, dButton, eButton, fButton, gButton, aButton, hButton, c2Button = 0;

int notes[] = {stupnica_cdur};

void setup()
{
  Serial.begin(9600);
  pinMode(sp, 0);
  pinMode(c, 1);
  pinMode(d, 1);
  pinMode(e, 1);
  pinMode(f, 1);
  pinMode(g, 1);
  pinMode(a, 1);
  pinMode(h, 1);
  pinMode(c2, 1);
}

void loop()
{
  cButton = digitalRead(c);dButton = digitalRead(d);eButton = digitalRead(e);
  fButton = digitalRead(f);gButton = digitalRead(g);aButton = digitalRead(a);
  hButton = digitalRead(h);c2Button = digitalRead(c2);
  
  //#begin button detection and plaing tones
  
  if (cButton == 1)
  {
    tone(sp, notes[0]);
    while(cButton != 0)
    {
      cButton = digitalRead(c);
    }
    noTone(sp);
  } else if (dButton == 1)
  {
    tone(sp, notes[1]);
    while(dButton != 0)
    {
      dButton = digitalRead(d);
    }
    noTone(sp);
  } else if (eButton == 1)
  {
    tone(sp, notes[2]);
    while(eButton != 0)
    {
      eButton = digitalRead(e);
    }
    noTone(sp);
  } else if (fButton == 1)
  {
    tone(sp, notes[3]);
    while(fButton != 0)
    {
      fButton = digitalRead(f);
    }
    noTone(sp);
  } else if (gButton == 1)
  {
    tone(sp, notes[4]);
    while(gButton != 0)
    {
      gButton = digitalRead(g);
    }
    noTone(sp);
  } else if (aButton == 1)
  {
    tone(sp, notes[5]);
    while(aButton != 0)
    {
      aButton = digitalRead(a);
    }
    noTone(sp);
  } else if (hButton == 1)
  {
    tone(sp, notes[6]);
    while(hButton != 0)
    {
      hButton = digitalRead(h);
    }
    noTone(sp);
  } else if (c2Button == 1)
  {
    tone(sp, notes[7]);
    while(c2Button != 0)
    {
      c2Button = digitalRead(c2);
    }
    noTone(sp);
  }
  //end /@/

  
  

  //Serial.println((String)cButton + (String)dButton + (String)eButton + (String)fButton + (String)gButton + (String)aButton + (String)hButton + (String)c2Button );
  //delay(500);
}

