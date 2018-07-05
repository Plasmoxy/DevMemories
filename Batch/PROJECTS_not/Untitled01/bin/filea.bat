@echo off
cls
echo File A
echo ========
echo.
echo Ta isla babka
echo po pusti, spadla
echo do mora a
echo utopila sa! hahaha!
echo.
pause
echo Want you go to main menu ? [y{es}/n{o}]
echo.
set /p opt2=Option: 
pause>nul
if %opt2%== y goto 1
if %opt2%== n goto 2
1:
call ../Run.bat
exit
2:
exit