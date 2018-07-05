program main; uses crt;
var
   a : integer;
   b : integer;
begin

a := 0;
b := 0;

writeln();
write('A : ');read(a);
writeln();
write('B : ');read(b);
writeln();

writeln();
writeln('A = ', a);
writeln('B = ', b);
writeln();
writeln('A + B = ', a, ' + ', b, ' = ', a + b);
writeln();

repeat until keypressed;
end.
