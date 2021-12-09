import math
import turtle


# SECTION 1 of the practical: arbitrary polygons (most generic class)

class Polygon:

		unit = 'cm'
		deg = math.pi / 180 # class variable, to convert from degrees into radians
		rad = 180 / math.pi # class variable, to convert from radians into degrees

		def __init__(self, edge_lengths, angles_rotate):
				self.edge_lengths = edge_lengths
				self.angles_rotate = angles_rotate
				self.num_edges = len(edge_lengths)
				if self.num_edges != len(angles_rotate):
						print("Warning! Initialising a Polygon object from lists of different lengths!")

		def __str__(self):
				return "Polygon with {0} edges, mean edge length: {1}{2}".format(self.num_edges, self.mean_edge_length(), Polygon.unit)

		def get_number_edges(self): # mere accessor function
				return self.num_edges

		def is_regular(self): # comparing to the first elements of the two lists (one of the many possible solutions)
				for i in range(1, self.num_edges):
						if self.edge_lengths[i] != self.edge_lengths[0] or self.angles_rotate[i] != self.angles_rotate[0]:
								return False
				return True

		def mean_edge_length(self):
				sum_lengths = 0
				for length in self.edge_lengths: # iterating directly on the elements in the list
						sum_lengths += length
				return sum_lengths/self.num_edges

		def is_larger(self, other):
				return self.mean_edge_length() > other.mean_edge_length() # this expression evaluates into a boolean

		def draw(self, t, colour, thickness, left):
				# we can use negative angles to turn right and positive angles to turn left (the standard orientation for angles in Python):
				if left:
						angle_multiplier = 1
				else:
						angle_multiplier = -1
				t.pencolor(colour)
				t.pensize(int(thickness)) # conversion to int just in case the user would provide a float
				t.pendown() # to make sure the pen is down

				# and let's draw without further ado from the current position of the turtle t:
				for i in range(self.num_edges):
						t.forward(self.edge_lengths[i])
						t.left(angle_multiplier * self.angles_rotate[i])

		# done for the section 1.1 of the question paper


		def get_vertices_coordinates(self, left):

				# positive angles turn left, negative angles turn right
				if left:
						angle_multiplier = 1
				else:
						angle_multiplier = -1
				
				output_list = [[0,0]] # a list of lists containing only one element: the list made of the coordinates (0,0) (initial point)
				heading = 0
				x = 0
				y = 0

				for i in range(self.num_edges):
						length = self.edge_lengths[i]
						heading_rad = heading * Polygon.deg
						x += length * math.cos(heading_rad)
						y += length * math.sin(heading_rad)
						output_list.append([x,y])
						heading += self.angles_rotate[i] * angle_multiplier

				return output_list # pay attention that's a list of length (n+1), enabling to check if first and last points are equal


		def closed_polygon(self):
				vertices =  self.get_vertices_coordinates(True)
				# the first point is always at coordinates (0,0)
				last_vertex = vertices[-1] # syntactic sugar, equivalent to coords[len(coords)-1]
				acceptable_error = 1e-6 # the acceptable error on each coordinate. More or less arbitrary value.
				return math.fabs(last_vertex[0]) <= acceptable_error and math.fabs(last_vertex[1]) <= acceptable_error


		def square_dist(self, point1, point2):
				# calculates the square of the Euclidean distance between two given points.
				# the two arguments point1 and point2 are two lists of two values each (x and y coordinate)
				return (point1[0] - point2[0]) ** 2 + (point1[1] - point2[1]) ** 2

		def get_diameter(self):
				vertices =  self.get_vertices_coordinates(True) # doesn't matter here to "draw" with left or right turns
				sq_dia = 0
				# a little bit of extra care: as the polygon is not necessarily closed, we consider one more vertex than there are edges
				n = len(vertices)

				# we are going to test the square distances between two vertices, for this we are going to use 
				# the auxiliary function square_dist that is defined above.
				# We choose to compare squares of distances rather than the distances themselves to spare us the calculation of the root:
				# as the root function is everywhere increasing, that makes no difference.
				for i in range(n):
						for j in range(i+1, n):
								# no need to calculate the distance between vertex j and vertex i
								# when we have already calculated it between vertex i and vertex j:
								# distances are symmetric
								sq_dist = self.square_dist(vertices[i],vertices[j]) 
								if sq_dist > sq_dia:
										sq_dia = sq_dist
										index_vertex1 = i
										index_vertex2 = j # storing the indices of the two vertices

				# at the end, we return the list made of these three elements:
				return [index_vertex1, index_vertex2, math.sqrt(sq_dia)]
						

		def draw_circumscribed_circle(self, t, colour, thickness, left):
				# last argument is a boolean, I forget it in the question paper, sorry
				# reading the help of the turtle module, we see we can use the Turtle.circle() function. But we first have to move
				# the turtle to the center of the circle, and then right by the same value as the radius
				vertexlist = self.get_vertices_coordinates(left)
				diameter_info = self.get_diameter() # a bit of redundancy because he there is also a call to get_vertices_coordinates included

				point1 = vertexlist[diameter_info[0]]
				point2 = vertexlist[diameter_info[1]]
				radius = diameter_info[2] / 2 # half the diameter
				center = [(point1[0] + point2[0])/2, (point1[1] + point2[1])/2] # the midpoint

				t.pencolor(colour)
				t.pensize(int(thickness)) # conversion to int just in case the user would provide a float


				t.penup() # preparing to move without drawing
				# WARNING! Contrary to what the online help says, Turtle.circle starts drawing at a distance of <radius> units BELOW the center
				# of the circle (NOT "left" or "right"), and that's where one has to bring the turtle before the drawing starts:
				t.goto(center[0],center[1]-radius)
				t.setheading(0) # I found out it is important to do that, otherwise we don't get the result we want
				t.pendown() # to down the pen before we draw
				t.circle(radius)




