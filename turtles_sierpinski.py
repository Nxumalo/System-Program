#import tkinter
import turtle
import math
import time

# defining a global variable h = sqrt(3) / 2, because we will use this constant repeatedly
h = math.sqrt(3)/2


######################
# function definitions
######################

def draw_square(length):
	mt = turtle.Turtle()
	for i in range(4):
		mt.forward(length)
		mt.left(90)


def draw_one_triangle(x, y, length, turtle, heading):
		# this funtion uses the said turtle to draw one single triangle starting at point
		# (x,y) with the given heading. During the drawing, it will rotate to the left.
		turtle.penup()
		turtle.goto(x,y)
		turtle.setheading(heading) # 0 is east, 90 is north
		turtle.pendown()
		for i in range(3):
				turtle.forward(length)
				turtle.left(120) # that is 180 (flat angle) - 60 (internal angle)



def draw_triangle(origin_x, origin_y, size):
	# draws the Sierpinski triangle
	global h
	if size <= 2:
		return
	else:
		mt = turtle.Turtle()
		mt.penup()
		# optimizing speed
		mt.hideturtle()
		mt.speed(0)

		mt.pensize(1)
		mt.color("blue")
		mt.setpos(origin_x, origin_y) # this is the lower left corner of the triangle
		mt.pendown()
		for i in range(3):
			mt.forward(size)
			mt.left(120)
		mt.penup()
		next_size = size / 2
		draw_triangle(origin_x, origin_y, next_size)
		draw_triangle(origin_x + next_size, origin_y, next_size)
		draw_triangle(origin_x + next_size / 2, origin_y + h * next_size, next_size)


# instead of the above, we can also draw only the reversed triangle defining the area "C":
def draw_sierpinski_inner(origin_x, origin_y, size, myturtle):
	global h
	# instead of drawing the big outer triangle, we draw the inner, reversed pyramid
	if size <= 4:
		return	# such a return statement with no return value simply exits the function, returning None
	else:
		# optimizing speed
		myturtle.hideturtle()
		myturtle.speed(0)
		# setting some attributes
		myturtle.pensize(1)
		myturtle.color("blue")
		next_size = size / 2 # the edge length of any of the triangles A, B, C or D
		origin_D_x = origin_x + next_size # this is the x coordinate of the point origin_D 
		draw_one_triangle(origin_D_x, origin_y, next_size , myturtle, 60) # drawing C
		draw_sierpinski_inner(origin_x, origin_y, next_size, myturtle)
		draw_sierpinski_inner(origin_D_x, origin_y, next_size, myturtle)
		draw_sierpinski_inner(origin_x + next_size / 2, origin_y + h * next_size, next_size, myturtle)





def draw_sp_square(origin_x, origin_y, size):
	# just to play with, an alternate fractal figure based on squares rather than triangles
	if size <= 2:
		return
	else:
		mt = turtle.Turtle()
		mt.penup()
		# optimizing speed
		mt.hideturtle()
		mt.speed(1200)

		mt.pensize(1)
		mt.color("blue")
		mt.setpos(origin_x, origin_y) # this is the lower left corner of the square
		mt.pendown()
		for i in range(4):
			mt.forward(size)
			mt.left(90)
		mt.penup()
		next_size = size / 3
		draw_sp_square(origin_x, origin_y, next_size)
		draw_sp_square(origin_x + next_size, origin_y, next_size)
		draw_sp_square(origin_x + 2 * next_size, origin_y, next_size)
		draw_sp_square(origin_x, origin_y + next_size, next_size)
		draw_sp_square(origin_x + 2 * next_size, origin_y + next_size, next_size)
		draw_sp_square(origin_x, origin_y + 2 * next_size, next_size)
		draw_sp_square(origin_x + next_size, origin_y + 2 * next_size, next_size)
		draw_sp_square(origin_x + 2 * next_size, origin_y + 2 * next_size, next_size)



########################################
# toplevel code for test/output purposes
########################################

wn = turtle.Screen()
print('turtle.screensize: {}'.format(wn.screensize()))
#wn.bgcolor("lightgreen")
wn.title('''Sierpinski's triangle''')
wn.delay(0)
wn.tracer(100,0)

t1 = time.time()
#draw_triangle(-300,-200,500)
t2 = time.time()
wn.clear() # clear screen, erasing all graphics so far
tt = turtle.Turtle() # the turtle we are going to use in the following
t3 = time.time()
#draw_sierpinski_inner(300, -200, 500, tt)
draw_sp_square(-200,-200,500)
draw_square(200)
wn.mainloop() # to keep the window open



