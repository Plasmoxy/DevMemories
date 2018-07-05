# -*- coding: utf-8 -*-
from Tkinter import *

class App:

    def __init__(self, master):

        frame = Frame(master)
        frame.pack()

        self.button = Button(frame, text="KONEC", fg="red", command=master.destroy)
        self.button.pack(side=LEFT)

        self.hi_there = Button(frame, text="Pozdrav!", command=self.rekni_ahoj)
        self.hi_there.pack(side=LEFT)

    def rekni_ahoj(self):

        print u'Ahoj všici!'


if __name__=="__main__":

    root = Tk()
    app = App(root)
    root.mainloop()
