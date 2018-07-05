extern _printf

section .data
	msg db 'Hello, World!', 0
section .bss
section .text
global _WinMain@16

_WinMain@16:
	push msg
	call _printf
ret 16