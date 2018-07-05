@echo off
(
echo e100
echo 0F B6 0E 80 00 E3 4F BF 81 00 B0 20 FC F3 AE 74
echo e110
echo 45 E3 43 8A 45 FF E8 43 00 80 3D 20 74 0E C0 E0
echo e120
echo 04 8A E0 8A 05 E8 34 00 0A C4 47 49 E3 28 32 E4
echo e130
echo 50 B0 22 F2 AE 75 1F E3 1D 8B F7 8B D1 F2 AE 75
echo e140
echo 01 41 2B D1 74 10 8B CA 5B B0 20 B4 09 CD 10 AC
echo e150
echo B4 0E CD 10 E2 F9 32 C0 B4 4C CD 21 3C 61 72 02
echo e160
echo 2C 20 3C 41 72 02 2C 07 2C 30 C3
echo rcx
echo 6b
echo w
echo q
) | debug colormsg.com > nul