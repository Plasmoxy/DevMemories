# -*- coding: utf-8 -*-
from Tkinter import *


def buttonAonclick() :
    text1.pack(side = BOTTOM)
#end def

    

root = Tk()
root.minsize(320, 240)
root.title("test2.py")
#root.iconbitmap("")

ramHorny = Frame(root)
ramDolny = Frame(root)
text1 = Label(ramDolny, text="TOTO VYPISAL BUTTON")

ramHorny.pack(side=TOP)
ramDolny.pack(side=BOTTOM)

tlacidlo1 = Button(ramHorny, text="ZOBRAZ TEXT !", command=buttonAonclick)
tlacidlo1.pack(side="left");





root.mainloop()
