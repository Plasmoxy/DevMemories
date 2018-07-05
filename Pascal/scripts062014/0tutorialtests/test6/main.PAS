program main;
uses crt, graph;
var
   ovladac, grafmod: smallint;

begin

Sound(4000);
{zacni vydavat zvuk s frekvenciou 4000 Hz}

Delay(2000);
{pockaj 2 sekundy}

NoSound;
{prestan vyludzovat to hrozne pipanie}

repeat until keypressed;
end.
