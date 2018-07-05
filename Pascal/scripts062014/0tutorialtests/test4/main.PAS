program main; uses crt;
var
   a : integer;
   nazov_cisla : string;
begin

writeln('Napiste cislo od 0 do 10 a ja vam vypisem jeho nazov po Slovensky:');readln(a);
if a = 0 then nazov_cisla := 'nula';
if a = 1 then nazov_cisla := 'jeden';
if a = 2 then nazov_cisla := 'dva';
if a = 3 then nazov_cisla := 'tri';
if a = 4 then nazov_cisla := 'styri';
if a = 5 then nazov_cisla := 'pat';
if a = 6 then nazov_cisla := 'sest';
if a = 7 then nazov_cisla := 'sedem';
if a = 8 then nazov_cisla := 'osem';
if a = 9 then nazov_cisla := 'devat';
if a = 10 then nazov_cisla := 'desat';

writeln();
writeln('Vase cislo je : ', nazov_cisla);
writeln();

readln(); //wait for enter


end.
