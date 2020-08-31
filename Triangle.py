import math
import turtle
turtle.Screen()
def tri(l):
        for t in range(3):
                turtle.forward(l)
                turtle.left(120)
def Sep(l,x,y):
        turtle.penup()
        if l<10:
                return
        turtle.goto(x,y)
        turtle.pendown()
        tri(l)
        Sep(l/2,x,y)
        Sep(l/2,x+l/2,y)
        Sep(l/2,math.cos(math.radians(120)*l/2,y+math.sin(math.radians(120)*l/2)))
turtle.delay(0)
Sep(200,10,10)
