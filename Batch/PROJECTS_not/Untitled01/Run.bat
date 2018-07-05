@echo off
cls
color 4
:start
echo ==Sebohacker's Menu App 2==
echo. 
echo Menu
echo.
echo a.Open file
echo b.Exit Application
echo.
echo press a/b key (next press enter) to select your option
echo.
set /p opt=Option:
if %opt%== a goto 1
if %opt%== b goto 2
:1
call bin/filea.bat
exit
:2
exit