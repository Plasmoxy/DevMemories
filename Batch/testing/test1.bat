@echo off
goto:start
		::Here Starts Function Defenition
:myFunc
echo Ahoj %~1 !
goto:eof

:dafuq
echo Fuck you %~1 !!!
goto:eof

:start		::Here Starts The Script

echo Executing function:
call:myFunc "Sebo"
call:dafuq "Peto"
