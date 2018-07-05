from Tkinter import *
global xpos
global ypos
xpos = 30
ypos = 0
root = Tk()
root.minsize(200, 200)
text = Label(root, text="CUS")

text.pack()

def key(event) :
    global ypos
    global ypos
    if event.keysym == 's':
        ypos = ypos + 3
    if event.keysym == 'w':
        ypos = ypos - 3
    #end
#end

root.bind("<KeyPress>",key)

text.place(x=xpos, y=ypos)

root.mainloop()