# SECTION 2: the derived class for regular convex polygons

class RegularPolygon(Polygon):
		def __init__(self, num_edges, edge_len):
				lengths = [] 
				angles = []
				rotate_angle_value = 360 / num_edges # that's the angle by which to rotate at each vertex
				for i in range(num_edges):
						lengths.append(edge_len)
						angles.append(rotate_angle_value)
				# and finally we call the constructor of the base class with the appropriate arguments calculated above:
				Polygon.__init__(self, lengths, angles)


		def get_area(self):
				n = self.num_edges
				l = self.edge_lengths[0]
				return n*l*l / (4*math.tan(math.pi/n))


		def is_regular(self):
				return True # yes, of course!

		def __str__(self):
				return "Regular polygon with {0} edges (edge length: {1}, inner angles: {2})".format(self.num_edges, self.edge_lengths[0],
								180 - self.angles_rotate[0])

		def get_diameter(self):
				vertices =  self.get_vertices_coordinates(True)
				# for a regular polygon with even number of edges (and thus vertices) n, the max distance between two vertices
				# is simply the distance between the vertex of index 0 and the vertex of index n/2 = n//2 (for Python to produce an integer).
				# And in case the polygon has an odd number of edges, the max distance between two vertices is for instance the
				# distance between the vertex of index 0 and the one of index (n-1)/2 = n//2 or the distance between the vertex of index 0
				# and the vertex of index (n+1)/2. So the following works whatever the oddity of the number of edges, the following is correct:
				useful_index = self.num_edges // 2
				return [ 0, useful_index, math.sqrt(self.square_dist(vertices[0], vertices[useful_index])) ]


		def draw_circumscribed_circle(self, t, colour, thickness, left):
				# BEWARE! in case of even number of edges, self.get_diameter() will provide us with the correct information for the
				# true circumscribed circle. But in case of an odd number of edges, we have to do a bit more work if we truly want
				# to get the true circumscribed circle
				# (see on a piece of paper what happens with an equilateral triangle).
				vertexlist = self.get_vertices_coordinates(left)
				if self.num_edges % 2 == 0:
						inputlist = self.get_diameter()
						point1 = vertexlist[inputlist[0]]
						point2 = vertexlist[inputlist[1]]
						radius = inputlist[2] / 2 # half the diameter
						center = [(point1[0] + point2[0])/2, (point1[1] + point2[1])/2] # the midpoint
				else:
						if left:
								multiplier = 1
						else:
								multiplier = -1
						# we get the formula for the circumradius from https://en.wikipedia.org/wiki/Regular_polygon#Circumradius
						radius = self.edge_lengths[0] / (2 * math.sin(math.pi/self.num_edges))
						# and for the equally useful "apothem", we read: https://en.wikipedia.org/wiki/Apothem
						apothem = self.edge_lengths[0] / (2 * math.tan(math.pi/self.num_edges))
						center = [ self.edge_lengths[0] / 2, multiplier * apothem ] # because origin of the first edge is (0,0)

				# at this point we know the values for the center and the radius, so we continue
				# as in the draw_circ... method from the base class Polygon:
				t.pencolor(colour)
				t.pensize(int(thickness)) # conversion to int just in case the user would provide a float
				t.penup() # preparing to move without drawing

				# WARNING! Contrary to what the online help says, Turtle.circle starts drawing at a distance of <radius> units BELOW the center
				# of the circle (NOT "left" or "right"), and that's where one has to bring the turtle before the drawing starts:
				t.goto(center[0],center[1]-radius)
				t.setheading(0) # I found out it is important to do that, otherwise we don't get the result we want
				t.pendown() # to down the pen before we draw
				t.circle(radius)




