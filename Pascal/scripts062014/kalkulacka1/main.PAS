program main; uses crt;

var a : integer;
var b : integer;
var vysledok : integer;

begin
a := 0;b := 0; vysledok := 0;

writeln('Napiste prve cislo: '); read(a);
writeln('Napiste druhe cislo: '); read(b);

vysledok := a + b;

writeln();writeln('Vysledok : ');write(vysledok);

repeat until keypressed;

end.
