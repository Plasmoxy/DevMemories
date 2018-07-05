@echo off

cls
color 0A


echo ---Kalkulacka---  (Sebastian Petrik) ... Made in batch
echo.
echo.

:: Inputs

set/p a="Prve cislo : "
set/p b="Druhe cislo : "

echo.&echo.

:: Other


set/a plus=( a + b )
set/a minus=( a - b )
set/a multi=( a * b )
set/a divide=( a / b )
set/a modulo=( a %% b )

echo %a% + %b% = %plus%
echo %a% - %b% = %minus%
echo %a% * %b% = %multi%
echo %a% / %b% = %divide% zvysok %modulo%

echo.&echo.

echo Stlacte hocijaky klaves pre ukoncenie.
pause>nul

cls
color 07