@echo off
title CMD // Camera Speed Calculator // hit Ctrl+C to Exit
:start
cls
python pysrc/cameraSpeedCalculatorProgram.py
pause
goto start
@echo on