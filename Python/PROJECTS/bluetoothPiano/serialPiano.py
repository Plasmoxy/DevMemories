#python27

import serial, time
import pygame.midi

pygame.midi.init();

p = pygame.midi.Output(2);

s = serial.Serial("/dev/rfcomm0");

vel = 64;

a_mol = (57, 60, 64)
a_mol_on = False
f_dur = (57, 60, 65)
f_dur_on = False
d_mol = (57, 62, 65)
d_mol_on = False
e_mol_4 = (47, 52, 55, 59)
e_mol_4_on = False
g_dur_4 = (50, 55, 59, 62)
g_dur_4_on = False
a_dur_4 = (52, 57, 61, 64)
a_dur_4_on = False
c_dur_4 = (55, 60, 64, 67)
c_dur_4_on = False

def notesOn(notes, velocity) :
	for note in notes :
		p.note_on(note, velocity)
	#end for
def notesOff(notes, velocity) :
	for note in notes :
		p.note_off(note, velocity)
	#end for
#end defs

try :
	while (1) :
		s.write(chr(0x99));buttons = s.read(4);
		# BUTTON 1
		if buttons[0] == chr(0x0A) :
			if not e_mol_4_on :
				print "e_mol_4 ON"
				notesOn(e_mol_4, vel);
				e_mol_4_on = True
		if buttons[0] == chr(0x0B) :
			if e_mol_4_on :
				print "e_mol_4 OFF"
				notesOff(e_mol_4, vel);
				e_mol_4_on = False
		# BUTTON 2
		if buttons[1] == chr(0x0A) :
			if not g_dur_4_on :
				print "g_dur_4 ON"
				notesOn(g_dur_4, vel);
				g_dur_4_on = True
		if buttons[1] == chr(0x0B) :
			if g_dur_4_on :
				print "g_dur_4 OFF"
				notesOff(g_dur_4, vel);
				g_dur_4_on = False
		# BUTTON 3
		if buttons[2] == chr(0x0A) :
			if not a_dur_4_on :
				print "a_dur_4 ON"
				notesOn(a_dur_4, vel);
				a_dur_4_on = True
		if buttons[2] == chr(0x0B) :
			if a_dur_4_on :
				print "a_dur_4 OFF"
				notesOff(a_dur_4, vel);
				a_dur_4_on = False
		# BUTTON 4
		if buttons[3] == chr(0x0A) :
			if not c_dur_4_on :
				print "c_dur_4 ON"
				notesOn(c_dur_4, vel);
				c_dur_4_on = True
		if buttons[3] == chr(0x0B) :
			if c_dur_4_on :
				print "c_dur_4 OFF"
				notesOff(c_dur_4, vel);
				c_dur_4_on = False
		#end ifs
	#end while
except (KeyboardInterrupt) :
	print "KeyboardInterrupt catched"
	pygame.midi.quit();
	s.close();
	exit();
#end try
