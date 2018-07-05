from PIL import Image
import ImageDraw
import sys

im = Image.open("les.JPG")

draw = ImageDraw.Draw(im)
draw.line((0, 0) + im.size, fill=128)
draw.line((0, im.size[1], im.size[0], 0), fill=128)
del draw

# write to stdout
im.save("ss.jpg", "JPEG")