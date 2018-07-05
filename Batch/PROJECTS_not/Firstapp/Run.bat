@echo off
color b
echo Firstapp (Sebohacker 2013)
pause
cls
echo This is my first menu app !!! :-)
pause
cls
echo Menu:
echo 1.Open first file
echo 2.Open second file
echo 3.Open third file
echo 4.Exit app
echo ________________________________________________________________
set /p option=Press a/b/c/d key (next press enter) to select your option :
echo  
if %option%== a goto 1
if %option%== b goto 2
if %option%== c goto 3
if %option%== d goto 4
:1
start $system/$system.file1.bat
exit
:2
call $system/$system.file2.bat
exit
:3
call $system/$system.file3.bat
:4
exit