# SECTION 3: TRIANGLES

class Triangle(Polygon):
		# we don't redefine the constructor method: will use the one from Polygon
		def __str__(self):
				e = self.edge_lengths # just an alias to speed up code writing
				return "Triangle with edges {0}, {1} and {2}".format(e[0], e[1], e[2])

		def get_height(self):
				# base is the first edge, so a little bit of trigonometry leads to:
				base = self.edge_lengths[0]
				h = base/2 * math.tan((180 - self.angles_rotate[0]) * Polygon.deg)
				return h

		def get_area(self):
				h = self.get_height()
				base = self.edge_lengths[0]
				return base*h/2


# TOPLEVEL: TESTS


window = turtle.Screen()
myturtle = turtle.Turtle()




mysquare = Polygon([100,100,100,100],[90,90,90,90])
print(mysquare)
mysquare.draw(myturtle,"red",2,left=True)
print(mysquare.get_vertices_coordinates(True))
print(mysquare.closed_polygon())


angle1 = 180/math.pi * math.asin(0.8)
angle2 = 180/math.pi * math.acos(0.8)
triangle_right = Polygon([400,300,500],[90, 180-angle1, 180-angle2])
print(triangle_right.get_vertices_coordinates(True))
print(triangle_right.closed_polygon())
triangle_right.draw(myturtle,"red",2,left = True)

triangle_right.draw_circumscribed_circle(myturtle, "black", 1, True)
mysquare.draw_circumscribed_circle(myturtle, "black", 1, True)
#square2 = RegularPolygon(4,30)
#print(square2)

myturtle.penup()
myturtle.goto(0,0)
myturtle.setheading(0) # kind of resetting the turtle before the next series of drawings

crazypoly = Polygon([120,66,25,21,110,56,233],[25,33,66,54,89,120,80])
crazypoly.draw(myturtle,"blue",2,True)
crazypoly.draw_circumscribed_circle(myturtle, "black", 1, True)

t = turtle.Turtle() # a new one, at (0,0)
penta = RegularPolygon(5,120)
penta.draw(t,"green",2,False)
penta.draw_circumscribed_circle(t, "green", 1, False)


equi1 = RegularPolygon(3,30) # equilateral triangle with edge length 30
equi2 = Triangle([30,30,30],[120,120,120]) # same polygon in fact

print("area1:", equi1.get_area())
print("area2:", equi2.get_area())

window.mainloop()
