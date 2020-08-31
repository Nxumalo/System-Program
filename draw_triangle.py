#Question 1

import turtle
wn=turtle.Screen()
wn.bgcolor("red")
def draw_square(length):
    mt = turtle.Turtle()
    for i in range(4):
        mt.forward(length)
        mt.left(90)
    return mt
print(draw_square(100))

#Question 2

import turtle
wn=turtle.Screen()
wn.bgcolor("cyan")
def draw_triangle(length):
        shape= turtle.Turtle()
        for i in range(3):
            shape.forward(length)
            shape.left(120)
        return shape
print(draw_triangle(100))

#Question 3

import turtle
wn=turtle.Screen()
wn.bgcolor("cyan")
def draw_triangle(length):
        shape= turtle.Turtle()
        for i in range(5):
            shape.forward(length)
            shape.left(120)
        for i in range(3):
            shape.forward(length+length)
            shape.left(120)
        shape.forward(length+length)
        shape.left(120)
        for i in range(3):
            shape.forward(length)
            shape.left(120)
        shape.forward(length)
        for i in range(3):
            shape.forward(length)
            shape.left(120)
            
        return shape
print(draw_triangle(100))
