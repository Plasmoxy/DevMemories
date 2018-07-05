# -*- coding: utf-8 -*-
from Tkinter import *

frameWidth = input("Enter your window Width...");
frameHeight = input("Enter yout window Height...");

root = Tk()

def key(event):
    print "pressed", repr(event.char)

def callback(event):
    frame.focus_set()
    print "clicked at", event.x, event.y
    
    ruller1.place(x=event.x, y=event.y)
    ruller2.place(x=event.x, y=(event.y + 15))

frame = Frame(root, width=frameWidth, height=frameHeight)

ruller1 = Label(root, text="000000000111111111122222222223");
ruller2 = Label(root, text="123456789012345678901234567890");

ruller1.pack()
ruller2.pack()

frame.bind("<Key>", key)
frame.bind("<Button-1>", callback)
frame.pack()

root.mainloop()
