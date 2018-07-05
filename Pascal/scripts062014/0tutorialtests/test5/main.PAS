program main; uses crt; //deklaracia programu a import kniznice crt

function scitaj(a : longint; b : longint) : integer; // function %nazov_finkcie%(%parameter% : %typ_parametru%{;%parameter% : %typ_parametru%}) : %typ_vystupu_funkcie%;
begin //begin funkcie
     Result := a + b; // premenna Result je vystup (napriklad v C to je return)
end; // end funkcie




begin

writeln(scitaj(999999999, 1)); // pouzita funkcia vo vypisovacej funkcii


repeat until keypressed;
end.
